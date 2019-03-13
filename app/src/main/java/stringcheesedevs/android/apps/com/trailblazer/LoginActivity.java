package stringcheesedevs.android.apps.com.trailblazer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button opener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        opener = findViewById(R.id.login_open);
        opener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpark();
            }
        });
    }

    public void openDashboard(){
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
    public void openSpark(){
        Intent intent = new Intent(this,SparkActivity.class);
        startActivity(intent);
    }
}
