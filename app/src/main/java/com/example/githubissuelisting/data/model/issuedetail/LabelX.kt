package com.example.githubissuelisting.data.model.issuedetail


import com.google.gson.annotations.SerializedName

data class LabelX(
    @SerializedName("color")
    val color: String,
    @SerializedName("default")
    val default: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("url")
    val url: String
)