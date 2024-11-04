package com.example.carspotteropsc7312poe.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carspotteropsc7312poe.R
import com.example.carspotteropsc7312poe.adapter.CarObservationAdapter
import com.example.carspotteropsc7312poe.dataclass.AppDatabase
import com.example.carspotteropsc7312poe.dataclass.Car
import com.example.carspotteropsc7312poe.dataclass.UserObservation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FirstActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CarObservationAdapter
    private val observations = mutableListOf<UserObservation>() // Use a mutable list to manage observations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewObservations)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize adapter with empty observations list
        adapter = CarObservationAdapter(observations)
        recyclerView.adapter = adapter

        // Fetch observations from database and display
        fetchObservations()
    }

    private fun fetchObservations() {
        val carDao = AppDatabase.getDatabase(applicationContext).carDao()

        CoroutineScope(Dispatchers.IO).launch {
            val cars = carDao.getAllCars()

            if (cars.isEmpty()) {
                // Add sample data if the database is empty
                val sampleCars = listOf(
                    Car(
                        name = "Bentley Bentayga",
                        description = "White compact car spotted near a shopping mall.",
                        imageResId = R.drawable.bentley_bentayga // Replace with an actual drawable resource ID
                    ),
                    Car(
                        name = "Ferrari",
                        description = "Red ferrari spotted on the main road.",
                        imageResId = R.drawable.ferrari // Replace with an actual drawable resource ID
                    )
                    // Add more sample data as needed
                )

                // Insert sample data into the database
                carDao.insertAll(sampleCars)
            }

            // Retrieve and display cars, converting to UserObservation objects for the adapter
            val updatedCars = carDao.getAllCars()
            val newObservations = updatedCars.map { car ->
                UserObservation(
                    CarName = car.name,
                    Model = "", // Adjust if needed
                    CarDescription = car.description,
                    dateTime = "", // Set as needed
                    latitude = 0.0, // Default or set as needed
                    longitude = 0.0, // Default or set as needed
                    notes = "", // Default or set as needed
                    imageUrl = "" // Default or set as needed
                )
            }

            withContext(Dispatchers.Main) {
                observations.clear()
                observations.addAll(newObservations)
                adapter.notifyDataSetChanged()
            }
        }
    }

}
