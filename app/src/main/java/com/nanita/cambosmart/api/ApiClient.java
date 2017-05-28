package com.nanita.cambosmart.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chhaichivon on 5/1/17.
 */

public class ApiClient {
    public static final String API_END_POINT = "http://192.168.17.110:9000/api/v1/";
    private static Retrofit  retrofit = null;

    public static Retrofit getRetrofit(){
        if( retrofit == null){
            retrofit  = new Retrofit.Builder().baseUrl(API_END_POINT).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
