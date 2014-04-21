package com.hetao.novel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile_LDY {

	
	
	private static void updateStage1(){
		for (int i = 1; i <= 30; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\ym1\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\ym\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	
	private static void updateStage2(){
		for (int i = 1; i <= 39; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\sdzm2\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\sdzm\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	private static void updateStage3(){
		for (int i = 1; i <= 30; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\sxhg3\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\sxhg\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	
	private static void updateStage4(){
		for (int i = 1; i <= 36; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\fczz4\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\fczz\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	
	private static void updateStage5(){
		for (int i = 1; i <= 91; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\eglg5\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\eglg\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	private static void updateStage6(){
		for (int i = 1; i <= 91; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\zszz6\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\zszz\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	private static void updateStage7(){
		for (int i = 1; i <= 35; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\gs7\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\gs\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	private static void updateStage8(){
		for (int i = 1; i <= 40; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\hj8\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\hj\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	
	private static void updateStage9(){
		for (int i = 1; i <= 38; i++) {

			File file = new File("C:\\Doc\\Novel\\凌渡宇系列\\sn9\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\凌渡宇系列\\sn\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_梦远书城") >= 0) {
						bw.write(temp.replaceFirst("_梦远书城", ""));

					}  else if (temp.indexOf("DH1.js") >= 0) {

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
								.replaceAll("<a href=\"index.htm\">回目录</a>","<a href=\"../index.htm\">回目录</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">梦远书城(<font face=\"华文新魏\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">黄易</a>", "")
										.replaceAll("　>　", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
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
					} else if (temp.indexOf("<a href=\"index.htm\">") >= 0) {
						bw.write(temp.replaceAll(
								"<a href=\"index.htm\">", "<a href=\"../index.htm\">"));
				     }else {
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		updateStage9();

	}
	
	
	private static String getFileName(int i) {
		String name = null;
		if (i < 10) {
			name = "0" + i;
		} else if (i < 100) {
			name = ""+ i;
		} else {
			name = i + "";
		}

		return name + ".htm";

	}

}
