package com.example.endpointapp

import android.R
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.endpointapp.R.layout.main_activity)
        Log.d("MainActivity", "onCreate() called")

        // Initialize Retrofit
        val apiService = RetrofitClient.getClient(BASE_URL).create(ApiService::class.java)

        // Prepare request body
        val requestBody = YourRequestType()

        requestBody.name = "idemo radimo"
        requestBody.description = "Krstarenje za Monako"
        requestBody.difficulty = 0
        requestBody.category = 1
        requestBody.price = 1000
        requestBody.date = "2025-01-01"

        // Make the POST request
        apiService.postData(requestBody).enqueue(object : Callback<YourResponseType?> {
            override fun onResponse(
                call: Call<YourResponseType?>,
                response: Response<YourResponseType?>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    Log.d("API", "Response: " + response.body().toString())
                } else {
                    Log.e("API", "Request failed with code: " + response.code())
                    Log.e("API", "Error response body: " + response.errorBody()?.string())
                }
            }

            override fun onFailure(call: Call<YourResponseType?>, t: Throwable) {
                Log.e("API", "Error: " + t.message)
            }
        })
    }


    companion object {
        private const val BASE_URL = "http://10.0.2.2:5258/api/"  // Base URL for the API
    }
}
