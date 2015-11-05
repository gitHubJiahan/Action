package com.jiahan.action;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jiahan.action.Dao.DaoMaster;
import com.jiahan.action.Dao.DaoSession;

/**
 * Created by Administrator on 2015/11/5 0005.
 */
public class MyAplication extends Application{

    private  DaoSession daoSession;



    public  DaoSession getDaoSession()
    {
        return daoSession;
    }

    public void  setDaoSession()
    {
        SQLiteDatabase db;
        DaoMaster daoMaster;
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(getApplicationContext(), "life-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
       daoSession = daoMaster.newSession();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setDaoSession();
    }
}
