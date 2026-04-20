package thigk2.VuongHuyHoang.BaiThiGiuaKi;

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
    EditText edtChieuDai,edtChieuRong,edtKetQua;
    Button btnTinh;
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
        //Ánh xạ
        edtChieuDai = findViewById(R.id.edtChieuDai);
        edtChieuRong = findViewById(R.id.edtChieuRong);
        edtKetQua = findViewById(R.id.edtKetQua);
        btnTinh = findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double chieudai = Double.parseDouble(edtChieuDai.getText().toString());
                double chieuRong = Double.parseDouble(edtChieuRong.getText().toString());

                double ketQua = (chieudai+chieuRong)*2;

                edtKetQua.setText(ketQua+"");
            }
        });
    }
}