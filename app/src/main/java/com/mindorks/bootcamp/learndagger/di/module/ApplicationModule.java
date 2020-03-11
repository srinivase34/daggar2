package com.mindorks.bootcamp.learndagger.di.module;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo;
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return application;
    }

    @DatabaseInfo
    @Provides
    String provideDatabaseName(){
        return "abc";
    }

    @Provides
    Integer provideDatabaseVersion(){
        return 1;
    }

    @NetworkInfo
    @Provides
    String provideApiKey(){
        return "xyz";
    }

   /* @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(application, "abc");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService() {
        return new DatabaseService(application, "xyz", 1);
    }*/
}
