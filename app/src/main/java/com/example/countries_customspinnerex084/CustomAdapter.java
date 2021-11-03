package com.example.countries_customspinnerex084;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] countryList;
    String[] capitalList;
    int flags_list[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] countryList, String[] capitalList, int[] flags_list) {
        this.countryList = countryList;
        this.capitalList = capitalList;
        this.flags_list = flags_list;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_lv_layout, null);
        TextView states = (TextView) view.findViewById(R.id.nState);
        TextView capital = (TextView) view.findViewById(R.id.nCapital);
        ImageView flags = (ImageView) view.findViewById(R.id.iV);
        states.setText(countryList[i]);
        capital.setText(capitalList[i]);
        flags.setImageResource(flags_list[i]);
        return view;
    }
}
