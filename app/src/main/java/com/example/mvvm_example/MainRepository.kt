package com.example.mvvm_example

class MainRepository constructor(private val retrofitService: RetrofitService)
{
    fun getAllMovies() = retrofitService.getAllMovies()
}