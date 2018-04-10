package com.example.root.navigationdrawer.Others;

import android.content.Context;
import android.util.Log;

import com.example.root.navigationdrawer.Fragments.HomeFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<List<Item>> {

    static  final String Base_url="https://api.androidhive.info/json/";

    static final String TAG="abd"+Controller.class.getSimpleName();
    public Context context;
    ApiResponse apiResponse;
    public void start(ApiResponse apiResponse) {
        Gson gson=new GsonBuilder().setLenient().create();

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        ApiService apiService=retrofit.create(ApiService.class);
        Call<List<Item>> call=apiService.LoadJson();
        call.enqueue(this);
        this.apiResponse=apiResponse;


    }
    @Override
    public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
        if(response.isSuccessful()) {
            List<Item> changesList = response.body();
            apiResponse.onSuccess(changesList);
        } else {
            System.out.println(response.errorBody());
            apiResponse.onFailure(response.errorBody().toString());
        }
    }

    @Override
    public void onFailure(Call<List<Item>> call, Throwable t) {
        apiResponse.onFailure(t.getMessage());

    }
    public interface ApiResponse{
        public void onSuccess(List<Item> items);
        public void onFailure(String message);
    }
}
