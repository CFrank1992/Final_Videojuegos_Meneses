package com.example.final_videojuegos_meneses.services;

import com.example.final_videojuegos_meneses.entities.Account;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountService {

    @GET("N00109334/accounts")
    Call<List<Account>> all();

    @POST("N00109334/accounts")
    Call<Account> create(@Body Account account);
}
