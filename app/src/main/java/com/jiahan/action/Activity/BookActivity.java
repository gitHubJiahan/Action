package com.jiahan.action.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jiahan.action.Dao.Book;
import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DaoSession;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;

import java.util.List;

public class BookActivity extends AppCompatActivity {

    private MyAplication myApp;
    private DaoSession daoSession;
    private BookDao bookDao;

    private TextView textView;
    private List<Book> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        myApp = (MyAplication) getApplication();
        daoSession = myApp.getDaoSession();
        bookDao = daoSession.getBookDao();

        list = bookDao.loadAll();

        textView = (TextView) findViewById(R.id.textView2);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<list.size();i++)
        {
            Book book = list.get(i);

            stringBuilder.append(book.getBookName()+","+book.getId());
        }

        textView.setText(stringBuilder);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
