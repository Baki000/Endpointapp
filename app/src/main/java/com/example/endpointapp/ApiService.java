package com.example.endpointapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.http.Path;

public interface ApiService {

    @POST("Tour/addTour")  // Endpoint path
    Call<YourResponseType> postData(@Body YourRequestType requestBody);
    @GET("tour") // The endpoint path relative to the base URL
    Call<List<Tour>> getAllTours();
}