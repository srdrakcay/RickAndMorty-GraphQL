package com.serdar.rickandmorty_graphql.data.client

import com.apollographql.apollo3.ApolloClient
import com.rickandmorty_graphql.RickAndMortyCharacterQuery
import com.serdar.rickandmorty_graphql.data.NetworkResponse
import com.serdar.rickandmorty_graphql.data.dto.Character
import com.serdar.rickandmorty_graphql.data.mapper.toMap
import com.serdar.rickandmorty_graphql.domain.client.RickAndMortyClient
import javax.inject.Inject

class RickAndMortyClientImpl
    @Inject constructor(
    private val apolloClient: ApolloClient
): RickAndMortyClient {
    override suspend fun getAllCharacterQuery(): List<Character>?{
        return apolloClient
            .query(RickAndMortyCharacterQuery())
            .execute()
            .data
            ?.characters
            ?.results
            ?.map {
                it!!.toMap()
            }

    }
}