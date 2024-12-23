package com.example.endpointapp

import com.example.endpointapp.R
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TourAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.endpointapp.R.layout.main_activity)
        Log.d("MainActivity", "onCreate() called")

        // Initialize Retrofit
        val apiService = RetrofitClient.getClient(BASE_URL).create(ApiService::class.java)


        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
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

        apiService.getAllTours().enqueue(object : Callback<List<Tour>> {
            override fun onResponse(call: Call<List<Tour>>, response: Response<List<Tour>>) {
                if (response.isSuccessful) {
                    val tours = response.body()
                    tours?.let {
                        adapter = TourAdapter(it)
                        recyclerView.adapter = adapter
                    }
                } else {
                    Log.e("API", "Request failed with code: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Tour>>, t: Throwable) {
                Log.e("API", "Request failed: ${t.message}")
            }
        })


}


    companion object {
        private const val BASE_URL = "http://10.0.2.2:5258/api/"  // Base URL for the API
    }
}
