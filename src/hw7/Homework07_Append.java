package hw7;

import java.io.*;

/*
	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
	append功能讓每次執行結果都能被保存起來)
 */

public class Homework07_Append {
	public static void main(String[] args) throws IOException {

		File data = new File("C:\\CIA103_Workspace\\Homework-29\\files\\Data.txt");

		FileOutputStream fos = new FileOutputStream(data, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		System.out.println("10個亂數(1-1000)寫入成功：");
		int rand;
		for (int i = 0; i <= 10; i++) {
			rand = (int) ((Math.random() * 1000) + 1);
			ps.println(rand);
			System.out.println(rand);
		}

		ps.close();
		bos.close();
		fos.close();

	}
}
