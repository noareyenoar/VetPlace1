package com.porducer.vetplace1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Surfing extends AppCompatActivity {
    private RecyclerView recycleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfing);
        recycleView =findViewById(R.id.CN_recycleview);
        recycleView.setAdapter(new Adapter());
        TextView wasd = findViewById(R.id.wasd);
        wasd.setText("Done!");
    }

    public class Adapter extends RecyclerView.Adapter<Holder>{

        @NonNull
        @Override
        public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

            View v =LayoutInflater.from(getApplicationContext()).inflate(R.layout.cn, viewGroup, false);

            return new Holder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull Holder holder, int position) {
            holder.name.setText("Yes!");
        }

        @Override
        public int getItemCount() {
            return 9;
        }
    }

    public class Holder extends RecyclerView.ViewHolder{

        TextView name;
        TextView detail;
        ImageView logo1;
        ImageView logo2;
        ImageView logo3;

        public Holder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            detail = (TextView) itemView.findViewById(R.id.detail);
            logo1 = (ImageView) itemView.findViewById(R.id.logo1);
            logo2 = (ImageView) itemView.findViewById(R.id.logo2);
            //logo3 = (ImageView) itemView.findViewById(R.id.logo3);
        }
    }

}
