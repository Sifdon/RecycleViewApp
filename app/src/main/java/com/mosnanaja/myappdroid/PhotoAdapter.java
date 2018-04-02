package com.mosnanaja.myappdroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.mosnanaja.myappdroid.PhotoViewHolder;
import com.mosnanaja.myappdroid.R;


public class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.crad_view, parent, false);
        PhotoViewHolder pv = new PhotoViewHolder(view);
        return pv;
    }

    @Override
    public void onBindViewHolder(PhotoViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

