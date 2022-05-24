package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        SQLiteDatabase db;
        Button them,xoa,sua;
        ListView listView;
        EditText edChon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db =SQLiteDatabase.openOrCreateDatabase("/data/data/com.bai2/Poem.db",null);
        setup();
        TaoBangVaThem();
        NapSachVao();
    }
    private  void setup(){
        listView=(ListView)  findViewById(R.id.lvSACH);
        edChon=(EditText) findViewById(R.id.edtMaCHON);
        them= findViewById(R.id.btnThem);
        xoa= findViewById(R.id.btnXoa);
        sua= findViewById(R.id.btnSua);

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    void TaoBangVaThem(){

    }
//        String sqlXoaBang = "Drop Table";
//        db.execSQL(sqlXoaBang);
//        String sqlTaoBang = " Creart table"+ "Name Text"+ "Content";

    void NapSachVao(){

    }
}
