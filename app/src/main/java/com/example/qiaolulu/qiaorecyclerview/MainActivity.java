package com.example.qiaolulu.qiaorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<SongInfo> mList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSongDate();
        initView();
    }

    public void initView() {
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        SongAdapter adapter = new SongAdapter(mList);
        adapter.setOnClickListener(new SongAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                SongInfo songInfo = mList.get(position);
                Toast.makeText(MainActivity.this,songInfo.getSong(),Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);
    }

    private void initSongDate() {
        for (int i = 0; i < 10; i++) {
            SongInfo info1 = new SongInfo("1", "flames", "02:18");
            mList.add(info1);
            SongInfo info2 = new SongInfo("2", "lucy", "01:36");
            mList.add(info2);
            SongInfo info3 = new SongInfo("3", "solider", "03:45");
            mList.add(info3);
            SongInfo info4 = new SongInfo("4", "lucy", "04:03");
            mList.add(info4);
            SongInfo info5 = new SongInfo("5", "flames", "09:24");
            mList.add(info5);
            SongInfo info6 = new SongInfo("6", "solider", "03:24");
            mList.add(info6);
            SongInfo info7 = new SongInfo("7", "lucy", "02:41");
            mList.add(info7);
            SongInfo info8 = new SongInfo("8", "flames", "03:47");
            mList.add(info8);
            SongInfo info9 = new SongInfo("9", "solider", "03:53");
            mList.add(info9);
        }

    }
}
