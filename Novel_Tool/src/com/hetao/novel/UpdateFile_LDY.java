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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\ym1\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\ym\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\sdzm2\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\sdzm\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\sxhg3\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\sxhg\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\fczz4\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\fczz\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\eglg5\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\eglg\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\zszz6\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\zszz\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\gs7\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\gs\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\hj8\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\hj\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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

			File file = new File("C:\\Doc\\Novel\\�����ϵ��\\sn9\\" + getFileName(i));
			BufferedReader br = null;
			BufferedWriter bw = null;

			try {
				br = new BufferedReader(new FileReader(file));

				FileWriter fw = new FileWriter("C:\\Doc\\Novel2\\�����ϵ��\\sn\\"
						+ getFileName(i));
				bw = new BufferedWriter(fw);
				String temp = null;
				int j = 1;
				while ((temp = br.readLine()) != null) {
					System.out.print("line-------" + j++);
					System.out.println(temp);
					if (temp.indexOf("_��Զ���") >= 0) {
						bw.write(temp.replaceFirst("_��Զ���", ""));

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
					} else if (temp.indexOf("������κ") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("<a href=\"index.htm\">���귭��</a>") >= 0) {
						bw.write("</td>");
					} else if (temp.indexOf("www.my285.com") >= 0) {
						bw.write(temp
								.replaceFirst(
										"<a href=\"http://www.my285.com\">��Զ���</a>",
										"")
								.replaceAll(
										"> <a href=\"../index.htm\">����</a> >",
										"")
								.replaceAll(
										"<a href=\"http://www.my285.com\">����ҳ</a>",
										"")
								.replaceAll("<a href=\"index.htm\">��Ŀ¼</a>","<a href=\"../index.htm\">��Ŀ¼</a>")
								.replaceAll(
										"<a href=\"http://www.my285.com\">��Զ���(<font face=\"������κ\">my285.com</font>)</a>",
										"").replaceFirst("<a href=\"../index.htm\">����</a>", "")
										.replaceAll("��>��", "").replaceAll("\"index.htm\"", "\"../index.htm\"").replaceFirst(
												"<script src=\"/41tf/fy.js\"></script>", ""));
					} else if (temp.indexOf("bt.js") >= 0) {
					} else if (temp.indexOf("��Զ���") >= 0) {
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
