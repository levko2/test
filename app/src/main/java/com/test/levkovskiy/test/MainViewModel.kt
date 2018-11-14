package com.test.levkovskiy.test

import android.arch.lifecycle.ViewModel
import android.support.annotation.VisibleForTesting


class MainViewModel : ViewModel() {

    // All values that divides 4 also divides 2 so I am not double check is value divide on 2 and 4
    fun checkValue(value: Int): String {
        return when {
            value.rem(4) == 0 -> "BookJane"
            value.rem(2) == 0 -> "Book"
            else -> ""
        }
    }

    fun goThrowArray() {
        for (i in 1..100) {
            val result = checkValue(i)
            if (result.isNotEmpty())
                System.out.println(result)

        }
    }


    fun listTest() {
        val list = (1..100).toMutableList()
        list.filter { it.rem(2) == 0 }.forEach {
            if (it.rem(4) == 0) System.out.println("BookJane")
            else System.out.println("Book")
        }
    }
}