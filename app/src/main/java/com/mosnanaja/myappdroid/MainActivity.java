package com.mosnanaja.myappdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListPhoto =  findViewById(R.id.rv_list_photo);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvListPhoto.setLayoutManager(manager);

        PhotoAdapter photoAdapter = new PhotoAdapter();
        rvListPhoto.setAdapter(photoAdapter);




    }

}
