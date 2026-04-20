package thigk2.VuongHuyHoang.BaiThiGiuaKi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DiaDiemAdapter extends BaseAdapter {

    Context context;
    ArrayList<DiaDiem> list;

    public DiaDiemAdapter(Context context, ArrayList<DiaDiem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        if (view == null) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_dulich, parent, false);
        }

        ImageView img = view.findViewById(R.id.imgAnh);
        TextView ten = view.findViewById(R.id.txtTen);
        TextView diaChi = view.findViewById(R.id.txtDiaChi);

        DiaDiem d = list.get(i);

        img.setImageResource(d.getHinh());
        ten.setText(d.getTen());
        diaChi.setText(d.getDiaChi());

        return view;
    }
}
