package com.example.albert.retrofitexample.API;

import com.example.albert.retrofitexample.Model.User;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;


/**
 * Created by Albert on 1/9/2016.
 */
public interface gitapi {
    @GET("/getUser.php")
    void getUser(@Query("user_id") int id,@Query("phone_id") String phoneId, Callback<User> response);

}
