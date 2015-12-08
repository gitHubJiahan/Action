package com.jiahan.action.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

import com.jiahan.action.Dao.Book;
import com.jiahan.action.R;
import com.jiahan.action.databinding.BooksItemBinding;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Administrator on 2015/10/22 0022.
 */
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    public static final int LAST_POSTION = -1 ;

    private final List<Book> mData ;




    private static final int ANIMATED_ITEMS_COUNT = 4;

    private boolean animateItems = false;
    private int lastAnimatedPosition = -1;

    public static BookAdapter newInstance()
    {
          List<Book> books = new ArrayList<Book>();
          return new BookAdapter(books);
    }

    public BookAdapter(List<Book> mData) {
        this.mData = mData;

    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater  inflater = LayoutInflater.from(context);
        View booksContainer = inflater.inflate(R.layout.books_item,parent,false);
        return new BookViewHolder(booksContainer);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book book= mData.get(position);
        holder.bind(book);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setBooks(List<Book> books)
    {
       this.mData.clear();
        this.mData.addAll(books);
        notifyDataSetChanged();

    }

/*
    private void runEnterAnimation(View view, int position) {
        if (!animateItems || position >= ANIMATED_ITEMS_COUNT - 1) {
            return;
        }

        if (position > lastAnimatedPosition) {
            lastAnimatedPosition = position;
            view.setTranslationY(Utils.getScreenHeight(getActivity()));
            view.animate()
                    .translationY(0)
                    .setStartDelay(100 * position)
                    .setInterpolator(new DecelerateInterpolator(3.f))
                    .setDuration(700)
                    .start();
        }
    }*/

    public class BookViewHolder extends RecyclerView.ViewHolder
    {

      private BooksItemBinding binding;
        public BookViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
        public void bind(Book book)
        {
            binding.setBook(book);
        }


    }
}
