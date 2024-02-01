package com.throwxception.quoteman;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {


    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class QuoteViewHolder extends RecyclerView.ViewHolder {

       public QuoteViewHolder(@NonNull View itemView) {
           super(itemView);
       }
   }


}
