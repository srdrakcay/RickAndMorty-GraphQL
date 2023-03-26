package com.serdar.rickandmorty_graphql.utility

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadUrl(url: String?) {
    Glide
        .with(this)
        .load(url)
        .into(this)
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.notShow() {
    visibility = View.GONE
}