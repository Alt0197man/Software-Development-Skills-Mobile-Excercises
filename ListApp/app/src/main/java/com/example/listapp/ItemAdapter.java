package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] durations;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] dur, String[] desc) {
        items = i;
        durations = dur;
        descriptions = desc;

        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView durationTextView = (TextView) v.findViewById(R.id.durationTextView);
        TextView descriptionTextView = (TextView) v.findViewById((R.id.descriptionTextView));

        String name = items[i];
        String duration = durations[i];
        String description = descriptions[i];

        nameTextView.setText(name);
        durationTextView.setText(duration);
        descriptionTextView.setText(description);

        return v;
    }
}
