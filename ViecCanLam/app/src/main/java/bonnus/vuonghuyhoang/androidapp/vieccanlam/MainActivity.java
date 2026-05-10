package bonnus.vuonghuyhoang.androidapp.vieccanlam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TASKS> lstVCL;
    TaskRVadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo kê nối đddeen CSDL
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS"); //đi từ nút gốc (ở đây là nút Task)

        //Lắng nghe và xử lý
        lstVCL = new ArrayList<TASKS>();
        databaseReference.addValueEventListener(NgheFB);

        //Tìm điều khiển
        RecyclerView recyclerView  = findViewById(R.id.rcvVCL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        adapter = new TaskRVadapter(lstVCL);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    ValueEventListener NgheFB = new ValueEventListener() {

        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            lstVCL.clear();
            //Lấy dữ lệu từ biến snapshot. đưa vào một biến danh sách để xử lý
            for(DataSnapshot obj: snapshot.getChildren()){
                TASKS task= obj.getValue(TASKS.class);
                lstVCL.add(task);
//                Log.w("VCL app","Việc cần làm: "+task.getName() );
            }
            adapter.notifyDataSetChanged();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    };

    public void SangTrangThem(View v){
        Intent intent = new Intent(MainActivity.this, ThemTaskActivity.class);
        startActivity(intent);
    }
}