package com.larapin.belajarapi.api;

import com.google.gson.Gson;

import retrofit2.Retrofit;

/**
 * Created by Avin on 16/05/2018.
 */

public class APIClient {
    public static final String BASE_URL = "http://localhost:8080/belajarapi/public/api/mahasiswa";

    private static Retrofit sRetrofit = null;

//    public static Retrofit getClient(){
//        if (sRetrofit == null){
//            sRetrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return sRetrofit
//    }
}
