package com.jiahan.action.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jiahan.action.Dao.Book;
import com.jiahan.action.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2015/12/8 0008.
 */
public class SpinnerBookAdapter extends BaseAdapter {

    private Context mContext = null;
    private List<Book> listbook = new ArrayList<>();
    private LayoutInflater mInflater = null;


    public SpinnerBookAdapter(Context context ,List<Book> list)
    {
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
        this.listbook = list;
    }


    @Override
    public int getCount() {
        if(null == listbook || 0 == listbook.size())
        {
            return 0;
        }else
        {
            return listbook.size();
        }
    }

    @Override
    public Object getItem(int position) {
        if( null != listbook && 0 != listbook.size())
        {
            return listbook.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Book book = new Book();
        book = listbook.get(position);

        ViewHolder holder = null;

        if( null == convertView){
            convertView = mInflater.inflate(R.layout.item_spinnerbook,null);
            holder = new ViewHolder();
            holder.tv_bookname = (TextView) convertView.findViewById(R.id.textView_item_book);
            convertView.setTag(holder);

        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_bookname.setText(book.getBookName());
        return convertView;
    }


    public final class ViewHolder
    {
        TextView tv_bookname = null;
    }
}
