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
	Camera camera;                    // 定义系统所用的照相机	
	boolean isPreview = false;        //是否在浏览中
	
	private Context context;
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置全屏
     	requestWindowFeature(Window.FEATURE_NO_TITLE);
     	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
     
     	
        setContentView(R.layout.cameraview);
        
        context = this;
        
        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        
		screenWidth = 640;
		screenHeight = 480;		
		sView = (SurfaceView) findViewById(R.id.sView);                  // 获取界面中SurfaceView组件		
		surfaceHolder = sView.getHolder();                               // 获得SurfaceView的SurfaceHolder
		
		// 为surfaceHolder添加一个回调监听器
		surfaceHolder.addCallback(new Callback() {
			@Override
			public void surfaceChanged(SurfaceHolder holder, int format, int width,int height) {				
			}
			@Override
			public void surfaceCreated(SurfaceHolder holder) {							
				initCamera();                                            // 打开摄像头
			}
			@Override
			public void surfaceDestroyed(SurfaceHolder holder) {
				// 如果camera不为null ,释放摄像头
				if (camera != null) {
					if (isPreview)
						camera.stopPreview();
					camera.release();
					camera = null;
				}
			    System.exit(0);
			}		
		});
		// 设置该SurfaceView自己不维护缓冲    
		surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		
    }
    
    private void initCamera() {
    	if (!isPreview) {
			camera = Camera.open();
		}
		if (camera != null && !isPreview) {
			try{
				Camera.Parameters parameters = camera.getParameters();				
				parameters.setPreviewSize(screenWidth, screenHeight);    // 设置预览照片的大小				
				//parameters.setPreviewFpsRange(20,30);                    // 每秒显示20~30帧	
				parameters.setPreviewFpsRange(1,2);  
				parameters.setPictureFormat(ImageFormat.NV21);           // 设置图片格式				
				parameters.setPictureSize(screenWidth, screenHeight);    // 设置照片的大小
				//camera.setParameters(parameters);                      // android2.3.3以后不需要此行代码
				camera.setPreviewDisplay(surfaceHolder);                 // 通过SurfaceView显示取景画面				
		        camera.setPreviewCallback(new StreamIt());         // 设置回调的类				
				camera.startPreview();                                   // 开始预览				
				camera.autoFocus(null);                                  // 自动对焦
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
            	//调用image.compressToJpeg（）将YUV格式图像数据data转为jpg格式
                YuvImage image = new YuvImage(data, ImageFormat.NV21, size.width, size.height, null);  
                if(image!=null){
                	ByteArrayOutputStream outstream = new ByteArrayOutputStream();
                    image.compressToJpeg(new Rect(0, 0, size.width, size.height), 80, outstream); 
                    outstream.flush();
                    
                   
                    System.out.println((index++) +"------------------in call back:"+new Date());
                    
                    //启用线程将图像数据发送出去
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




