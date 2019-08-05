package com.example.codetestingexample

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MainViewModelMockKTest {
    @MockK
    private lateinit var mathUtil: MathUtil

    private lateinit var subject: MainViewModel

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxUnitFun = false)

        subject = MainViewModel(mathUtil)
    }

    @Test
    fun add_addsTwoNumbers() {
        subject.inputOne = 1
        subject.inputTwo = 5
        every { mathUtil.add(1, 5) } returns 6

        subject.add()

        verify { mathUtil.add(1, 5) }
        assertEquals(6, subject.output)
    }
}