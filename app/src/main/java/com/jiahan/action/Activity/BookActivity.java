package com.jiahan.action.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jiahan.action.Adapter.BookAdapter;
import com.jiahan.action.Adapter.RecyclerItemClickListener;
import com.jiahan.action.Dao.Book;
import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DaoSession;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;

import java.util.List;

public class BookActivity extends AppCompatActivity {

    /*  private DaoSession daoSession;
  private BookDao bookDao;*/
    private MyAplication myApp;
    private RecyclerView mRecycleview;
    private BookAdapter myAdapter;
    private List<Book> list;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        mContext = BookActivity.this;

        myApp = (MyAplication) getApplication();
      /*  daoSession = myApp.getDaoSession();
        bookDao = daoSession.getBookDao();*/
        mRecycleview = (RecyclerView) findViewById(R.id.recyclerview_book);
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));
        list = myApp.getDaoSession().getBookDao().loadAll();
        myAdapter = new BookAdapter(list);
        mRecycleview.setAdapter(myAdapter);
        mRecycleview.setItemAnimator(new DefaultItemAnimator());
        mRecycleview.addOnItemTouchListener(new RecyclerItemClickListener(mContext, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Book book = list.get(position);
                Intent intent = new Intent(mContext,BookdetailsActivity.class);
              //  intent.putExtra("book",book);
                startActivity(intent);
            }
        }));









        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookActivity.this,AddBookActivity.class);
                startActivity(intent);
              /*  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }





}
