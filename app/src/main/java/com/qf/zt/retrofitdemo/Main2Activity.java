package com.qf.zt.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        QsInter2 qsInter = retrofit.create(QsInter2.class);
        qsInter.getDatas("pic", 1).enqueue(new Callback<QsEntity>() {
            @Override
            public void onResponse(Call<QsEntity> call, Response<QsEntity> response) {
                QsEntity body = response.body();
                Log.i("info",body.getItems().size()+"");
            }

            @Override
            public void onFailure(Call<QsEntity> call, Throwable t) {

            }
        });

    }
}
