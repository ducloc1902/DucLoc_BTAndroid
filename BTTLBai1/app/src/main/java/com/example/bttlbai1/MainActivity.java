package com.example.bttlbai1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//// khai bao cac doi tuong
    EditText editSoA , editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSoA= (EditText)findViewById(R.id.edSoA);
        editSoB=(EditText)findViewById(R.id.edSoB);
        textViewKetQua=(TextView)findViewById(R.id.tvKetQua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);



    }
    public void XuLyCong(View v){
    // lay du lieu
      String sA=  editSoA.getText().toString();
      String sB=  editSoB.getText().toString();
      /// chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
      /// tinh tong
      int tong= a+b;
      /// chuyen tong thanh chuoi
      String chuoiTong = String.valueOf(tong);
      ///xuat ket qua
        textViewKetQua.setText("Tong la:"+chuoiTong);
    }
    public void XuLyTru(View v){
        String sA=  editSoA.getText().toString();
        String sB=  editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int hieu= a-b;
        String chuoiHieu = String.valueOf(hieu);
        textViewKetQua.setText("Hieu la:"+chuoiHieu);
    }
    public void XuLyNhan(View v){
        String sA=  editSoA.getText().toString();
        String sB=  editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int tich= a*b;
        String chuoiTich = String.valueOf(tich);
        textViewKetQua.setText("Hieu la:"+chuoiTich);
    }
    public void XuLyChia(View v){
        String sA=  editSoA.getText().toString();
        String sB=  editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int thuong= a/b;
        String chuoiChia = String.valueOf(thuong);
        textViewKetQua.setText("Hieu la:"+chuoiChia);
    }
}