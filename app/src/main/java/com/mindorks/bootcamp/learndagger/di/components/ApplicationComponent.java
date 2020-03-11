package com.mindorks.bootcamp.learndagger.di.components;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/*
 *
 * Component take one important things, what are the modules it needs to provide the instances.
 * Module is required  by the components
 *
 * So this an a interface, which dagger will use to implement this(ApplicationComponent) and
 * it will create a class with name Dagger in front of it (DaggerApplicationComponent),
 * this will happened when ever we run the build.
 *
 * For eg: MyApplication requires dependency of NetworkService and DatabaseService(here in this case),
 * so dagger can provide this when it scans the MyApplication.
 *
 * Note:- Here the Singleton is called scope
 * */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

    NetworkService getNetworkService();

    DatabaseService getDatabaseService();
}
