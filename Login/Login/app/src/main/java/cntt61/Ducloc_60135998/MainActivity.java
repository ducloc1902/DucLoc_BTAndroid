package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnLogin);
        btn.setOnClickListener(ChuyensangLogin);
    }
    View.OnClickListener ChuyensangLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent iLogin = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(iLogin);
        }
    };
}