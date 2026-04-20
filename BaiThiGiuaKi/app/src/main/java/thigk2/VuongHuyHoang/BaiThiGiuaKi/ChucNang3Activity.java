package thigk2.VuongHuyHoang.BaiThiGiuaKi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<DiaDiem> list;
    DiaDiemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listView);

        list = new ArrayList<>();

        // Hard-code 5 địa điểm
        list.add(new DiaDiem("VinWonders Nha Trang",
                "Đảo Hòn Tre, Nha Trang",
                R.drawable.vinwonders));

        list.add(new DiaDiem("Tháp Bà Ponagar",
                "2 Tháng 4, Vĩnh Phước",
                R.drawable.thapba));

        list.add(new DiaDiem("Hòn Mun",
                "Vịnh Nha Trang",
                R.drawable.honmun));

        list.add(new DiaDiem("Chùa Long Sơn",
                "22 Đường 23/10",
                R.drawable.chualongson));

        list.add(new DiaDiem("Nhà thờ Núi",
                "01 Thái Nguyên",
                R.drawable.nhatho));

        adapter = new DiaDiemAdapter(this, list);
        listView.setAdapter(adapter);
    }
    public void ChuyenManHinhChucNang1(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this,MainActivity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
    public void ChuyenManHinhChucNang2(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this,ChucNang2Activity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
    public void ChuyenManHinhChucNang4(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this,ChucNang4Activity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }

}