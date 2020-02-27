package com.example.native1.Interface;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterInterface {

    String REGIURL = "http://192.168.1.13/ETrashApp/";
    @FormUrlEncoded
    @POST("register.php")
    Call<String> getUserRegi(
            @Field("name") String name,
            @Field("username") String uname,
            @Field("email") String email,
            @Field("telp") String telp,
            @Field("password") String password
    );

}