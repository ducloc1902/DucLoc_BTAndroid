package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnTinh;
    EditText edtA, edtB, edtChieuCao;
    TextView txtLoi, txtChuVi, txtDienTich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }

    private void setUp(){
        btnTinh = findViewById(R.id.btnTinh);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtChieuCao = findViewById(R.id.edtChieuCao);
        txtLoi = findViewById(R.id.txtLoi);
        txtChuVi = findViewById(R.id.txtChuVi);
        txtDienTich = findViewById(R.id.txtDienTich);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtA.getText().toString().trim().isEmpty()){
                    txtLoi.setText("Vui lòng nhập vào cạnh A");
                    return;
                }
                if(edtB.getText().toString().trim().isEmpty()){
                    txtLoi.setText("Vui lòng nhập vào cạnh B");
                    return;
                }
                if(edtChieuCao.getText().toString().trim().isEmpty()){
                    txtLoi.setText("Vui lòng nhập vào chiều cao");
                    return;
                }
                txtLoi.setText("");
                double canhA = Double.parseDouble(String.valueOf(edtA.getText()));
                double canhB = Double.parseDouble(String.valueOf(edtB.getText()));
                double chieuCao = Double.parseDouble(String.valueOf(edtChieuCao.getText()));
                txtChuVi.setText(String.valueOf(canhA * 2 + canhB*2));
                txtDienTich.setText(String.valueOf(chieuCao * canhB));
            }
        });
    }
}