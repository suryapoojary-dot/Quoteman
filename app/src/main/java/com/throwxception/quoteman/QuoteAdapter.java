package com.throwxception.quoteman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {

    private Quote[] quotey;

    QuoteAdapter(Quote[] quotes) {
        this.quotey = quotes;
    }

    @Override
    public int getItemCount() {
        return quotey.length;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new QuoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder, int position) {

        holder.bind(quotey[position]);

    }



    static class QuoteViewHolder extends RecyclerView.ViewHolder {

        ImageView appImage;
        TextView appTitle;
        TextView appQuote;
       public QuoteViewHolder(@NonNull View itemView) {
           super(itemView);
           appImage = itemView.findViewById(R.id.image_view_person_logo);
           appTitle = itemView.findViewById(R.id.text_view_person_name);
           appQuote = itemView.findViewById(R.id.text_view_person_said);
       }

       public  void bind(Quote quote){

           appTitle.setText(quote.name);
           appQuote.setText(quote.the_quote);
           appImage.setImageResource(quote.image);

       }
   }


}
