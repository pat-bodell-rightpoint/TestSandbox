package com.example.codetestingexample.vehicleExample

import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

class VehicleDetailsViewModelTest {

    @Mock
    private lateinit var vehicleDetailsModel: VehicleDetailsModel
    @Mock
    private lateinit var vehicle1: Vehicle
    @Mock
    private lateinit var vehicle2: Vehicle
    @Mock
    private lateinit var vehicle3: Vehicle

    private lateinit var subject: VehicleDetailsViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        subject = VehicleDetailsViewModel(vehicleDetailsModel)
    }

    @Test
    fun sortListOfVehiclesByMiles_returnsSortedListOfVehicles() {
        val vehicleHealth1: VehicleHealth = mock(VehicleHealth::class.java)
        val vehicleHealth2: VehicleHealth = mock(VehicleHealth::class.java)
        val vehicleHealth3: VehicleHealth = mock(VehicleHealth::class.java)
        `when`(vehicle1.vehicleHealth).thenReturn(vehicleHealth1)
        `when`(vehicle2.vehicleHealth).thenReturn(vehicleHealth2)
        `when`(vehicle3.vehicleHealth).thenReturn(vehicleHealth3)
        `when`(vehicleHealth1.miles).thenReturn(12000)
        `when`(vehicleHealth2.miles).thenReturn(200000)
        `when`(vehicleHealth3.miles).thenReturn(1500)
        `when`(vehicleDetailsModel.getListOfVehicles()).thenReturn(listOfNotNull(vehicle1, vehicle2, vehicle3))

        val actionResult = subject.sortListOfVehiclesByMiles()

        assertEquals(listOf(vehicle3, vehicle1, vehicle2), actionResult)
        verify(vehicleDetailsModel).getListOfVehicles()
    }
}