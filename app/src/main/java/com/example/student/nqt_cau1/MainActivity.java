package com.example.student.nqt_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MovieAdapter fadt;
    ArrayList<movie> movieArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        movieArrayList.add(new movie("Wolfverin","American","30.000"));
        movieArrayList.add(new movie("SwordFish","American","15.000"));
        movieArrayList.add(new movie("DeadPool","American","29.000"));
        movieArrayList.add(new movie("RobinHood","American","35.000"));
        movieArrayList.add(new movie("EndGame","American","100.000"));
        movieArrayList.add(new movie("IronMan","American","70.000"));

        fadt = new MovieAdapter(MainActivity.this,movieArrayList , R.layout.movie_fim);
        listView.setAdapter(fadt);
    }
}
