package till.edu.demo_linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Khai báo các biến giao diện
        EditText edtF,edtC;
        Button btnCF,btnFC,btnclear;
        edtF = findViewById(R.id.edtF);
        edtC = findViewById(R.id.edtC);

        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnclear = findViewById(R.id.btnclear);

        //Xử lý click
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int C = Integer.parseInt(edtC.getText().toString());
                Double F = C*1.8+32;
                edtF.setText(dcf.format(F)+"");
            }
        });

        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int F = Integer.parseInt(edtF.getText().toString());
                double C = (F-32)*1.8;
                edtC.setText(dcf.format(C)+"");
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtF.setText("");
                edtC.setText("");
            }
        });
    }
}