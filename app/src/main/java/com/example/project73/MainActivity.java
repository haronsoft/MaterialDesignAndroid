package com.example.project73;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<ListDomain> listNews = new ArrayList<>();
        listNews.add(new ListDomain("Browsing Bruges in Belgium", "pic1"));
        listNews.add(new ListDomain("Covid-19 in the Airport", "pic2"));
        listNews.add(new ListDomain("US-China War", "pic3"));
        listNews.add(new ListDomain("Browsing Bruges in Belgium", "pic1"));

        adapter = new NewsAdapter(listNews);
        recyclerView.setAdapter(adapter);
    }
}