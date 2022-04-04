package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn = (Button) findViewById(R.id.btnOk);
        btn.setOnClickListener(ChuyensangHome);
    }

    View.OnClickListener ChuyensangHome = new View.OnClickListener() {
        @SuppressLint("WrongConstant")
        @Override
        public void onClick(View v) {
            //Tìm điều khiển chứa TenDN
            EditText edtTenDN = (EditText) findViewById(R.id.edtUserName);
            String user = edtTenDN.getText().toString();

            //Tìm điều khiển chứa MK
            EditText edtMK = (EditText) findViewById(R.id.edtPass);
            String pass = edtMK.getText().toString();
            //Tìm điều khiển chứa email
            EditText edtmail = (EditText) findViewById(R.id.edtMail);
            String mail = edtmail.getText().toString();

            //-------------------------

            if (user.equals("NgocDung")&&pass.equals("1510k")){
                Intent iQuiz = new Intent(LoginActivity.this,HomeActivity.class);
                iQuiz.putExtra("Tennguoidung",user);
                iQuiz.putExtra("matkhaunguoidung", pass);
                iQuiz.putExtra("emailnguoidung", mail);
                startActivity(iQuiz);
                Toast.makeText(LoginActivity.this,"User and Password is correct",10).show();

            }
            else {
                Toast.makeText(LoginActivity.this,"User and Password is wrong",10).show();
            }

        }
    };
}