package com.hetao.novel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile_FYFY {

	static String onloadScript1 = new StringBuilder(
			"<script language=\"javascript\" type=\"text/javascript\">")
			.append("(function () { var ie = !!(window.attachEvent && !window.opera);")
			.append("  var wk = /webkit\\/(\\d+)/i.test(navigator.userAgent) && (RegExp.$1 < 525);")
			.append(" var fn = []; ")
			.append(" var run = function () { for (var i = 0; i < fn.length; i++) fn[i](); };")
			.append("  var d = document;")
			.append("  d.ready = function (f) {")
			.append("   if (!ie && !wk && d.addEventListener)")
			.append("    return d.addEventListener('DOMContentLoaded', f, false);")
			.append("   if (fn.push(f) > 1) return;")
			.append("   if (ie)")
			.append("    (function () {")
			.append("     try { d.documentElement.doScroll('left'); run(); }")
			.append("     catch (err) { setTimeout(arguments.callee, 0); }")
			.append("   })();")
			.append("  else if (wk)")
			.append("  var t = setInterval(function () {")
			.append("   if (/^(loaded|complete)$/.test(d.readyState))")
			.append("    clearInterval(t), run();")
			.append("   }, 0);")
			.append(" };")
			.append(" })()")
			.append(" \n ")
			.append(" document.ready(function(){")
			.append("  var pageId = document.getElementById(\"pageId\").value;")
			.append("  var title='';")
			.append("   var x=document.getElementsByTagName('title');")
			.append("    if(x){").append(" \n ")
			.append("  	title = x[0].innerHTML; ").append(" \n ")
			.append("    }  else {").append(" \n ")
			.append("  	title ='';").append(" \n ")
			.append("    }").append(" \n ")
			.append("  window.myjs.runOnAndroidJavaScript(pageId,title); ").append(" \n ")
			.append(" });")

			.append(" </script>").toString();
	
	
	
	static String onloadScript2 = new StringBuilder("<META name=GENERATOR content=\"MSHTML 8.00.6001.19120\">").append(" \n ")
	.append(" <link rel=\"stylesheet\" href=\"jquery.mobile/jquery.mobile-1.0rc2.css\" type=\"text/css\" charset=\"utf-8\" />").append(" \n ")
	.append(" <link rel=\"stylesheet\" href=\"pgandjqm-style-override.css\" type=\"text/css\" charset=\"utf-8\" />").append(" \n ")
	.append(" <script type=\"text/javascript\" charset=\"utf-8\" src=\"phonegap-1.1.0.js\"></script>").append(" \n ")
	.append(" <script type=\"text/javascript\" charset=\"utf-8\" src=\"main.js\"></script>").toString();

	private static String getFileName(int i) {
		String name = null;
		if (i < 10) {
			name = "00" + i;
		} else if (i < 100) {
			name = "0" + i;
		} else {
			name = i + "";
		}

		return name + ".htm";

	}

	
//	public static void main(String[] args) throws IOException {
//		
//		System.out.println(onloadScript);
//	}
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		for (int i = 1; i < 325; i++) {

			File file = new File("C:\\Doc\\Novel\\fyfy\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\fyfy\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					} else if (temp.indexOf("DH1.js") >= 0) {

					} else if (temp.indexOf("</head>") >= 0) {
						bw.write(onloadScript2);
						bw.newLine();
						bw.write(temp);
						bw.newLine();
						bw.write("<input type=hidden id=pageId value=" + i
								+ " />");

					}else if (temp.indexOf("<body") >= 0) {
						temp = temp.replaceFirst("<body", "<body onload=\"init();\" ");
						bw.write(temp);
					}  else if (temp.indexOf("DH0.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/DH0.js\"></script>", ""));
					} else if (temp.indexOf("DH.js") >= 0) {
					} else if (temp.indexOf("dd.js") >= 0) {
					} else if (temp.indexOf("01s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/01s.js\"></script>", ""));
					} else if (temp.indexOf("02s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/02s.js\"></script>", ""));
					} else if (temp.indexOf("03s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/03s.js\"></script>", ""));
					} else if (temp.indexOf("04s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/04s.js\"></script>", ""));
					} else if (temp.indexOf("05s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/05s.js\"></script>", ""));
					} else if (temp.indexOf("06s.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/06s.js\"></script>", ""));
					} else if (temp.indexOf("#C0C0C0") >= 0) {
						bw.write(temp.replaceFirst("#C0C0C0", "#EFFAFF"));
					} else if (temp.indexOf("华文新魏") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">覆雨翻云</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">梦远书城</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">黄易</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">回首页</a>",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("梦远书城") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("fy.js") >= 0) {
						bw.write(temp.replaceFirst(
								"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("wd.js") >= 0) {
					} else if (temp.indexOf("WB.js") >= 0) {
					} else if (temp.indexOf("wdp.js") >= 0) {
					} else if (temp.indexOf("wdt.js") >= 0) {
					} else if (temp.indexOf("tj.js") >= 0) {
					} else if (temp.indexOf("01x.js") >= 0) {
					} else if (temp.indexOf("02x.js") >= 0) {
					} else if (temp.indexOf("03x.js") >= 0) {
					} else if (temp.indexOf("04x.js") >= 0) {
					} else if (temp.indexOf("05x.js") >= 0) {
					} else if (temp.indexOf("06x.js") >= 0) {
					} else {
						bw.write(temp);
					}
					bw.newLine();
					bw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e1) {
					}
				}

				if (bw != null) {
					try {
						bw.close();
					} catch (IOException e1) {
					}
				}
			}
		}
	}
}
