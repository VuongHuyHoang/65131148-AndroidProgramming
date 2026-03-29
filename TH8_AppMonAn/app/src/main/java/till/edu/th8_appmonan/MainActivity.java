package till.edu.th8_appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Tìm ListView
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        //Chuẩn bị nguồn dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn",25000,"Mô tả ở dây",R.drawable.ca));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng",27000,"Mô tả ở dây",R.drawable.cc));
        dsMonAn.add(new MonAn("Cơm chiên",29000,"Mô tả ở dây",R.drawable.cn));
        dsMonAn.add(new MonAn("Cơm gà",32000,"Mô tả ở dây",R.drawable.cs));
        dsMonAn.add(new MonAn("Cơm sườn bì chả",35000,"Mô tả ở dây",R.drawable.ct));

        //adpater
        MonAnAdapter adapter = new MonAnAdapter(dsMonAn,this);
        lvDSMonAn.setAdapter(adapter);

        //Bắt sự kiện xử lý
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Lấy phần tử được chọn
                MonAn monAnChon = dsMonAn.get(position);
                //Làm gì đó, tùy bài
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(),Toast.LENGTH_LONG).show();
            }
        });


    }
}