package com.example.carspotteropsc7312poe.dataclass

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface CarDao {
    // Insert a new Car entry or replace if it already exists
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(car: Car)

    // Insert a list of cars, replacing if any conflict occurs
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(cars: List<Car>)

    // Retrieve all cars from the database
    @Query("SELECT * FROM cars")
    suspend fun getAllCars(): List<Car>

    // Delete a specific car by name
    @Query("DELETE FROM cars WHERE name = :carName")
    suspend fun deleteCarByName(carName: String)
}

