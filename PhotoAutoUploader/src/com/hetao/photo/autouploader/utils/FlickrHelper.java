package com.hetao.photo.autouploader.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.gmail.yuyang226.flickr.Flickr;
import com.gmail.yuyang226.flickr.FlickrException;
import com.gmail.yuyang226.flickr.REST;
import com.gmail.yuyang226.flickr.RequestContext;
import com.gmail.yuyang226.flickr.interestingness.InterestingnessInterface;
import com.gmail.yuyang226.flickr.oauth.OAuth;
import com.gmail.yuyang226.flickr.oauth.OAuthToken;
import com.gmail.yuyang226.flickr.photos.PhotosInterface;
import com.gmail.yuyang226.flickr.uploader.UploadMetaData;

public final class FlickrHelper {

	private static FlickrHelper instance = null;
	//private static final String API_KEY = "da4fadd0084ea1799ad33048f0d6a5c5"; //$NON-NLS-1$
	//public static final String API_SEC = "186b04791439c326"; //$NON-NLS-1$

	private static final String API_KEY = "c6020be4d4817f5ab0509af46fc9e7ae";
	public static final String API_SEC = "53d039c9e9354ce2";

	public static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd-HH-mm-ss-sss");

	// private static final String API_KEY = "c7e9390432c6b736220110491e9d0fc0";
	// public static final String API_SEC = "c5236e0f05aa9732";

	private FlickrHelper() {

	}

	public static FlickrHelper getInstance() {
		if (instance == null) {
			instance = new FlickrHelper();
		}

		return instance;
	}

	public Flickr getFlickr() {
		try {
			Flickr f = new Flickr(API_KEY, API_SEC, new REST());
			return f;
		} catch (ParserConfigurationException e) {
			return null;
		}
	}

	public Flickr getFlickrAuthed(String token, String secret) {
		Flickr f = getFlickr();
		RequestContext requestContext = RequestContext.getRequestContext();
		OAuth auth = new OAuth();
		auth.setToken(new OAuthToken(token, secret));
		requestContext.setOAuth(auth);
		return f;
	}

	public InterestingnessInterface getInterestingInterface() {
		Flickr f = getFlickr();
		if (f != null) {
			return f.getInterestingnessInterface();
		} else {
			return null;
		}
	}

	public PhotosInterface getPhotosInterface() {
		Flickr f = getFlickr();

		if (f != null) {
			return f.getPhotosInterface();
		} else {
			return null;
		}
	}

	public static void uploadPhoto(String BSEE_FOLDER_PATH, String path,
			OAuth oauth) throws FileNotFoundException {

		OAuthToken token = oauth.getToken();

		Flickr f = FlickrHelper.getInstance().getFlickrAuthed(
				token.getOauthToken(), token.getOauthTokenSecret());

		InputStream in = new FileInputStream(BSEE_FOLDER_PATH + path);

		try {
			if (f != null) {
				UploadMetaData meta = new UploadMetaData();

				System.out.println("------------Flickr: start upload photo:"
						+ path);
				f.getUploader().upload(path, in, meta);
				System.out.println("------------Flickr: upload photo:" + path
						+ " end");
			} else {
				System.err.println("------------Flickr is null!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FlickrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void uploadPhoto(ByteArrayOutputStream myoutputstream,
			OAuth oauth) throws FileNotFoundException {

		String dateS = sdf.format(new Date());
		String fileName = dateS + ".jpg";

		OAuthToken token = oauth.getToken();

		Flickr f = FlickrHelper.getInstance().getFlickrAuthed(
				token.getOauthToken(), token.getOauthTokenSecret());

		InputStream in = new ByteArrayInputStream(myoutputstream.toByteArray());

		try {
			if (f != null) {
				UploadMetaData meta = new UploadMetaData();

				f.getUploader().upload(fileName, in, meta);
				System.out.println("------------Flickr: upload photo:"
						+ fileName + " end");
			} else {
				System.err.println("------------Flickr is null!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FlickrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
