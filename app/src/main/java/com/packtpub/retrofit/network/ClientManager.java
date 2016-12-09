package com.packtpub.retrofit.network;

import com.packtpub.retrofit.util.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientManager {



    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://androidtutorialpoint.com/")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static <T> T getRetrofitOjectProvider(Class<T> service) {
        return retrofit.create(service);
    }
}
