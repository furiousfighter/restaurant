package com.example.sem7project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] food;
    Integer[] imaf;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext,String[] food,Integer[] imaf)
    {
        this.context = context;
        this.food = food;
        this.imaf = imaf;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rview = inflter.inflate(R.layout.firstlst, null);
        TextView foodi = (TextView)rview.findViewById(R.id.txtt);
        ImageView imafi = (ImageView)rview.findViewById(R.id.ima);
        foodi.setText(food[position]);
        imafi.setImageResource(imaf[position]);
        return view;
    }
}
