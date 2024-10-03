package hw7;

import java.io.*;

/*
	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
	代表的檔案會複製到第二個參數代表的檔案
 */

public class Homework07_copyFile {

	public void copyFile(String src, String dest) throws IOException {

		File inputFile = new File(src);
		File outFile = new File(dest);

		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outFile);

		int c;

		System.out.println("檔案複製成功：");
		while ((c = in.read()) != -1) {
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}

		out.close();
		in.close();

	}

}
