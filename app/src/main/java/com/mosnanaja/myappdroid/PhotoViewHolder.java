package com.mosnanaja.myappdroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mosnanaja.myappdroid.R;

class PhotoViewHolder extends RecyclerView.ViewHolder {

    ImageView photo;

    public PhotoViewHolder(View itemView) {
        super(itemView);
        photo = itemView.findViewById(R.id.im_photo);
    }

}
