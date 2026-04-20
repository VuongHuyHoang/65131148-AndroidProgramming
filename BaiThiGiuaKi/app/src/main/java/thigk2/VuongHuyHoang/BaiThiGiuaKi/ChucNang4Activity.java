package thigk2.VuongHuyHoang.BaiThiGiuaKi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang4Activity extends AppCompatActivity {

    ImageView imgAvatar;
    TextView txtHoTen, txtSoThich, txtSoTruong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang4);

        imgAvatar = findViewById(R.id.imgAvatar);
        txtHoTen = findViewById(R.id.txtHoTen);
        txtSoThich = findViewById(R.id.txtSoThich);
        txtSoTruong = findViewById(R.id.txtSoTruong);

        // Set dữ liệu (hard-code)
        imgAvatar.setImageResource(R.drawable.anhdaidien);

        txtHoTen.setText("Họ tên: Vương huy hoàng");
        txtSoThich.setText("Sở thích: Lập trình, chơi game, nghe nhạc");
        txtSoTruong.setText("Sở trường: Java, C++");
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
    public void ChuyenManHinhChucNang3(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this,ChucNang3Activity.class);
        //Thực hiện chuyển
        startActivity(iManHinhKhac);
    }
}