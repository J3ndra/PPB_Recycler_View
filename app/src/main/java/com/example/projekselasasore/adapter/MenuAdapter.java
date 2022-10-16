package com.example.projekselasasore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projekselasasore.R;
import com.example.projekselasasore.model.MenuModel;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.myViewHolder> {

    ArrayList<MenuModel> modelArrayList;
    Context context;

    public MenuAdapter(ArrayList<MenuModel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.format_tampilan_menu, parent, false);

        return new MenuAdapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.gambar_menu.setImageResource(modelArrayList.get(position).getGambarMenu());
        holder.c_nama_menu.setText(modelArrayList.get(position).getNamaMenu());
        holder.c_harga_menu.setText(modelArrayList.get(position).getHargaMenu());
        holder.c_satuan_menu.setText(modelArrayList.get(position).getSatuanMenu());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar_menu;
        TextView c_nama_menu, c_harga_menu, c_satuan_menu;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            gambar_menu = itemView.findViewById(R.id.iv_foto_makanan);
            c_nama_menu = itemView.findViewById(R.id.tv_nama_makanan);
            c_harga_menu = itemView.findViewById(R.id.tv_harga_makanan);
            c_satuan_menu = itemView.findViewById(R.id.tv_satuan_makanan);
        }
    }
}
