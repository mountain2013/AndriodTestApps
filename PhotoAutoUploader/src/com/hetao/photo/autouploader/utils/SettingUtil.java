package com.hetao.photo.autouploader.utils;

import java.util.HashMap;
import java.util.Map;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.gmail.yuyang226.flickr.oauth.OAuth;
import com.gmail.yuyang226.flickr.oauth.OAuthToken;
import com.gmail.yuyang226.flickr.people.User;

public class SettingUtil {
	//private static final Logger logger = LoggerFactory.getLogger(SettingUtil.class);

	public static final String PREFS_NAME = "flickr-android-upload"; //$NON-NLS-1$
	public static final String KEY_OAUTH_TOKEN = "flickrj-android-oauthToken"; //$NON-NLS-1$
	public static final String KEY_TOKEN_SECRET = "flickrj-android-tokenSecret"; //$NON-NLS-1$
	public static final String KEY_USER_NAME = "flickrj-android-userName"; //$NON-NLS-1$
	public static final String KEY_USER_ID = "flickrj-android-userId"; //$NON-NLS-1$

	public static final String SETTING_PREFS_NAME = "setting-prefer-name";
	public static final String KEY_FREQUENCY_NAME = "setting-prefer-name";

	public static final int DEFAULT_FREQUENCY = 10;

	public static Map<Integer, Integer> settingMap = new HashMap<Integer, Integer>();

	static {
		settingMap.put(0, 1);
		settingMap.put(1, 5);
		settingMap.put(2, 10);
		settingMap.put(3, 30);
		settingMap.put(4, 60);
		settingMap.put(5, 5 * 60);
		settingMap.put(6, 10 * 60);
		settingMap.put(7, 30 * 60);
		settingMap.put(8, 60 * 60);
	}

	public static int getSettingInfo(Context context) {
		int frequency = 0;

		SharedPreferences settings = context.getSharedPreferences(
				SETTING_PREFS_NAME, Context.MODE_PRIVATE);
		frequency = settings.getInt(KEY_FREQUENCY_NAME, DEFAULT_FREQUENCY);

		return frequency;

	}

	public static void updateSettingInfo(Context context, int key) {
		SharedPreferences sp = context.getSharedPreferences(SETTING_PREFS_NAME,
				Context.MODE_PRIVATE);
		Editor editor = sp.edit();
		int frequency = settingMap.get(key);
		editor.putInt(KEY_FREQUENCY_NAME, frequency);
		editor.commit();

	}

	public static OAuth getOAuthToken(Context context) {
		// Restore preferences
		SharedPreferences settings = context.getSharedPreferences(PREFS_NAME,
				Context.MODE_PRIVATE);
		String oauthTokenString = settings.getString(KEY_OAUTH_TOKEN, null);
		String tokenSecret = settings.getString(KEY_TOKEN_SECRET, null);
		if (oauthTokenString == null && tokenSecret == null) {
			return null;
		}
		OAuth oauth = new OAuth();
		String userName = settings.getString(KEY_USER_NAME, null);
		String userId = settings.getString(KEY_USER_ID, null);
		if (userId != null) {
			User user = new User();
			user.setUsername(userName);
			user.setId(userId);
			oauth.setUser(user);
		}
		OAuthToken oauthToken = new OAuthToken();
		oauth.setToken(oauthToken);
		oauthToken.setOauthToken(oauthTokenString);
		oauthToken.setOauthTokenSecret(tokenSecret);
		//logger.debug("Retrieved token from preference store: oauth token={}, and token secret={}", oauthTokenString, tokenSecret); //$NON-NLS-1$
		return oauth;
	}

	public static void saveOAuthToken(Context context, String userName,
			String userId, String token, String tokenSecret) {
		//logger.debug("Saving userName=%s, userId=%s, oauth token={}, and token secret={}", new String[] { userName, userId, token, tokenSecret }); //$NON-NLS-1$
		SharedPreferences sp = context.getSharedPreferences(PREFS_NAME,
				Context.MODE_PRIVATE);
		Editor editor = sp.edit();
		editor.putString(KEY_OAUTH_TOKEN, token);
		editor.putString(KEY_TOKEN_SECRET, tokenSecret);
		editor.putString(KEY_USER_NAME, userName);
		editor.putString(KEY_USER_ID, userId);
		editor.commit();
	}
}
