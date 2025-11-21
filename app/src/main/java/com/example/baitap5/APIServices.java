package com.example.baitap5;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {
    @GET("categories.php")
    Call<List<Category>> getCategoriesAll();
}
