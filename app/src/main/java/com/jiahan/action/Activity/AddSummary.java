package com.jiahan.action.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.jiahan.action.Dao.BookDao;
import com.jiahan.action.Dao.DaoSession;
import com.jiahan.action.Dao.Summary;
import com.jiahan.action.Dao.SummaryDao;
import com.jiahan.action.MyAplication;
import com.jiahan.action.R;
import com.orhanobut.dialogplus.DialogPlus;

public class AddSummary extends AppCompatActivity implements View.OnClickListener{

    private MyAplication myapp;
    private DaoSession mDaosession;
    private BookDao bookDao;
    private SummaryDao summaryDao;
    private EditText eT_bookName, eT_summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_summary);

        myapp = (MyAplication) getApplication();
        mDaosession = myapp.getDaoSession();
        bookDao = mDaosession.getBookDao();
        summaryDao = mDaosession.getSummaryDao();
        initview();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_addSummary);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void initview()
    {
        eT_bookName = (EditText) findViewById(R.id.summary_show_bookName);
        eT_bookName.setOnClickListener(this);
        eT_summary = (EditText) findViewById(R.id.summary_addSummary);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case  R.id.summary_show_bookName:
                // 选择一个书名，做为摘要的归属

        }
    }
}
