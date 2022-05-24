package com.example.baithuchanhkt3;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtnhap;
    RadioButton rbtn13, rbtn15, rbtn18;
    Button btnCal;
    TextView ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbtn13 = findViewById(R.id.rbtn13);
        rbtn15 = findViewById(R.id.rbtn15);
        rbtn18 = findViewById(R.id.rbtn18);
        btnCal = findViewById(R.id.btncal);
        ketqua  = findViewById(R.id.ketqua);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap = (EditText) findViewById(R.id.edtnhap);
                Float giatri= Float.parseFloat( edtnhap.getText().toString() );
                if (rbtn13.isChecked()) {
                    Float Tip = giatri * 13 / 100;
                    ketqua.setText("Your tip will be $" +String.valueOf(Tip).substring(0,String.valueOf(Tip).indexOf(".")+2) );
                }
                else if (rbtn15.isChecked())
                {
                    Float Tip = giatri * 15 / 100;
                    ketqua.setText("Your tip will be $" +String.valueOf(Tip).substring(0,String.valueOf(Tip).indexOf(".")+2) );
                }
                else
                {
                    Float Tip = giatri * 18 / 100;
                    ketqua.setText("Your tip will be $" +String.valueOf(Tip).substring(0,String.valueOf(Tip).indexOf(".")+2) );
                }
            }
        });
    }

}