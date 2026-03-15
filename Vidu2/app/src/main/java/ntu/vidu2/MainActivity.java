package ntu.vidu2;

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
    public void XuLyCong(View v){
        //Code xử lý cộng ở đây
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm edittext số 1 và số 2

        //b1.2 lấy dữ liệu từ 2 điều khiền đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //b1.3 Chuyển dữ liệu tu chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //b2. Tính toán
        float Tong = soA + soB;

        //b3. Hiển thị kết quả

        //b3.2 chuẩn bị dữ liệu xuất
        String chuoiKQ = String.valueOf(Tong);

        //b3.3 gắn kết quả lên đk
        editTextKetQua.setText(chuoiKQ);


    }
    public void XuLyTru(View v){
        //Code xử trừ ở đây
        //Code xử lý cộng ở đây
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm edittext số 1 và số 2


        //b1.2 lấy dữ liệu từ 2 điều khiền đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //b1.3 Chuyển dữ liệu tu chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //b2. Tính toán
        float Tru = soA - soB;

        //b3. Hiển thị kết quả

        //b3.2 chuẩn bị dữ liệu xuất
        String chuoiKQ = String.valueOf(Tru);

        //b3.3 gắn kết quả lên đk
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        //Code xử lý nhân ở đây
        //Code xử lý cộng ở đây
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm edittext số 1 và số 2


        //b1.2 lấy dữ liệu từ 2 điều khiền đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //b1.3 Chuyển dữ liệu tu chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //b2. Tính toán
        float Nhan = soA * soB;

        //b3. Hiển thị kết quả


        //b3.2 chuẩn bị dữ liệu xuất
        String chuoiKQ = String.valueOf(Nhan);

        //b3.3 gắn kết quả lên đk
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        //Code xử lý chia ở đây
        //Code xử lý cộng ở đây
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm edittext số 1 và số 2


        //b1.2 lấy dữ liệu từ 2 điều khiền đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //b1.3 Chuyển dữ liệu tu chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //b2. Tính toán
        float Chia = soA / soB;

        //b3. Hiển thị kết quả


        //b3.2 chuẩn bị dữ liệu xuất
        String chuoiKQ = String.valueOf(Chia);

        //b3.3 gắn kết quả lên đk
        editTextKetQua.setText(chuoiKQ);
    }
}