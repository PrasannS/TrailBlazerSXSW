package stringcheesedevs.android.apps.com.trailblazer;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SparkActivity extends AppCompatActivity {
    private WebView sparkBrowse;
    String js = "javascript:document.getElementById(\"pac-input\").value = \"Houston, TX, USA\";";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
