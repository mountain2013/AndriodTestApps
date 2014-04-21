package com.hetao.photo.autouploader;

import java.io.ByteArrayOutputStream;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.gmail.yuyang226.flickr.oauth.OAuth;
import com.gmail.yuyang226.flickr.oauth.OAuthToken;
import com.gmail.yuyang226.flickr.people.User;
import com.hetao.photo.autouploader.tasks.GetOAuthTokenTask;
import com.hetao.photo.autouploader.tasks.OAuthTask;
import com.hetao.photo.autouploader.utils.MyThread;
import com.hetao.photo.autouploader.utils.SettingUtil;

public class MainActivity extends Activity {

	public static final String CALLBACK_SCHEME = "flickrj-android-sample-oauth2"; //$NON-NLS-1$

	//private static final Logger logger = LoggerFactory.getLogger(MainActivity.class);

	private static int CASE_CAMERA = 10;
	private Button loginBt;
	private Button takePhotoBt;
	private Context context;
	private View linear1;
	private Button switchBt;
	private Button previewBt;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// …Ë÷√»´∆¡
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT );  
		
		setContentView(R.layout.main);
		
		context = this;

		this.linear1 = (LinearLayout) this.findViewById(R.id.linear1);
		this.loginBt = (Button) this.findViewById(R.id.loginBt);
		this.takePhotoBt = (Button) this.findViewById(R.id.takePhotoBt);
		this.switchBt = (Button) this.findViewById(R.id.switchBt);
		this.previewBt = (Button) this.findViewById(R.id.previewBt);

		this.loginBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				OAuthTask task = new OAuthTask(context);
				task.execute();
			}
		});

		this.previewBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle data = new Bundle();
				data.putSerializable("oauth",
						SettingUtil.getOAuthToken(context));
				Intent intent = new Intent(MainActivity.this,
						CameraUploader.class);
				intent.putExtras(data);
				startActivity(intent);
			}
		});

		this.takePhotoBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

				startActivityForResult(intent, CASE_CAMERA);
			}
		});

		Spinner s1 = (Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.frequency, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		s1.setAdapter(adapter);
		s1.setSelection(2);
		s1.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// showToast("Spinner1: position=" + position + " id=" + id);
				SettingUtil.updateSettingInfo(context, position);
			}

			public void onNothingSelected(AdapterView<?> parent) {
				// showToast("Spinner1: unselected");
			}
		});
		
		
		this.switchBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				SettingUtil.saveOAuthToken(context, null, null, null, null);
				loginBt.setVisibility(View.VISIBLE);
				linear1.setVisibility(View.GONE);
			}
		});


	}

	void showToast(CharSequence msg) {
		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
	}

	@Override
	public void onResume() {
		super.onResume();
		Intent intent = getIntent();
		String scheme = intent.getScheme();
		OAuth savedToken = SettingUtil.getOAuthToken(context);
		if (CALLBACK_SCHEME.equals(scheme)
				&& (savedToken == null || savedToken.getUser() == null)) {
			Uri uri = intent.getData();
			String query = uri.getQuery();
			//logger.debug("Returned Query: {}", query); //$NON-NLS-1$
			String[] data = query.split("&"); //$NON-NLS-1$
			if (data != null && data.length == 2) {
				String oauthToken = data[0].substring(data[0].indexOf("=") + 1); //$NON-NLS-1$
				String oauthVerifier = data[1]
						.substring(data[1].indexOf("=") + 1); //$NON-NLS-1$
				//logger.debug(	"OAuth Token: {}; OAuth Verifier: {}", oauthToken, oauthVerifier); //$NON-NLS-1$

				OAuth oauth = SettingUtil.getOAuthToken(context);
				if (oauth != null && oauth.getToken() != null
						&& oauth.getToken().getOauthTokenSecret() != null) {
					GetOAuthTokenTask task = new GetOAuthTokenTask(this);
					task.execute(oauthToken, oauth.getToken()
							.getOauthTokenSecret(), oauthVerifier);
				}
			}
		} else {
			OAuth oauth = SettingUtil.getOAuthToken(context);
			if (oauth != null && oauth.getUser() != null) {
				loginBt.setVisibility(View.GONE);
				linear1.setVisibility(View.VISIBLE);
			}
		}

	}

	public void setUser(User user) {

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode,
			Intent intent) {
		try {
			if (resultCode == Activity.RESULT_OK) {
				if (requestCode == CASE_CAMERA) {
					Bitmap myBitmap = null;
					try {
						// super.onActivityResult(requestCode, resultCode,
						// data);

						Bundle extras = intent.getExtras();
						myBitmap = (Bitmap) extras.get("data");

						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						myBitmap.compress(Bitmap.CompressFormat.JPEG, 80, baos);
						baos.flush();

						Thread th = new MyThread(baos,
								SettingUtil.getOAuthToken(context),context);
						th.start();
						
						Toast.makeText(context, "One photo has been uploaded to flickr", Toast.LENGTH_LONG).show();
					
					} catch (Exception e) {
						e.printStackTrace();
						showToast(e.toString());
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onNewIntent(android.content.Intent)
	 */
	@Override
	protected void onNewIntent(Intent intent) {
		// this is very important, otherwise you would get a null Scheme in the
		// onResume later on.
		setIntent(intent);
	}

	public void onOAuthDone(OAuth result) {
		if (result == null) {
			Toast.makeText(this, "Authorization failed", //$NON-NLS-1$
					Toast.LENGTH_LONG).show();
		} else {
			User user = result.getUser();
			OAuthToken token = result.getToken();
			if (user == null || user.getId() == null || token == null
					|| token.getOauthToken() == null
					|| token.getOauthTokenSecret() == null) {
				Toast.makeText(this, "Authorization failed", //$NON-NLS-1$
						Toast.LENGTH_LONG).show();
				return;
			}
			String message = String
					.format(Locale.US,
							"Authorization Succeed: user=%s, userId=%s, oauthToken=%s, tokenSecret=%s", //$NON-NLS-1$
							user.getUsername(), user.getId(),
							token.getOauthToken(), token.getOauthTokenSecret());
			Toast.makeText(this, message, Toast.LENGTH_LONG).show();
			SettingUtil.saveOAuthToken(context, user.getUsername(),
					user.getId(), token.getOauthToken(),
					token.getOauthTokenSecret());
			load(result);

//			Bundle data = new Bundle();
//			data.putSerializable("oauth", SettingUtil.getOAuthToken(context));
//			Intent intent = new Intent(MainActivity.this, CameraUploader.class);
//			intent.putExtras(data);
//			startActivity(intent);
			
			loginBt.setVisibility(View.GONE);
			linear1.setVisibility(View.VISIBLE);
		}
	}

	private void load(OAuth oauth) {
		if (oauth != null) {
			// new LoadUserTask(this).execute(oauth);
			// new LoadPhotostreamTask(this, listView).execute(oauth);
		}
	}

}