package com.hetao.photo.autouploader;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.hetao.photo.autouploader.utils.MyThread;
import com.hetao.photo.autouploader.utils.SettingUtil;

public class CameraUploader extends Activity {
	SurfaceView sView;
	SurfaceHolder surfaceHolder;
	int screenWidth, screenHeight;	
	Camera camera;                    // ����ϵͳ���õ������	
	boolean isPreview = false;        //�Ƿ��������
	
	private Context context;
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ����ȫ��
     	requestWindowFeature(Window.FEATURE_NO_TITLE);
     	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
     
     	
        setContentView(R.layout.cameraview);
        
        context = this;
        
        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        
		screenWidth = 640;
		screenHeight = 480;		
		sView = (SurfaceView) findViewById(R.id.sView);                  // ��ȡ������SurfaceView���		
		surfaceHolder = sView.getHolder();                               // ���SurfaceView��SurfaceHolder
		
		// ΪsurfaceHolder���һ���ص�������
		surfaceHolder.addCallback(new Callback() {
			@Override
			public void surfaceChanged(SurfaceHolder holder, int format, int width,int height) {				
			}
			@Override
			public void surfaceCreated(SurfaceHolder holder) {							
				initCamera();                                            // ������ͷ
			}
			@Override
			public void surfaceDestroyed(SurfaceHolder holder) {
				// ���camera��Ϊnull ,�ͷ�����ͷ
				if (camera != null) {
					if (isPreview)
						camera.stopPreview();
					camera.release();
					camera = null;
				}
			    System.exit(0);
			}		
		});
		// ���ø�SurfaceView�Լ���ά������    
		surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		
    }
    
    private void initCamera() {
    	if (!isPreview) {
			camera = Camera.open();
		}
		if (camera != null && !isPreview) {
			try{
				Camera.Parameters parameters = camera.getParameters();				
				parameters.setPreviewSize(screenWidth, screenHeight);    // ����Ԥ����Ƭ�Ĵ�С				
				//parameters.setPreviewFpsRange(20,30);                    // ÿ����ʾ20~30֡	
				parameters.setPreviewFpsRange(1,2);  
				parameters.setPictureFormat(ImageFormat.NV21);           // ����ͼƬ��ʽ				
				parameters.setPictureSize(screenWidth, screenHeight);    // ������Ƭ�Ĵ�С
				//camera.setParameters(parameters);                      // android2.3.3�Ժ���Ҫ���д���
				camera.setPreviewDisplay(surfaceHolder);                 // ͨ��SurfaceView��ʾȡ������				
		        camera.setPreviewCallback(new StreamIt());         // ���ûص�����				
				camera.startPreview();                                   // ��ʼԤ��				
				camera.autoFocus(null);                                  // �Զ��Խ�
			} catch (Exception e) {
				e.printStackTrace();
			}
			isPreview = true;
		}
    }
    
    private Date lastTime =null;
    private int index = 0;
    
    class StreamIt implements Camera.PreviewCallback {
    	
    	
        @Override
        public void onPreviewFrame(byte[] data, Camera camera) {
        	
        	if(lastTime==null || (System.currentTimeMillis() - lastTime.getTime())>1000*SettingUtil.getSettingInfo(context)){
        		lastTime = new Date();
        	} else {
        		return;
        	}
        	
            Size size = camera.getParameters().getPreviewSize();          
            try{ 
            	//����image.compressToJpeg������YUV��ʽͼ������dataתΪjpg��ʽ
                YuvImage image = new YuvImage(data, ImageFormat.NV21, size.width, size.height, null);  
                if(image!=null){
                	ByteArrayOutputStream outstream = new ByteArrayOutputStream();
                    image.compressToJpeg(new Rect(0, 0, size.width, size.height), 80, outstream); 
                    outstream.flush();
                    
                   
                    System.out.println((index++) +"------------------in call back:"+new Date());
                    
                    //�����߳̽�ͼ�����ݷ��ͳ�ȥ
                    Thread th = new MyThread(outstream, SettingUtil.getOAuthToken(context), context);
                    th.start();     
                    Toast.makeText(context, "One photo has been uploaded to flickr", Toast.LENGTH_LONG).show();
                    
                }  
            }catch(Exception ex){  
                Log.e("Sys","Error:"+ex.getMessage());  
            }        
        }
    }
        
  
    
}




