package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Config;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

import stringcheesedevs.android.apps.com.trailblazer.Models.DaoMaster;
import stringcheesedevs.android.apps.com.trailblazer.Models.DaoSession;


public class TBApplication extends Application {

    DatabaseOpenHelper helper;
    Database db;
    DaoMaster daoMaster;
    DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        helper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        db = helper.getWritableDb();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}
