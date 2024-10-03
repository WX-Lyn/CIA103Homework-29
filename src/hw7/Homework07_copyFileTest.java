package hw7;

import java.io.IOException;

public class Homework07_copyFileTest {
	public static void main(String[] args) throws IOException {

		Homework07_copyFile copy = new Homework07_copyFile();
		String src = "C:\\CIA103_Workspace\\Homework-29\\files\\Data.txt";
		String dest = "C:\\CIA103_Workspace\\Homework-29\\files\\DataCopied.txt";

		copy.copyFile(src, dest);
	}
}
