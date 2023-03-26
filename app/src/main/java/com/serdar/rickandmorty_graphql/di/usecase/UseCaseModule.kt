package com.serdar.rickandmorty_graphql.di.usecase

import com.serdar.rickandmorty_graphql.domain.usecase.RickAndMortyUseCase
import com.serdar.rickandmorty_graphql.domain.usecase.RickAndMortyUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)

abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRickAndMortyUseCase(rickAndMortyUseCaseImpl: RickAndMortyUseCaseImpl): RickAndMortyUseCase
}