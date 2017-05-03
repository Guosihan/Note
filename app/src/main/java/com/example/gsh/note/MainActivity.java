package com.example.gsh.note;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<NoteData> mArrayList=new ArrayList<NoteData>();
    private RecyclerView mRecyclerView;

    private NoteAdapter mNoteAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initViews();
        System.out.print(mArrayList);
    }

    private void initData() {

        NoteData n=new NoteData();
        n.setTitle("第一次日记");
        n.setCreatTime("2017");
        n.setContent("ahahhahaha");
        n.setSecondTitle("diyci");

        mArrayList.add(n);
        mArrayList.add(n);
        mArrayList.add(n);
        mArrayList.add(n);
        mArrayList.add(n);
        mArrayList.add(n);
        mArrayList.add(n);
    }
    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
//        LinearLayoutManager manger = new LinearLayoutManager(this);
//        manger.setOrientation(LinearLayoutManager.HORIZONTAL);
//        GridLayoutManager manager = new GridLayoutManager(this, 3);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mNoteAdapter = new NoteAdapter(mArrayList);
        mRecyclerView.setAdapter(mNoteAdapter);

    }
}
