package com.example.android.bebrand;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.android.bebrand.R.id.webview;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);
        WebView browser = (WebView) findViewById(webview);
        browser.setWebViewClient(new WebBrowser());
        String theMoab = "http://www.themoap.org/";
        String bebrand ="http://bebrand.tv/";
        String newBeBrand="http://jolijour.bebrand.tv/";
        browser.loadUrl(theMoab);
        browser.getSettings().setJavaScriptEnabled(true);
    }


  private  class WebBrowser extends WebViewClient{
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
          view.loadUrl(url);
          return true;
      }
  }
}
