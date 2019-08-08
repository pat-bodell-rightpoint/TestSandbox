package com.example.codetestingexample.vehicleExample

import java.util.*

class VehicleDetailsViewModel(private val vehicleDetailsModel: VehicleDetailsModel) {

    fun sortListOfVehiclesByMiles(): List<Vehicle> {
        val vehicleList = vehicleDetailsModel.getListOfVehicles()
        return vehicleList.sortedBy { vehicle -> vehicle.vehicleHealth.miles }
    }

    fun getHeatedSeatsForBrandOrJustBrand(brand: String): List<Vehicle> {
//        val vehicleList = vehicleDetailsModel.searchForHeatedSeats()
//            .filter { it.vehiclePackage.interior.hasHeatedSeats && it.make == brand }
//        return if (vehicleList.isNotEmpty()) vehicleList
//        else vehicleDetailsModel.getListOfVehicles().filter { it.make == brand }
        return Collections.emptyList()
    }
}