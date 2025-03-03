package com.hawksappstudio.photostockfreewallpapersandphoto.service

import com.hawksappstudio.photostockfreewallpapersandphoto.model.Model
import com.hawksappstudio.photostockfreewallpapersandphoto.utils.PER_PAGE
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PhotosApi {
    //https://api.unsplash.com/photos/?client_id=UIGxeHlXUJKZtsaj690S05zfFsMJKO0NSWdCWg2E5tc&per_page=30&page=1 list photo
    @GET("photos/?client_id=UIGxeHlXUJKZtsaj690S05zfFsMJKO0NSWdCWg2E5tc")
    fun getPhotoList(@Query("per_page")perPage:Int= PER_PAGE, @Query("page")page:Int=1) :  Single<List<Model.Photo>>

    @GET("photos/{id}?client_id=UIGxeHlXUJKZtsaj690S05zfFsMJKO0NSWdCWg2E5tc")
    fun getPhotoDetails(@Path("id")id:String) : Single<Model.Photo>
    @GET("search/photos?client_id=UIGxeHlXUJKZtsaj690S05zfFsMJKO0NSWdCWg2E5tc")
    fun getSearch(@Query("query")query:String,@Query("per_page")perPage: Int=20,@Query("page")page: Int) : Single<Model.Search>




}