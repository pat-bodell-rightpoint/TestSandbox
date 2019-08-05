package com.example.codetestingexample

import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class MainViewModelMockitoTest {
    @Mock
    private lateinit var mathUtil: MathUtil

    private lateinit var subject: MainViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        subject = MainViewModel(mathUtil)
    }

    @Test
    fun add_addsTwoNumbers() {
        subject.inputOne = 1
        subject.inputTwo = 5
        `when`(mathUtil.add(1, 5)).thenReturn(6)

        subject.add()

        verify(mathUtil).add(1, 5)
        assertEquals(6, subject.output)
    }
}