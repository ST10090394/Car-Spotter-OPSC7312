package com.example.carspotteropsc7312poe.settings

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.carspotteropsc7312poe.DashboardActivity
import com.example.carspotteropsc7312poe.R
import com.example.carspotteropsc7312poe.location.MapboxActivity
import java.util.*

class SettingsActivity : AppCompatActivity() {

    private lateinit var languageSpinner: Spinner
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        preferences = getSharedPreferences("language_prefs", MODE_PRIVATE)

        // Initialize buttons
        val dashboardButton = findViewById<Button>(R.id.btn_dashboard)
        val mapButton = findViewById<Button>(R.id.btn_map_settings)
        languageSpinner = findViewById(R.id.spinner_language)

        // Set up the language spinner
        setupLanguageSpinner()

        // Set button listeners
        dashboardButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        mapButton.setOnClickListener {
            val intent = Intent(this, MapboxActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupLanguageSpinner() {
        val languageOptions = resources.getStringArray(R.array.language_options)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languageOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        languageSpinner.adapter = adapter

        // Set current selection based on saved language preference
        val currentLanguage = preferences.getString("selected_language", "en")
        languageSpinner.setSelection(
            when (currentLanguage) {
                "zu" -> 1
                "af" -> 2
                else -> 0
            }
        )

        // Save language selection and apply locale when user selects a new language
        languageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedLanguage = when (position) {
                    1 -> "zu" // Zulu
                    2 -> "af" // Afrikaans
                    else -> "en" // English
                }

                // Check if the selected language is different from the current one
                if (selectedLanguage != preferences.getString("selected_language", "en")) {
                    saveLanguagePreference(selectedLanguage)
                    setLocale(selectedLanguage)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }

    private fun saveLanguagePreference(languageCode: String) {
        preferences.edit().putString("selected_language", languageCode).apply()
    }

    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = resources.configuration
        config.setLocale(locale)

        // Update configuration for the base context to apply the language change
        resources.updateConfiguration(config, resources.displayMetrics)

        // Restart the activity to apply the new locale
        val refreshIntent = Intent(this, SettingsActivity::class.java)
        refreshIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(refreshIntent)
    }
}
