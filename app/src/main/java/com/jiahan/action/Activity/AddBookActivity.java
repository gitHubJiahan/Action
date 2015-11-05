package com.jiahan.action.Activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jiahan.action.Dao.Book;

import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DaoMaster;
import com.jiahan.action.Dao.DaoSession;
import com.jiahan.action.Dao.Thing;
import com.jiahan.action.Dao.ThingDao;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;
import com.jiahan.action.Utils.DateUtil;

import java.util.Date;

import it.neokree.materialnavigationdrawer.util.Utils;

public class AddBookActivity extends AppCompatActivity implements View.OnClickListener {
    private MyAplication myApp;
    private DaoSession daoSession;
    private ThingDao thingdo;
    private TextView tBookName,tBookAuthor,tBookIntroduction,tBookplan,tLanguage;
    private String sBookName = null,sBookAuthor = null,sBookIntroduction = null,sBookplan = null,sLanguage = null;
    private String addTime = null;
    private int readProgress = 0;
    private Button bSubnit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_addbook);
        initview();

        myApp = (MyAplication) getApplication();
        daoSession = myApp.getDaoSession();
        thingdo = daoSession.getThingDao();


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
        tBookName = (TextView) findViewById(R.id.book_name);
        tBookIntroduction = (TextView) findViewById(R.id.book_introduction);
        tBookAuthor = (TextView) findViewById(R.id.book_author);
        tBookplan = (TextView) findViewById(R.id.book_plan);
        tLanguage = (TextView) findViewById(R.id.book_language);
        bSubnit = (Button) findViewById(R.id.book_add_button);
        bSubnit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.book_add_button: {
                sBookName = tBookName.getText().toString();
                sBookAuthor = tBookAuthor.getText().toString();
                sBookIntroduction = tBookIntroduction.getText().toString();
                sBookplan = tBookplan.getText().toString();
                sLanguage = tLanguage.getText().toString();
                addTime = DateUtil.getDateString(new Date());
                long  a = 10000;
                Thing book = new Thing(null,null,null,null,null,null,null,null,null,null);
                book.setId(a);
                book.setName(sBookName);

                thingdo.insert(book);

                Intent intent = new Intent(AddBookActivity.this,BookActivity.class);
                startActivity(intent);
                break;
            }



        }



    }


    public boolean validate()
    {
        StringBuilder warningMessage = new StringBuilder();
        warningMessage.append("请输入 ： ");
        if( null == sBookName )
        {
            warningMessage.append("书名");
        }else if( null == sBookAuthor )
        {
            warningMessage.append(" ，作者");
        }else if( null == sBookIntroduction )
        {
            warningMessage.append(" ，简介");
        }else if( null == sBookplan )
        {
            warningMessage.append(" ，读书计划");
        }else if( null == sLanguage)
        {
            warningMessage.append(" ，图书语言");
        }
        else
        {
            return true;
        }


        return false;
    }
}
