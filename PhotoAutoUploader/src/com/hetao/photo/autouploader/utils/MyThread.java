package com.hetao.photo.autouploader.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import android.content.Context;
import android.widget.Toast;

import com.gmail.yuyang226.flickr.oauth.OAuth;

public class MyThread extends Thread{	
	private ByteArrayOutputStream myoutputstream;
	private OAuth oauth;
	private Context context;
	public MyThread(ByteArrayOutputStream myoutputstream, OAuth oauth, Context context){
		this.myoutputstream = myoutputstream;
		this.oauth = oauth;
		this.context = context;
        try {
			myoutputstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public void run() {
        try{
        	FlickrHelper.uploadPhoto(myoutputstream, oauth);
        	//Toast.makeText(context, "One photo has been upload to flickr", Toast.LENGTH_LONG).show();
            myoutputstream.flush();
            myoutputstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}