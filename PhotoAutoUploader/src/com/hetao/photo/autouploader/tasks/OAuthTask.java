/**
 * 
 */
package com.hetao.photo.autouploader.tasks;

import java.net.URL;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.gmail.yuyang226.flickr.Flickr;
import com.gmail.yuyang226.flickr.auth.Permission;
import com.gmail.yuyang226.flickr.oauth.OAuthToken;
import com.hetao.photo.autouploader.MainActivity;
import com.hetao.photo.autouploader.utils.FlickrHelper;
import com.hetao.photo.autouploader.utils.SettingUtil;

/**
 * Represents the task to start the oauth process.
 * 
 * @author wantao
 * 
 */
public class OAuthTask extends AsyncTask<Void, Integer, String> {

//	private static final Logger logger = LoggerFactory
//			.getLogger(OAuthTask.class);
	private static final Uri OAUTH_CALLBACK_URI = Uri.parse(MainActivity.CALLBACK_SCHEME
			+ "://oauth"); //$NON-NLS-1$

	/**
	 * The context.
	 */
	private Context mContext;

	/**
	 * The progress dialog before going to the browser.
	 */
	private ProgressDialog mProgressDialog;

	/**
	 * Constructor.
	 * 
	 * @param context
	 */
	public OAuthTask(Context context) {
		super();
		this.mContext = context;
	}

	protected void onPreExecute() {
		super.onPreExecute();
		mProgressDialog = ProgressDialog.show(mContext,
				"", "Generating the authorization request..."); //$NON-NLS-1$ //$NON-NLS-2$
		mProgressDialog.setCanceledOnTouchOutside(true);
		mProgressDialog.setCancelable(true);
		mProgressDialog.setOnCancelListener(new OnCancelListener() {
			@Override
			public void onCancel(DialogInterface dlg) {
				OAuthTask.this.cancel(true);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.os.AsyncTask#doInBackground(Params[])
	 */
	@Override
	protected String doInBackground(Void... params) {
		try {
			Flickr f = FlickrHelper.getInstance().getFlickr();
			OAuthToken oauthToken = f.getOAuthInterface().getRequestToken(
					OAUTH_CALLBACK_URI.toString());
			saveTokenSecrent(oauthToken.getOauthTokenSecret());
			URL oauthUrl = f.getOAuthInterface().buildAuthenticationUrl(
					Permission.WRITE, oauthToken);
			return oauthUrl.toString();
		} catch (Exception e) {
			Log.e("Error to oauth", e.getLocalizedMessage()); //$NON-NLS-1$
			return "error:" + " please check your network"; //$NON-NLS-1$
		}
	}

	/**
	 * Saves the oauth token secrent.
	 * 
	 * @param tokenSecret
	 */
	private void saveTokenSecrent(String tokenSecret) {
		Log.i("Error", tokenSecret); //$NON-NLS-1$
		MainActivity act = (MainActivity) mContext;
		SettingUtil.saveOAuthToken(mContext,null, null, null, tokenSecret);
		Log.i("token","oauth token secret saved: {}"+ tokenSecret); //$NON-NLS-1$
	}

	@Override
	protected void onPostExecute(String result) {
		if (mProgressDialog != null) {
			mProgressDialog.dismiss();
		}
		if (result != null && !result.startsWith("error") ) { //$NON-NLS-1$
			mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri
					.parse(result)));
		} else {
			Toast.makeText(mContext, result, Toast.LENGTH_LONG).show();
		}
	}

}
