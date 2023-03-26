package com.serdar.rickandmorty_graphql.di.source.remote

import com.serdar.rickandmorty_graphql.data.source.remote.RemoteSourceImpl
import com.serdar.rickandmorty_graphql.domain.source.remote.RemoteSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)

abstract class RemoteSourceModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRickAndMortyRemoteSource(remoteSourceImpl: RemoteSourceImpl): RemoteSource
}