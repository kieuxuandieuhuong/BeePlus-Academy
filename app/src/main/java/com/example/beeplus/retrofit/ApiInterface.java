package com.example.beeplus.retrofit;

import com.example.beeplus.model.CourseData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("course")
    Call<List<CourseData>> getAllCourses();

}
