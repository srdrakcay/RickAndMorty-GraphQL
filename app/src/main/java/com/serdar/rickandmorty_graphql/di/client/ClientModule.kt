package com.serdar.rickandmorty_graphql.di.client

import com.serdar.rickandmorty_graphql.data.client.RickAndMortyClientImpl
import com.serdar.rickandmorty_graphql.domain.client.RickAndMortyClient
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)

abstract class ClientModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRickAndMortyClient(rickAndMortyClientImpl: RickAndMortyClientImpl): RickAndMortyClient
}