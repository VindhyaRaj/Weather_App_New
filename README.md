WEATHER APP
================
This is a simple weather app using OpenWeatherMap apis to show weather information of a particular city.


Specifications :
==================

This application uses http://api.openweathermap.org/data/2.5/weather?q api to fetch the weather information

Retrofit is being used to make the networking calls to the OpenWeatherMap

User can add as many cities in the homepage , click on the added city to view the weather condition

The added cities can also be deleted

ROOM database is used to store and delete the particular city entry.

Glide for image loading.


Project Structure
========================

 WeatherApp/app                  	  : Project files
     ** src/main

         **  java/…/weatherapp       	  : Primary Kotlin classes for the project

           ** adapter                 : CitiesListAdapter.kt (adapter for the RecyclerView)

           ** data                    : Kotlin classes for database elements

                ** AppDatabase.kt      : Database holder

                ** CitiesListDAO.kt    : DAO with database queries

                **City.kt             : City entity class

                **WeatherResponse.kt    : Data classes for results received from API calls

            ** network/WeatherAPI.kt   : Interface for GET queries to the API

            ** AddCityDialog.kt        : Dialog fragment for adding cities

            ** DetailsActivity.kt 	 : Activity for viewing weather details for a specific city

            ** MainActivity.kt 		 : Primary homepage list activity

            ** AndroidManifest.xml         : manifest file for the application

         ** build.gradle


Improvisations
================

Make the app complete by adding search via GPS to fetch the weather information of a particular location

Use of MVVM for much modular design

Use of Dagger 2 to inject the manager service into activity and application depending on the scope