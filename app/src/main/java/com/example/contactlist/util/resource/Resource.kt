package com.example.contactlist.util.resource

import androidx.annotation.StringRes

sealed class Resource<out T: Any> {
    data class Success<out T: Any>(val data: T) : Resource<T>()
    data class Error(val uiText: UiText? = null, val exception: Throwable? = null) : Resource<Nothing>()
    object Loading: Resource<Nothing>()
}

data class UiText(@StringRes val text: Int)
