package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LoginActivity extends Activity {

    private Button opener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
