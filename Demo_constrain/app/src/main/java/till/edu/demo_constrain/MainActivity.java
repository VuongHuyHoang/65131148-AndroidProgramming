package till.edu.demo_constrain;

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

    // Khai báo các biến giao diện
    EditText edtA,edtB,edtKQ;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Ánh xạ ID cho các biến giao diện
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtb);
        edtKQ = findViewById(R.id.edtkq);
        btnTong = findViewById(R.id.btnTong);

        //Xử lí tương tác với người dùng
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString()); //lấy dữ liệu từ edtA, ép sang kiểu int
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a+b;

                edtKQ.setText(String.valueOf(c));

            }
        });
    }
}