package till.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn Layout tương ứng với file này

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Đây là bộ lắng nghe và sử xử li sự kiện click lên nút tính tổng
    public void XuLyCong(View view) {
        //Tìm, tham chiếu đến điêù khiển trên tệp xml
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKetQua = findViewById(R.id.edtKetQua);

        //Lấy dữ lệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString(); //strA = "2"
        //Lấy dữ lệu về ở điều khiển số a
        String strB = editTextSoB.getText().toString(); //strB = "2"

        //Chuyển dữ liệu sang dạng số
        int so_a = Integer.parseInt(strA); //2
        int so_b = Integer.parseInt(strB); //2

        //Tính toán theo yêu cầu
        int cong = so_a+so_b;
        String strTong = String.valueOf(cong); // chuyển sang dạng chuỗi: "4"
        //Hiện ra màn hình
        editTextSoKetQua.setText(strTong);
    }
}