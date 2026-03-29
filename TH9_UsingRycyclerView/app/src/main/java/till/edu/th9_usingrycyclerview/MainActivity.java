package till.edu.th9_usingrycyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas =getDataforRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.rycyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this,recyclerViewDatas);
        //7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    //
    ArrayList<LandScape> getDataforRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("chua1","Chùa");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("effiel","effiel"));
        dsDuLieu.add(new LandScape("thapnghieng","Tháp nghiêng"));
        return dsDuLieu;
    };
}