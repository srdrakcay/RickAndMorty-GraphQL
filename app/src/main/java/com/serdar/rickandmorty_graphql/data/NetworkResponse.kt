package com.serdar.rickandmorty_graphql.data

sealed class NetworkResponse<out T : Any?> {
    object Loading : NetworkResponse<Nothing>()
    data class Error(val exception: Exception) : NetworkResponse<Nothing>()
    data class Success<out T : Any>(val result: T?) : NetworkResponse<T>()
}