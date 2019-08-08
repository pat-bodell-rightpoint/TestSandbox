package com.example.codetestingexample.vehicleExample

import java.util.*

class VehicleSearchService {
    /**
     * Note : These methods would usually be hooked up to a web service / database
     *
     * For the purposes of this we just want to test what we do with their responses, so we will just stub them out.
     */

    fun getListOfAvailableVehicles(): List<Vehicle> {
        return Collections.emptyList()
    }
}