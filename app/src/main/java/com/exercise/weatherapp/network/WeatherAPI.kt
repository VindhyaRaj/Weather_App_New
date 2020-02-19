package com.exercise.weatherapp.network


import com.exercise.weatherapp.data.WeatherResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// URL: http://api.openweathermap.org/data/2.5/weather?q=Sydney,hu&units=metric&appid=3cd90055e4a084be8c9903f3d08e4d9e
// HOST: http://api.openweathermap.org/data/2.5
// PATH: /weather
// QUERY param separator: ?
// QUERY params: q, units, appid

interface WeatherAPI {

    @GET("/data/2.5/weather")
    fun getWeather(@Query("q") q: String, @Query("units") units: String = "metric", @Query("appid") appId: String = "caf9622522c1f9bd883b94167a4eb260") : Call<WeatherResult>
}