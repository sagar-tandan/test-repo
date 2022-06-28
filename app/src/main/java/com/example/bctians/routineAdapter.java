package com.example.bctians;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class routineAdapter extends RecyclerView.Adapter<routineAdapter.routineViewHolder> {

    private Context context;
    private List<routineModel> list;

    public routineAdapter(Context context, List<routineModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public routineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.routne_activity,parent,false);
        return new routineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull routineViewHolder holder, int position) {

        holder.routineText1.setText(list.get(position).getRtext1());
        holder.routineText2.setText(list.get(position).getRtext2());
        holder.routineText3.setText(list.get(position).getRtext3());
        holder.routineText4.setText(list.get(position).getRtext4());
        holder.routineText5.setText(list.get(position).getRtext5());
       holder.date.setText("Need to update this section");

        holder.routineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "This is routine", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class routineViewHolder extends RecyclerView.ViewHolder {
        private TextView routineText1,routineText2,routineText3,routineText4,routineText5,date;
        private CardView routineCard;

        public routineViewHolder(@NonNull View itemView) {

            super(itemView);
            routineText1 = itemView.findViewById(R.id.routineText1);
            routineText2 = itemView.findViewById(R.id.routineText2);
            routineText3 = itemView.findViewById(R.id.routineText3);
            routineText4 = itemView.findViewById(R.id.routineText4);
            routineText5 = itemView.findViewById(R.id.routineText5);
            date = itemView.findViewById(R.id.date);
            routineCard = itemView.findViewById(R.id.routineCard);
        }
    }
}
