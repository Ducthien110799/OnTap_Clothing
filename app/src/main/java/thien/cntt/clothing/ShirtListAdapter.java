package thien.cntt.clothing;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShirtListAdapter extends RecyclerView.Adapter<ShirtListAdapter.ShirtViewHolder> {

    private LayoutInflater layoutInflater;
    private ArrayList<Shirt> shirtArrayList;
    Context context;

    public ShirtListAdapter(Context context, ArrayList<Shirt> shirtArrayList) {
        layoutInflater= LayoutInflater.from(context);
        this.shirtArrayList = shirtArrayList;
        this.context= context;
    }

    @NonNull
    @Override
    public ShirtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView= layoutInflater.inflate(R.layout.shirt_item, parent, false);
        return new ShirtViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ShirtViewHolder holder, int position) {
        final Shirt mCurrent = shirtArrayList.get(position);
        holder.name.setText(mCurrent.getName());
        holder.price.setText(mCurrent.getPrice());
        holder.img.setImageResource(mCurrent.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Activity_Info.class);
                intent.putExtra("name",mCurrent.getName());
                intent.putExtra("price", mCurrent.getPrice());
                intent.putExtra("img", mCurrent.getImg());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return shirtArrayList.size();
    }

    public class ShirtViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView price;
        private ImageView img;
        ShirtListAdapter shirtListAdapter;

        public ShirtViewHolder(@NonNull View itemView, ShirtListAdapter adapter) {
            super(itemView);
            name= itemView.findViewById(R.id.tvName);
            price= itemView.findViewById(R.id.tvPrice);
            img= itemView.findViewById(R.id.img);

            this.shirtListAdapter= adapter;
        }
    }
}
