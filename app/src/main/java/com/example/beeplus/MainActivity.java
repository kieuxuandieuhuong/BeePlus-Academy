package com.example.beeplus;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.beeplus.model.CourseData;
import com.example.beeplus.retrofit.ApiInterface;
import com.example.beeplus.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<List<CourseData>> call = apiInterface.getAllCourses();
        call.enqueue(new Callback<List<CourseData>>() {
            @Override
            public void onResponse(Call<List<CourseData>> call, Response<List<CourseData>> response) {
                List<CourseData> courseDataList = response.body();
                List<CourseData> courseDataList1 = response.body();

            }

            @Override
            public void onFailure(Call<List<CourseData>> call, Throwable t) {

            }
        });
    }
}