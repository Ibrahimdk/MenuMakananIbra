package com.example.week6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {

    public KulinerAdapter(ArrayList<Kuliner> listKuliner) {
        this.listKuliner = listKuliner;
    }

    private ArrayList<Kuliner> listKuliner;

    @NonNull
    @Override
    public KulinerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {

        Kuliner kuliner = listKuliner.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtHarga.setText(kuliner.getHarga());
        holder.imgFoto.setImageResource(kuliner.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(holder.itemView.getContext(), kuliner.getDeskripsi(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("foto_makanan",kuliner.getId_gambar());
                intent.putExtra("info_makanan",kuliner.getDeskripsi());
                intent.putExtra("nama_makanan",kuliner.getNama());
                intent.putExtra("harga", kuliner.getHarga());

                view.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
