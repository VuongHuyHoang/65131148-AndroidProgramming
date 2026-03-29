package till.edu.danhsachtinhthanhpho;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN;//Khai báo

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
        //Hiển thị dữ liệu lên ListView
        //b1:Cần có dữ liệu
        //??Từ đâu có: Từ cơ sở dữ liệu(SQL, noSQL, XML, ...)
        //Ở bài này, chúng ta hard-code dữ liệu trực tiếp

        dsTenTinhThanhVN = new ArrayList<String>(); //Tạo thể hiện cụ thể, xin mới
        //thêm dữ liệu ở đây (đúng ra, ta phải đọc từ một nguồn
        //Nhưng ta hard-code (cho sẵn để demo)
        dsTenTinhThanhVN.add("Hà nội");
        dsTenTinhThanhVN.add("Thành Phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        //B2. Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN);

        //B3. Gắn vào điều khiển hiển thị ListView
        //3.1, Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lý sự kiện user tương tác
        //để sau
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);

    }
    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
    //vd: BoLangNghevaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Code xử lý ở đây
            // position là vị trí phần từ vừa được click
            // ví dụ xử lý ở đây, là hiện lên màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
//            Toast.makeText(MainActivity.this,"Bạn vừa chọn: "+String.valueOf(position),Toast.LENGTH_LONG).show();

            // Ví dụ khác: Lấy giá trị của phần tử i
            String strTenTinh=dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this,strTenTinh,Toast.LENGTH_LONG).show();

        }
    };
}