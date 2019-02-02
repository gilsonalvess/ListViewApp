package com.dwm.ufg.listviewapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TimeAdapter extends BaseAdapter {

    private final ArrayList<Time> times;
    private final Activity activity;

    public TimeAdapter(ArrayList<Time> times, Activity activity) {
        this.times = times;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = activity.getLayoutInflater()
                .inflate(R.layout.lista_times_personalizada, parent, false);

        Time time = times.get(position);

        TextView nome = (TextView) rowView.findViewById(R.id.lista_times_personalizada_nome);
        ImageView img = (ImageView) rowView.findViewById(R.id.lista_times_personalizada_img);

        nome.setText(time.getNome());
        img.setImageResource(time.getBrasao());


        return rowView;
    }
}
