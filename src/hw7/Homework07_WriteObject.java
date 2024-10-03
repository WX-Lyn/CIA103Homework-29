package hw7;

/*
	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	
	承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
	型簡化本題的程式設計)
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

abstract class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public abstract void speak();
}

public class Homework07_WriteObject {

	public static void main(String[] args) throws Exception {

		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Folder created successfully!");
		} else {
			System.out.println("Folder already created!");
		}

		System.out.println("");

		// 輸出到目的地
		Animal[] ani = new Animal[4];
		ani[0] = new Cat("阿貓");
		ani[1] = new Cat("小貓");
		ani[2] = new Dog("阿狗");
		ani[3] = new Dog("小狗");

		File file = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < ani.length; i++) {
			oos.writeObject(ani[i]);
		}
		
		oos.close();
		fos.close();

		// 輸入 從檔案讀回來看看
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
		ois.close();
		fis.close();

	}
}
