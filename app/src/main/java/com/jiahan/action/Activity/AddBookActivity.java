package com.jiahan.action.Activity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jiahan.action.Dao.Book;

import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DaoMaster;
import com.jiahan.action.Dao.DaoSession;
import com.jiahan.action.R;

public class AddBookActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private BookDao bookDao;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "life-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        bookDao = daoSession.getBookDao();*/
        setContentView(R.layout.activity_addbook);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Book book = new Book();

                bookDao.insert(book);
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/




    }

    public void  initview()
    {

    }


}
