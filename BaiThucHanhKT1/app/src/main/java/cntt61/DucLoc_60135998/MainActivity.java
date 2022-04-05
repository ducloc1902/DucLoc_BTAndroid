package cntt61.DucLoc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.annotation.SuppressLint;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int solansai = 0;
    @SuppressLint("WrongConstant")
    public void Login(View view){
        //Tìm điều khiển chứa TenDN
        EditText edtTenDN = (EditText) findViewById(R.id.edtTenDN);
        String user = edtTenDN.getText().toString();

        //Tìm điều khiển chứa MK
        EditText edtMK = (EditText) findViewById(R.id.edtMK);
        String pass = edtMK.getText().toString();

        //-------------------------

        if (user.equals("NgocDung")&&(pass.equals("0806"))){
            Toast.makeText(MainActivity.this,"User and Password is correct",10).show();
        }
        else {
            solansai ++;
            Toast.makeText(MainActivity.this,"User and Password is wrong",10).show();
            TextView sls = (TextView) findViewById(R.id.tvAtt);
            sls.setText((String.valueOf(solansai)));
        }
    }

}