package com.fernandocejas.sample.framework.network

import com.fernandocejas.sample.features.movies.MovieDetailsEntity
import com.fernandocejas.sample.features.movies.MovieEntity
import io.reactivex.Observable
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RestApi
@Inject constructor(retrofit: Retrofit) : MoviesApi {
    private val moviesApi by lazy { retrofit.create(MoviesApi::class.java) }

    override fun movies(): Observable<List<MovieEntity>> = moviesApi.movies()
    override fun movieDetails(movieId: Int): Observable<MovieDetailsEntity> = moviesApi.movieDetails(movieId)
}
