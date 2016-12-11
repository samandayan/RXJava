package com.packtpub.retrofit.Daggers;

import com.packtpub.retrofit.network.NetworkManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetModule {

    @Provides
    @Singleton
    NetworkManager provideNetworkManager() {
        NetworkManager networkManager = new NetworkManager();
        return networkManager;
    }

}