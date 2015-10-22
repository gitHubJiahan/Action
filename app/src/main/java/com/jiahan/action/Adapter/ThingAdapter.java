package com.jiahan.action.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiahan.action.Dao.Thing;
import com.jiahan.action.R;
import com.jiahan.action.databinding.ThingsItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/22 0022.
 */
public class ThingAdapter extends RecyclerView.Adapter<ThingAdapter.ThingViewHolder> {

    private final List<Thing> mData;



    public static ThingAdapter newInstance()
    {
        List<Thing> things = new ArrayList<Thing>();
        return new ThingAdapter(things);
    }

    public ThingAdapter(List<Thing> things) {
        this.mData = things;
    }

    public void  setThings(List<Thing> things)
    {
        mData.clear();
        mData.addAll(things);
        notifyDataSetChanged();
    }

    @Override
    public ThingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View thingsContainer = inflater.inflate(R.layout.things_item,parent,false);
        return new ThingViewHolder(thingsContainer);
    }

    @Override
    public void onBindViewHolder(ThingViewHolder holder, int position) {
        Thing thing = mData.get(position);
        holder.bind(thing);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ThingViewHolder extends RecyclerView.ViewHolder
    {
        private ThingsItemBinding binding;
        public ThingViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
        public void bind(Thing thing)
        {
            binding.setThing(thing);
        }

    }
}
