package com.hetao.novel.fyfy;


import net.youmi.android.AdManager;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class NovelActivity extends Activity {
	

	private WebView  webview;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FYFY
       AdManager.init(this,"1b2ff9e130321dd2", "911024fde85782fa", 30, false);
        
        //AdManager.init(this,"b98773a015612b5e ", "66e3b01129d44517 ", 30, false);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        //…Ë÷√»´∆¡  
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,   
                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
        
        setContentView(R.layout.index);
        
        webview = (WebView) findViewById(R.id.id_mainweb);  
        
        webview.getSettings().setJavaScriptEnabled(true);  
        
        webview.loadUrl("file:///android_asset/www/index.htm");
        
    }
    
 	
}