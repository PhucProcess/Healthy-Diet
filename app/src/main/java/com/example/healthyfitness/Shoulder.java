package com.example.healthyfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
public class Shoulder extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ClassShoulder> ShoulderList;
    private ClassShoulderAdapter ShoulderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        ShoulderList = ClassShoulder.init();
        ShoulderAdapter = new ClassShoulderAdapter(Shoulder.this,R.layout.item_shoulder,ShoulderList);
        mRecyclerView.setAdapter(ShoulderAdapter);
    }
}