package com.example.native1.Interface;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginInterface {

    String LOGINURL = "http://192.168.1.13/ETrashApp/";
    @FormUrlEncoded
    @POST("login.php")
    Call<String> getUserLogin(
            @Field("username") String uname,
            @Field("password") String password
    );
}