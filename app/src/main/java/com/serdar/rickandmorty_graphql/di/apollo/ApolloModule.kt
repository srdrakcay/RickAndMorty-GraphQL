package com.serdar.rickandmorty_graphql.di.apollo

import com.apollographql.apollo3.ApolloClient
import com.serdar.rickandmorty_graphql.data.client.RickAndMortyClientImpl
import com.serdar.rickandmorty_graphql.domain.client.RickAndMortyClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApolloModule {

    @Provides
    @Singleton
    fun apolloClient():ApolloClient{
        return ApolloClient.Builder()
            .serverUrl("https://rickandmortyapi.com/graphql")
            .build()
    }

}