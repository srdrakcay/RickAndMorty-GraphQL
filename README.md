# RickAndMorty-GraphQL

This is a simple app for using Apollo GrapQL
## Project Screen
HOME SCREEN | 
--- | 
![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/t6lhadn.png) |

- This app made %100 with  [Kotlin](https://developer.android.com/kotlin)

- Made with [Android Architecture Components ](https://developer.android.com/topic/architecture)for the Collection of libraries that help you design robust, testable, and maintainable apps.

- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel):The ViewModel class is a business logic or screen level state holder. It exposes state to the UI and encapsulates related business logic. Its principal advantage is that it caches state and persists it through configuration changes. This means that your UI doesn’t have to fetch data again when navigating between activities, or following configuration changes, such as when rotating the screen.

- [Kotlin Flow](https://developer.android.com/kotlin/flow):In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value. For example, you can use a flow to receive live updates from a database.

- [Kotlin Coroutine](https://developer.android.com/kotlin/coroutines):On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. Over 50% of professional developers who use coroutines have reported seeing increased productivity. This topic describes how you can use Kotlin coroutines to address these problems, enabling you to write cleaner and more concise app code.

- [Dependency Injection with Hilt](https://developer.android.com/training/dependency-injection/hilt-android):Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project. Doing manual dependency injection requires you to construct every class and its dependencies by hand, and to use containers to reuse and manage dependencies.

- [Navigation Componenet](https://developer.android.com/guide/navigation):Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.

- [Retrofit](https://square.github.io/retrofit/):Retrofit is the class through which your API interfaces are turned into callable objects. By default, Retrofit will give you sane defaults for your platform but it allows for customization.

- [UseCase](https://developer.android.com/topic/architecture/domain-layer):Located domain layer that sits between the UI layer and the data layer.

- [Glide ](https://github.com/bumptech/glide):A library for imageView.


# Apollo Client
[Apollo](https://www.apollographql.com/docs/kotlin/)
 Kotlin executes queries and mutations against a GraphQL server and returns results as query-specific Kotlin types. This means you don't have to deal with parsing JSON, or passing around Maps and making clients cast values to the right type manually. You also don't have to write model types yourself, because these are generated from the GraphQL definitions your UI uses.

  buildGradle(:app)
  
``````
plugins {
    id("com.apollographql.apollo3").version("3.7.5")
}
apollo {
    service("service") {
        packageName.set("com.rickandmorty_graphql")
    }
}

dependencies {
implementation "com.apollographql.apollo3:apollo-runtime:$apollo_version"
} 
