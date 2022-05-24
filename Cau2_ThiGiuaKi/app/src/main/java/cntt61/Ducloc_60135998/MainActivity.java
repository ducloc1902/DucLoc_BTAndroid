package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> DSBaiTho;
    Button btnAdd, btnRemove, btnUpdate;
    EditText edtnumber, edtgiatri;
    ListView listDS;
    ArrayAdapter<String> bonap;
    int vitri = -1;
    void TimWidget()
    {
        btnAdd = (Button)findViewById(R.id.btnadd);
        btnRemove = (Button)findViewById(R.id.btndelete);
        btnUpdate = (Button)findViewById(R.id.btnsua);
        edtnumber = (EditText)findViewById(R.id.edtnumber);
        edtgiatri = (EditText)findViewById(R.id.edtgiatri);
        listDS = (ListView)findViewById(R.id.listDS);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
        DSBaiTho = new ArrayList<String>();
        bonap = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, DSBaiTho);
        DSBaiTho.add("Việt Nam đất nước ta ơi");
        DSBaiTho.add("Cánh cò bay lả rập rờn");
        DSBaiTho.add("Quê hương biết mấy thân yêu");
        DSBaiTho.add("Ta đi ta nhớ núi rừng");
        listDS.setAdapter(bonap);
        btnAdd.setOnClickListener(XuLyThem);
        btnRemove.setOnClickListener(XuLyXoa);
        btnUpdate.setOnClickListener(XuLySua);
        listDS.setOnItemClickListener(XuLyChonMuc);
    }
    View.OnClickListener XuLyThem = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tenCLB = edtgiatri.getText().toString();
            DSBaiTho.add(tenCLB);
            bonap.notifyDataSetChanged();

        }
    };
    View.OnClickListener XuLyXoa = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DSBaiTho.remove(vitri);
            bonap.notifyDataSetChanged();
        }
    };
    View.OnClickListener XuLySua = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DSBaiTho.set(vitri,edtgiatri.getText().toString());
            bonap.notifyDataSetChanged();
        }
    };
    AdapterView.OnItemClickListener XuLyChonMuc = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            edtnumber.setText(""+i+"");
            edtgiatri.setText(DSBaiTho.get(i));
            vitri = i;
        }
    };
}