package com.example.photogallery.api

import android.net.Uri
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


//saving the JSON data from Flickr
@JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    val id: String,
    @Json(name="url_s") val url: String,
    val owner: String
){
    val photoPageUri: Uri
        get() = Uri.parse("https://www.flickr.com/photos/")
            .buildUpon()
            .appendPath(owner)
            .appendPath(id)
            .build()
}