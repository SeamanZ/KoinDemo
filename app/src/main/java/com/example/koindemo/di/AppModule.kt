package com.example.koindemo.di

import com.example.koindemo.logic.BusinessService
import com.example.koindemo.logic.Controller
import com.example.koindemo.ui.main.PageViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * Created by Seaman on 2019-05-10.
 * Bangggood Ltd
 */

var appModule = module {
    single { Controller(get(), get()) }
    single { BusinessService() }
    viewModel { PageViewModel() }
}