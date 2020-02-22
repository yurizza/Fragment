package com.example.recyclerviewpahlawan;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.ViewHolder>
{
    private Context context;
    private ArrayList<PahlawanModel> pahlawanModels;

    public PahlawanAdapter(Context context){
        this.context=context;
    }
    public ArrayList<PahlawanModel> getPahlawanModels() {
        return pahlawanModels;
    }

    public void setPahlawanModels(ArrayList<PahlawanModel> pahlawanModels) {
        this.pahlawanModels = pahlawanModels;
    }

    @NonNull
    @Override
    public PahlawanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pahlawan,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getPahlawanModels().get(i).getImgPahlawan()).into(viewHolder.ivImgPahlawan);
        viewHolder.tvNamaPahlawan.setText(getPahlawanModels().get(i).getNamaPahlawan());
    }

    @Override
    public int getItemCount() {

        return getPahlawanModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImgPahlawan;
        private TextView tvNamaPahlawan;
        private LinearLayout linearlayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImgPahlawan = itemView.findViewById(R.id.ivPahlawan);
            tvNamaPahlawan = itemView.findViewById(R.id.tvnamaPahlawan);
            linearlayout = itemView.findViewById(R.id.linearlayout);
            linearlayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent = new Intent(context, detailPahlawan.class);
                            intent.putExtra("nama","Ahmad Dahlan");
                            break;
                        case 1:
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama","Ahmad Yani");
                        case 2 :
                            intent = new Intent(context, detailPahlawan.class);
                            intent.putExtra("nama", "Sutomo");
                            break;
                        case 3 :
                            intent = new Intent(context, detailPahlawan.class);
                            intent.putExtra("nama", "Gatot Soebroto");
                            break;
                        case 4 :
                            intent = new Intent(context, detailPahlawan.class);
                            intent.putExtra("nama","Ki Hadjar Dewantarai");
                            break;
                        case 5 :
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama", "Mohammad Hatta");
                            break;
                        case 6 :
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama", "Soedirman");
                            break;
                        case 7 :
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama","Soekarno");
                            break;
                        case 8 :
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama", "Soepomo");
                            break;
                        case 9 :
                            intent = new Intent(context,detailPahlawan.class);
                            intent.putExtra("nama","Tan Malaka");
                            break;
                    }
                    intent.putExtra("id",getAdapterPosition());
                    context.startActivity(intent);
                }
            });

        }
    }
}
