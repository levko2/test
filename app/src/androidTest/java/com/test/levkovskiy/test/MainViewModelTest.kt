package com.test.levkovskiy.test

import org.junit.Test
import org.junit.Assert.*

class MainViewModelTest {
    private val mainViewModel = MainViewModel()

    @Test
    fun goThrowArray() {
        mainViewModel.goThrowArray()
    }

    @Test
    fun listTest() {
        mainViewModel.listTest()
    }

    @Test
    fun checkValue_notDividesTwoOrFour() {
        assertEquals(mainViewModel.checkValue(3), "")
    }

    @Test
    fun checkValue_DividesTwo() {
        assertEquals(mainViewModel.checkValue(6), "Book")
    }

    @Test
    fun checkValue_DividesTwoAndFour() {
        assertEquals(mainViewModel.checkValue(8), "BookJane")
    }
}