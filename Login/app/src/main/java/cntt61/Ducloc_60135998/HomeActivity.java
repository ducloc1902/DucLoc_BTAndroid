package cntt61.Ducloc_60135998;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView show = (TextView) findViewById(R.id.tvUserName);
        Button quiz1 = (Button) findViewById(R.id.btnquiz1);
        quiz1.setOnClickListener(quaylaiMain);
        Button quiz2 = (Button) findViewById(R.id.btnquiz2);
        quiz1.setOnClickListener(quaylaiLogin);
        Intent Iquiznhanduoc = getIntent();
        String user = Iquiznhanduoc.getStringExtra("Tennguoidung");
        show.setText(show.getText().toString() +user);

    }

    View.OnClickListener quaylaiMain = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tomain = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(tomain);
        }
    };
    View.OnClickListener quaylaiLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent toLogin = new Intent(HomeActivity.this,LoginActivity.class);
            startActivity(toLogin);
        }
    };
}
