package thigk2.VuongHuyHoang.BaiThiGiuaKi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2Activity extends AppCompatActivity {
    String thanhPho[] = {"Hà giang","Cà mau","Khánh hòa","Cam Ranh","Vương Huy Hoàng","Quãng Ngãi","Cà Mau", "Cần thơ","Hà Nội","Hồ chí minh","Bạc Liêu"};
    ArrayAdapter<String> myAdapter;
    ListView lv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ánh xạ id
        lv1 = findViewById(R.id.lv1);
        myAdapter = new ArrayAdapter<>(ChucNang2Activity.this, android.R.layout.simple_list_item_1,thanhPho);
        lv1.setAdapter(myAdapter);
    }
    public void ChuyenManHinhChucNang3(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this,ChucNang3Activity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
    public void ChuyenManHinhChucNang1(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, MainActivity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
    public void ChuyenManHinhChucNang4(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, ChucNang4Activity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }

}