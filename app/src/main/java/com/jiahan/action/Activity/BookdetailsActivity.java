package com.jiahan.action.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jiahan.action.Dao.Book;
import com.jiahan.action.Dao.Doubt;
import com.jiahan.action.Dao.DoubtDao;
import com.jiahan.action.Dao.Sentiment;
import com.jiahan.action.Dao.SentimentDao;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;

import java.util.ArrayList;
import java.util.List;

public class BookdetailsActivity extends AppCompatActivity {


    public Book mbook;
    private DoubtDao doubtDao;
    private SentimentDao sentimentDao;
    private MyAplication myApp;
    private Long BookId;
    private List<Doubt> doubtslist;
    private List<Sentiment> sentimentslist;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetails);
        myApp = (MyAplication) getApplication();
        doubtDao = myApp.getDaoSession().getDoubtDao();
        sentimentDao = myApp.getDaoSession().getSentimentDao();
        mbook = (Book) getIntent().getSerializableExtra("book");
        BookId = mbook.getId();

        doubtslist = doubtDao.queryBuilder().where(DoubtDao.Properties.BooK_id.eq(BookId)).list();
        sentimentslist = sentimentDao.queryBuilder().where(SentimentDao.Properties.Book_id.eq(BookId)).list();






      /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,mbook.getBookName(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
