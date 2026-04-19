package till.edu.baitonghopcoban;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtHoTen, edtCMND, edtBoSung;
    Button btnGui;
    RadioGroup idGroup;
    CheckBox chkDocBao, chkDocSach, chkCoding;

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

        //Ánh xạ id
        edtHoTen = findViewById(R.id.edtHoTen);
        edtCMND= findViewById(R.id.edtCMND);
        edtBoSung = findViewById(R.id.edtBoSung);
        btnGui = findViewById(R.id.btnGuiThongTin);
        idGroup = findViewById(R.id.idGroup);
        chkDocBao = findViewById(R.id.chkDocBao);
        chkDocSach = findViewById(R.id.chkDocSach);
        chkCoding = findViewById(R.id.chkCoding);
        //Xu lý click
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lấy thông tin họ tên
                String hoTen = edtHoTen.getText().toString();
                if(hoTen.length()<3){
                    Toast.makeText(MainActivity.this, "Họ tên phải lớn hơn 3 kí tự", Toast.LENGTH_LONG).show();
                    edtHoTen.requestFocus();
                    edtHoTen.selectAll();
                    return;
                }
                //Lấy thông tin CMND
                String CMND = edtCMND.getText().toString();
                if(CMND.length()!=9){
                    Toast.makeText(MainActivity.this, "CMND phải đúng 9 số", Toast.LENGTH_LONG).show();
                    edtCMND.requestFocus();
                    edtCMND.selectAll();
                    return;
                }
                //Lấy thông tin bằng cấp
                int idselect = idGroup.getCheckedRadioButtonId();
                RadioButton radSelect = findViewById(idselect);
                String bangCap = radSelect.getText().toString();
                //Lấy thông tin sở thích
                String soThich = "";
                if(chkDocSach.isChecked()){
                    soThich+=chkDocSach.getText().toString()+"-";
                }
                if(chkDocBao.isChecked()){
                    soThich+=chkDocBao.getText().toString()+"-";
                }
                if(chkCoding.isChecked()){
                    soThich += chkCoding.getText().toString()+"-";
                }
                //Lấy thông tin bổ sung
                String boSung = edtBoSung.getText().toString();
                String tongHop = hoTen+"\n"+CMND+"\n"+bangCap+"\n"+soThich+"\n";
                tongHop +="---------------------Thông Tin Bổ Sung---------------------" +"\n"
                        + boSung +"\n"+"-----------------------------------------------------";
                //Tạo dialog và hiển thị thông tin tổng hợp lên
                AlertDialog.Builder myDialog = new AlertDialog.Builder(MainActivity.this);
                myDialog.setTitle("Thông tin cá nhân");
                myDialog.setMessage(tongHop);
                myDialog.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                myDialog.create().show();
            }
        });
    }
}