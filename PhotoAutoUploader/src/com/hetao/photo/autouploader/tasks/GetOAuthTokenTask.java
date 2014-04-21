/**
 * 
 */
package com.hetao.photo.autouploader.tasks;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import android.os.AsyncTask;
import android.util.Log;

import com.gmail.yuyang226.flickr.Flickr;
import com.gmail.yuyang226.flickr.oauth.OAuth;
import com.gmail.yuyang226.flickr.oauth.OAuthInterface;
import com.hetao.photo.autouploader.MainActivity;
import com.hetao.photo.autouploader.utils.FlickrHelper;

/**
 * @author Toby Yu(yuyang226@gmail.com)
 *
 */
public class GetOAuthTokenTask extends AsyncTask<String, Integer, OAuth> {
	//private static final Logger logger = LoggerFactory.getLogger(GetOAuthTokenTask.class);

	private MainActivity activity;

	public GetOAuthTokenTask(MainActivity context) {
		this.activity = context;
	}

	@Override
	protected OAuth doInBackground(String... params) {
		String oauthToken = params[0];
		String oauthTokenSecret = params[1];
		String verifier = params[2];

		Flickr f = FlickrHelper.getInstance().getFlickr();
		OAuthInterface oauthApi = f.getOAuthInterface();
		try {
			return oauthApi.getAccessToken(oauthToken, oauthTokenSecret,
					verifier);
		} catch (Exception e) {
			Log.e("error", e.getLocalizedMessage());
			return null;
		}

	}

	@Override
	protected void onPostExecute(OAuth result) {
		if (activity != null) {
			activity.onOAuthDone(result);
		}
	}


}
