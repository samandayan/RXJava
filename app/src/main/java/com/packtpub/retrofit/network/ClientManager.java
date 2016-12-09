package com.packtpub.retrofit.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientManager {

    static String url = "http://www.androidtutorialpoint.com/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static <T> T getRetrofitOjectProvider(Class<T> service) {
        return retrofit.create(service);
    }
}
