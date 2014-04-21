package com.hetao.novel;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class NovelActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView  webview = (WebView) findViewById(R.id.id_mainweb);  
        webview.getSettings().setJavaScriptEnabled(true);
        
        webview.getSettings().setJavaScriptEnabled(true);  
        webview.loadUrl("file:///android_asset/FirstAid_index.htm");
    }
}