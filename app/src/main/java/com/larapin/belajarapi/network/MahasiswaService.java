package com.larapin.belajarapi.network;

import com.larapin.belajarapi.model.Mahasiswa;
import com.larapin.belajarapi.model.MahasiswaResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Avin on 30/05/2018.
 *
 */

public interface MahasiswaService {
    @GET("mahasiswa")
    Call<MahasiswaResult> getMahasiswa();

    @GET("mahasiswa/{id}")
    Call<MahasiswaResult> getMahasiswa(@Path("id") int id);

    @POST("mahasiswa")
    Call<String> setMahasiswa(@Body Mahasiswa mahasiswa);

    @FormUrlEncoded
    @PUT("mahasiswa/{id}")
    Call<String> updateMahasiswa(@Body Mahasiswa mahasiswa);

    @DELETE("mahasiswa/{id}")
    Call<String> deleteMahasiswa(@Path("id") int id);
}
