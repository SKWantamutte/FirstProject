package com.example.skumars.firstproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class RouteListAdapter extends
        RecyclerView.Adapter<RouteListAdapter.RouteViewHolder> {

    private final LinkedList<String> mRouteList;
    private LayoutInflater mInflater;

    public RouteListAdapter(Context context, LinkedList<String> routeList) {
        mInflater = LayoutInflater.from(context);
        mRouteList = routeList;
    }

    @NonNull
    @Override
    public RouteListAdapter.RouteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View mItemView = mInflater.inflate(R.layout.route_list, viewGroup, false);
        return new RouteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RouteListAdapter.RouteViewHolder routeViewHolder, int position) {
        String mCurrent = mRouteList.get(position);
        routeViewHolder.routeItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mRouteList.size();
    }

    class RouteViewHolder extends RecyclerView.ViewHolder
    {
        public final TextView routeItemView;
        final RouteListAdapter mAdapter;

        public RouteViewHolder(View itemView, RouteListAdapter adapter) {
            super(itemView);
            routeItemView = itemView.findViewById(R.id.route);
            this.mAdapter = adapter;
        }
    }
}
