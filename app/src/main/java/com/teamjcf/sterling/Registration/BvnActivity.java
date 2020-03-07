package com.teamjcf.sterling.Registration;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.teamjcf.sterling.Constant;
import com.teamjcf.sterling.R;
import com.teamjcf.sterling.json.jsonApi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BvnActivity extends AppCompatActivity {

    Retrofit retrofit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvn);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {

                Request newRequest = chain.request().newBuilder()
                        //  .addHeader("Authorization", "Bearer " + token)
                        .build();
                return chain.proceed(newRequest);
            }
        }).connectTimeout(50, TimeUnit.SECONDS)
                .readTimeout(30,TimeUnit.SECONDS)
                .callTimeout(2,TimeUnit.MINUTES)
            //    .cache(cache)
                .addInterceptor(logging).build();

        Retrofit.Builder   builder = new Retrofit.Builder()
                .baseUrl(Constant.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create()) ;
        builder.client(httpClient);
        retrofit  =   builder.build();

    }


    private void BvnCeck ()
    {
            jsonApi jsonApi = retrofit.create(jsonApi.class);

//            Call<GroceryStoreProduct> cosmetics = jsonApi.Staples(17);
//            cosmetics.enqueue

    }
}
