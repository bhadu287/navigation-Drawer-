package com.example.root.navigationdrawer.Others;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("menu.json")
    Call<List<Item>> LoadJson( );
}
