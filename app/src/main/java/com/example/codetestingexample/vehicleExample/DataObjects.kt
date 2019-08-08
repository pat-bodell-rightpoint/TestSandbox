package com.example.codetestingexample.vehicleExample

data class Vehicle(val make: String, val model: String, val modelYear: Int, val vehiclePackage: VehiclePackage, val vehicleId: VehicleIdentification, val vehicleHealth: VehicleHealth)
data class VehiclePackage(val powertrain: Powertrain, val interior: Interior)
data class Interior(val seatMaterial: String, val hasNavigation: Boolean, val hasHeatedSeats: Boolean)
data class Powertrain(val engineDisplacement: Float, val transmission: String, val isHybrid: Boolean)
data class VehicleIdentification(val vin: String, val licencePlate: String)
data class VehicleHealth(val miles: Int, val fuelLevelPct: Int, val oilLifePct: Int)