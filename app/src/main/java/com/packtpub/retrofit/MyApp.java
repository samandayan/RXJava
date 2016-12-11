package com.packtpub.retrofit;

import android.app.Application;

import com.packtpub.retrofit.Daggers.AppModule;
import com.packtpub.retrofit.Daggers.DaggerNetComponent;
import com.packtpub.retrofit.Daggers.NetComponent;
import com.packtpub.retrofit.Daggers.NetModule;

public class MyApp extends Application{

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
