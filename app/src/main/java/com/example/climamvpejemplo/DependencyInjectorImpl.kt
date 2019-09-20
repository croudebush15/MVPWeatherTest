
package com.example.climamvpejemplo

class DependencyInjectorImpl : DependencyInjector {
  override fun weatherRepository() : WeatherRepository {
    return WeatherRepositoryImpl()
  }
}
