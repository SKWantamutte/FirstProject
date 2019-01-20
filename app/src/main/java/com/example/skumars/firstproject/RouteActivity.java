package com.example.skumars.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class RouteActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RouteListAdapter mAdapter;
    private final LinkedList<String> mRouteList = new LinkedList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_activity);

        //Initialize Route List
        mRouteList.addLast("335E: ITPL <-> Majestic");
        mRouteList.addLast("500CA: ITPL <-> Banashankari");
        mRouteList.addLast("500D: Banashankari <-> Hebbal");

        //Get handle to recycler view
        mRecyclerView = findViewById(R.id.recyclerview);

        //Ceate an adapter and supply  the data to be displayed.
        mAdapter = new RouteListAdapter(this, mRouteList);

        //Connect the adapter with the RecyclerView
        mRecyclerView.setAdapter(mAdapter);

        //Give the RecyclerView a default layout manger.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
