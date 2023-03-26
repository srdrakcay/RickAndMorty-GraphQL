package com.serdar.rickandmorty_graphql.data.mapper

import com.rickandmorty_graphql.RickAndMortyCharacterQuery
import com.serdar.rickandmorty_graphql.data.dto.Character

fun RickAndMortyCharacterQuery.Result.toMap():Character{
    return Character(
        image =image?:"",
        id = id?:"",
        name = name?:"",

    )
}