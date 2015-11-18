package com.jiahan.action.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;
import com.jiahan.action.Dao.Book;
import com.jiahan.action.Dao.Doubt;
import com.jiahan.action.Dao.DoubtDao;
import com.jiahan.action.Dao.Sentiment;
import com.jiahan.action.Dao.SentimentDao;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;

import java.util.ArrayList;
import java.util.List;

public class BookdetailsActivity extends AppCompatActivity implements View.OnClickListener {


    public Book mbook;
    private Context mContext;
    private DoubtDao doubtDao;
    private SentimentDao sentimentDao;
    private MyAplication myApp;
    private Long BookId;
    private List<Doubt> doubtslist;
    private List<Sentiment> sentimentslist;

    private Button bt_add_doubt,bt_add_sentiment,bt_add_summary;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetails);
        mContext = BookdetailsActivity.this;
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


             /*   Snackbar.make(view,mbook.getBookName(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }

    public void initView()
    {
        bt_add_doubt = (Button) findViewById(R.id.button_add_doubt);
        bt_add_doubt.setOnClickListener(this);
        bt_add_sentiment = (Button) findViewById(R.id.button_add_sentiment);
        bt_add_sentiment.setOnClickListener(this);
        bt_add_summary = (Button) findViewById(R.id.button_add_summary);
        bt_add_summary.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button_add_doubt:
                MaterialDialog.Builder builder = new MaterialDialog.Builder(this);
               // builder.
                break;
            case R.id.button_add_sentiment:

                break;
            case  R.id.button_add_summary:

                break;

            default:
                break;
        }

    }
}
