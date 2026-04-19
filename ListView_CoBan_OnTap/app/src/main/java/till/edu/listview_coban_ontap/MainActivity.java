package till.edu.listview_coban_ontap;

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

public class MainActivity extends AppCompatActivity {

    String myPhone[] = {"Điện thoại","SamSung","Iphone","Oppo","Nokia","BPhone","ViSmart"};
    ArrayAdapter<String> myAdapter;
    ListView lv1;
    TextView txtSelect;

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
        //ánh xạ id
        txtSelect = findViewById(R.id.txtSelect);
        lv1 = findViewById(R.id.lv1);
        myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,myPhone);
        lv1.setAdapter(myAdapter);
        //Bắt sự kiện click vào item của listView
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtSelect.setText("Vị trí: "+position+" "+myPhone[position]);
            }
        });
    }
}