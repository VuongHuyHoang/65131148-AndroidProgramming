package till.edu.th9_usingrycyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter <LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder holderCreate=new ItemLandHolder(vItem);

        return holderCreate;

    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandScape landScapeHienThi = lstData.get(position);
        //Trích thông thin
        String caption = landScapeHienThi.getLandCaption();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        //Đặt vào các trường thông tin của holder
        holder.tvCapTion.setText(caption);
        //Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh,"drawable",packageName);
        holder.imageViewLandScape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCapTion;
        ImageView imageViewLandScape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            this.tvCapTion = itemView.findViewById(R.id.textViewCapTion);
            this.imageViewLandScape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Code o day
            int viTriDuocClick = getAdapterPosition();
            LandScape phanTuDuocClick = lstData.get(viTriDuocClick);
            //Bóc thông tin
            String ten = phanTuDuocClick.getLandCaption();
            String tenFile = phanTuDuocClick.getLandImageFileName();
            //Toast Tên
            String chuoiThongBao = "Bạn vừa click vào: "+ten;
            Toast.makeText(v.getContext(),chuoiThongBao,Toast.LENGTH_LONG).show();
        }
    }
}
