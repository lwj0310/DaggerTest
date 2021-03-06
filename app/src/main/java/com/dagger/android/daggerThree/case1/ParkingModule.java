package com.dagger.android.daggerThree.case1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.T on 2018/4/28.
 */
@Module
public class ParkingModule {

    private String driver;

    public ParkingModule(String driver) {
        this.driver = driver;
    }

    @Provides
    public String provideDriver() {
        return driver;
    }

    @SignLocal
    @Provides
    public Bus provideBus(String driver) {
        return new Bus(driver);
    }
}
