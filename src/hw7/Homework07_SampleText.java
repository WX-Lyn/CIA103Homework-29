package hw7;

import java.io.*;

// Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class Homework07_SampleText {

	public static void main(String[] args) throws IOException {
		
		File fileIn = new File("C:\\CIA103_Workspace\\Homework-29\\files\\Sample.txt");
		FileReader in = new FileReader(fileIn);
		BufferedReader br = new BufferedReader(in);

		String str;
		int count = 0;
		int row = 0;

		while ((str = br.readLine()) != null) {
			row++;
			count += str.length();
		}

		br.close();
		in.close();

		System.out.print(fileIn.getName() + "檔案共有" + fileIn.length() + "個位元組，" + count + "個字元，" + row + "列資料");
	}
}

