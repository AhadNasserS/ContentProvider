package com.example.contentprovider.ui.theme

import android.content.ContentProvider
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.contentprovider.ContentProviderDataItem
import com.example.contentprovider.MainActivity

class ContentProviderViewModel : ViewModel (){
    var imagesSate = mutableStateOf(emptyList<ContentProviderDataItem>())

    fun updateImages(images: List<ContentProviderDataItem>) {
        imagesSate.value = images
    }
}