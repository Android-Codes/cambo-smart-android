package com.nanita.cambosmart.api;

import com.nanita.cambosmart.models.Products;
import com.nanita.cambosmart.models.ProductsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by chhaichivon on 5/1/17.
 */

public interface ApiClientListener {

    @GET("products/category/list")
    Call<ProductsResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("products/category/list/")
    Call<ProductsResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

}
