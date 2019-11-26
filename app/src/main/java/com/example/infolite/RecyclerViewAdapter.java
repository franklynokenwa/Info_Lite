package com.example.infolite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mTextDescriptions = new ArrayList<>();
    private ArrayList<String> mSiteIcons = new ArrayList<>();
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;

    public RecyclerViewAdapter(Context context, ArrayList<String> textDescriptions, ArrayList<String> siteIcons) {
        mContext = context;
        mSiteIcons = siteIcons;
        mTextDescriptions = textDescriptions;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.info_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mSiteIcons.get(position))
                .placeholder(R.drawable.ic_action_name) //placeholder
                .error(R.drawable.ic_launcher_background)
                .fitCenter()
                .into(holder.mSiteIcon);


        holder.mTextDescription.setText(mTextDescriptions.get(position));
    }

    @Override
    public int getItemCount() {
        return mTextDescriptions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mTextDescription;
        public final ImageView mSiteIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextDescription = itemView.findViewById(R.id.textView);
            mSiteIcon = itemView.findViewById(R.id.imageView);
        }
    }
}