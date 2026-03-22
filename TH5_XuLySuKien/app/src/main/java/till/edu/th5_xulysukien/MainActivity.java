package till.edu.th5_xulysukien;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai báo các đôí tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;

    Button nutCong,nutTru,nutNhan,nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        // Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        View.OnClickListener bolangngheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý cộng ở đây
                XuLy_Cong();
            }
        };
        nutCong.setOnClickListener(bolangngheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Tru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Nhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Chia();
            }
        });
    }
    void TimDieuKhien()
    {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKetQua = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.BtnTru);
        nutNhan = (Button) findViewById(R.id.BtnNhan);
        nutChia = (Button) findViewById(R.id.BtnChia);
    }
    public void XuLy_Cong(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong = num1+num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLy_Tru(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong = num1-num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLy_Nhan(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong = num1*num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLy_Chia(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong = num1/num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKetQua.setText(chuoiKQ);
    }

}