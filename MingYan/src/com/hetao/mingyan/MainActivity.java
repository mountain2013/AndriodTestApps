package com.hetao.mingyan;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.LinearLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MainActivity extends Activity {
	
	private WebView  webview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
	        //FYFY
		  AdManager.getInstance(this).init("b98773a015612b5e ", "66e3b01129d44517 ", false); 

	        
	        //AdManager.init(this,"b98773a015612b5e ", "66e3b01129d44517 ", 30, false);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        //����ȫ��  
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,   
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	        
	        setContentView(R.layout.index);
	        	
	        webview = (WebView) findViewById(R.id.id_mainweb);  
	        
	        webview.getSettings().setJavaScriptEnabled(true);  
	        
	        webview.loadUrl("file:///android_asset/www/index.htm");
	        
	        AdView adView = new AdView(this, AdSize.SIZE_320x50);
	      //��ȡҪ������Ĳ���
	      LinearLayout adLayout=(LinearLayout)findViewById(R.id.adLayout);
	      //����������뵽������
	    //  adLayout.addView(adView);


	}

}
