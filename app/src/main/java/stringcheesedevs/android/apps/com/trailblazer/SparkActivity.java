package stringcheesedevs.android.apps.com.trailblazer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class SparkActivity extends Activity {
    private WebView sparkBrowse;
    private LinearLayout largeLin;
    String js = "javascript:var useless =document.getElementById(\"pac-input\").value = \"Houston, TX, USA\";";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        largeLin = (LinearLayout) findViewById(R.id.largeLin);
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);

        params.gravity = Gravity.CENTER_VERTICAL;

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_spark);
        sparkBrowse = (WebView) findViewById(R.id.sparkbrowser);
        WebSettings webSettings = sparkBrowse.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        sparkBrowse.setWebViewClient(new MyWebViewClient());
        sparkBrowse.loadUrl("https://showsparker.com/s/create");
        sparkBrowse.loadUrl(js);
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}
