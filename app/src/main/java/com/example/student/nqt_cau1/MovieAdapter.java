package com.example.student.nqt_cau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    Context ctx;
    ArrayList<movie> listmovie;
    int layout;

    public MovieAdapter(Context ctx, ArrayList<movie> listmovie, int layout) {
        this.ctx = ctx;
        this.listmovie = listmovie;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listmovie.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        view = inflater.inflate(R.layout.movie_fim, null);

        // Ánh xạ
        TextView name = view.findViewById(R.id.name);
        TextView quoctich = view.findViewById(R.id.quoctich);
        TextView giatien = view.findViewById(R.id.giave);



        // Gán giá trị
        name.setText(listmovie.get(i).getName());
        quoctich.setText(listmovie.get(i).getQuoctich());
        giatien.setText(listmovie.get(i).getGiatien());




        return view;
    }
}
