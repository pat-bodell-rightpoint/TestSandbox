package com.example.codetestingexample.vehicleExample

class VehicleDetailsModel(private val searchService: VehicleSearchService) {

    fun getListOfVehicles() = searchService.getListOfAvailableVehicles()

    fun searchManualVehicles(): List<Vehicle> {
        val vehicles = searchService.getListOfAvailableVehicles()
        return vehicles.filter { vehicle -> vehicle.vehiclePackage.powertrain.transmission == "Manual" }
    }

    fun searchForHeatedSeats(): List<Vehicle> {
        val vehicles = searchService.getListOfAvailableVehicles()
        return vehicles.filter { vehicle -> vehicle.vehiclePackage.interior.hasHeatedSeats }
    }
}