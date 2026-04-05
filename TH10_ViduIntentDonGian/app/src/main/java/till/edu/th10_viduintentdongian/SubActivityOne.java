package till.edu.th10_viduintentdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_one);

    }
    //Hàm đáp ứng sự kiện nhấn lên nút quay về trang chủ
    //Xử lý chuyển về màn hình trang chủ
    public void QuayVe(View v)
    {
        //Tạo một đối tươn Intent
        //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        //Thực hiện chuyển
        startActivity(iManHinhChinh);
    }
}