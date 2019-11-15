package com.example.buahpedia;

import android.view.View;

class CustomOnListClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnListClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
