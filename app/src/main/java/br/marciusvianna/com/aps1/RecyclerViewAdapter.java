package br.marciusvianna.com.aps1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Info> mData ;

    public RecyclerViewAdapter(Context mContext, List<Info> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.TituloInfo.setText(mData.get(position).getName());
        holder.ImgMiniature.setImageResource(mData.get(position).getMiniature());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,InfoActivity.class);
                intent.putExtra("Name",mData.get(position).getName());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Miniature",mData.get(position).getMiniature());
                 mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView TituloInfo;
        ImageView ImgMiniature;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);
            TituloInfo = itemView.findViewById(R.id.infoId);
            ImgMiniature = itemView.findViewById(R.id.miniatureId);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
