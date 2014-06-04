package com.hetao.joke;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * A parser for http://www.jokeji.cn
 * 
 * @author teren_000
 * 
 */
public class JokeJiParser {

	public static void saveInputStreamToFile(InputStream ins)
			throws IOException {

		File file = new File("JokeJi.txt");

		OutputStream os = new FileOutputStream(file);
		int bytesRead = 0;
		byte[] buffer = new byte[8192];
		while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {

			os.write(buffer, 0, bytesRead);
		}
		os.close();
		ins.close();
	}
	
	public static List<JokeO> getJokeList(String gbString){
		List<JokeO> jokeList = new ArrayList<JokeO>();

		if(gbString!=null && gbString.indexOf("href=\"/jokehtml")!=-1){
			JokeO joke = new JokeO();
			joke.setTitle(gbString.substring(gbString.indexOf("_blank")+8, gbString.indexOf("</a>")));
			joke.setLink(gbString.substring(gbString.indexOf("href=")+6, gbString.indexOf("\" class")));
			joke.setInnerHtml(gbString.trim());
			System.out.println(joke);
			jokeList.add(joke);
		}
		return jokeList;
	}
	
	public static int getPageNumber(String gbString){
		int pageNumber=1;
		/*if(){
			
			
		}*/
		
		return pageNumber;
	}

	public static void getOneMonth() throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(
				//"http://www.jokeji.cn/DateUpdate_2014_1.htm"
				"http://www.jokeji.cn/DateUpdate.asp?MaxPerPage=50&listtype=title&cid=0&log_Year=2014&log_Month=1&log_Day=0&me_page=1"
				);
		// httpget.getParams().setParameter("http.protocol.content-charset","gb2312");

		CloseableHttpResponse response = null;
		try {
			response = httpclient.execute(httpget);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				// System.out.println(EntityUtils.toString(entity,
				// Charset.forName("gb2312")));

				long len = entity.getContentLength();
				if (len != -1 && len < 2048) {
					System.out.println(EntityUtils.toString(entity,
							Charset.forName("gb2312")));
				} else {
					// Stream content out
					InputStream instream = entity.getContent();

					BufferedReader br = new BufferedReader(
							new InputStreamReader(instream,"ISO-8859-1"));
					String resultLine = br.readLine();
					while (resultLine != null) {
						String gbString = new String(resultLine.getBytes("ISO-8859-1"), Charset.forName("GB2312"));
						//System.out.println(gbString);
						
						getJokeList(gbString);
						
						resultLine = br.readLine();
					}

					// saveInputStreamToFile(instream);

				}

				EntityUtils.consume(entity);
			}

		} finally {
			response.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getOneMonth();
	}

}
