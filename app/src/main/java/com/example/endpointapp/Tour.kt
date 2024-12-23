package com.example.endpointapp

data class Tour(
    val name: String,
    val description: String,
    val difficulty: Int,
    val category: Int,
    val price: Long,
    val date: String,
    val status: Int,
    val guide: Any?, // Replace `Any?` with a specific type if the guide field has a defined structure
    val guideId: Int,
    val id: Int,
    val deleted: Boolean
)

