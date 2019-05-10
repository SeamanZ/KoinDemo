package com.example.koindemo.logic

import android.content.Context
import android.widget.Toast


/**
 * Created by Seaman on 2019-05-10.
 * Bangggood Ltd
 */
// Given some classes
class Controller(
    private val service: BusinessService,
    private val context: Context
) {
    fun showHello() {
        Toast.makeText(
            context,
            "I am Controller, BusinessService = $service",
            Toast.LENGTH_SHORT
        ).show()
    }
}

class BusinessService()