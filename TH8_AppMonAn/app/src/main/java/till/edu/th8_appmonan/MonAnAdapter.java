package till.edu.th8_appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(ArrayList<MonAn> dsMonAn, Context context) {
        this.dsMonAn = dsMonAn;
        this.layoutInflater = layoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //view của item hiện hành
        View viewHienHanh = convertView;
        //kiểm tra
        if(viewHienHanh==null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan,null);
        //lấy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(position);
        //Gán lên các điều khiển

        //Tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAnh);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set tên
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_TenMon.setText(monAnHienTai.getMoTa());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());
        return viewHienHanh;
    }
}
