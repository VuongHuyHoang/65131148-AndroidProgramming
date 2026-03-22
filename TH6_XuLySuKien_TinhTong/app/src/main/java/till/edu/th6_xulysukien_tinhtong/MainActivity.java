package till.edu.th6_xulysukien_tinhtong;

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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
        EditText editTextsoA = findViewById(R.id.edtA);
        EditText editTextsoB = findViewById(R.id.edtB);
        EditText editTextKetqua = findViewById(R.id.edtKetQua);
        //lấy dữ liệu về
        String strA = editTextsoA.getText().toString();
        String strB = editTextsoB.getText().toString();
        //chuyển sang dạng số
        int so_a = Integer.parseInt(strA);
        int so_b = Integer.parseInt(strB);
        //Tính tổng theo yêu cầu
        int tong = so_a+so_b;
        String strTong = String.valueOf(tong);
        //hiện ra màn hình
        editTextKetqua.setText(strTong);
    }
}