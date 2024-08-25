package hw3;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {

//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//		(提示:Scanner,三角形成立條件,判斷式if else)

		System.out.println("3-1: 三角形判斷");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number:");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();

		if (data1 + data3 > data2 && data1 + data2 > data3 && data2 + data3 > data1) {
			if (data1 == data3 && data1 == data2 && data2 == data3) {
				System.out.print("正三角形");
			} else if (data1 == data3 || data1 == data2 || data2 == data3) {
				System.out.print("等腰三角形");
			} else {
				System.out.print("其他三角形");
			}
		} else {
			System.out.print("不是三角形");
		}

		System.out.println("\n");

		/*
		 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		 * (提示:Scanner,亂數方法,無窮迴圈)
		 */

		System.out.println("3-2: 猜數字(0-100)");
		System.out.println("Input a number:");
		int ans = sc.nextInt();
		int r = (int) (Math.random() * 101);

		if (ans == r) {
			System.out.println(r + ", correct!");
		} else {
			while (ans != r) {
				if (ans < r) {
					System.out.println("Not " + ans + ", bigger!");
					ans = sc.nextInt();
				} else if (ans > r) {
					System.out.println("Not " + ans + ", Smaller!");
					ans = sc.nextInt();
				} else {
					break;
				}
			}
			System.out.println(r + ", correct!");
		}

		System.out.println("\n");

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//		請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
//		(提示:Scanner)

		System.out.println("3-3: 自選不要的數字");
		System.out.println("Input a number:");
		int unwantedNo = sc.nextInt();

		while (unwantedNo >= 0) {
			if (unwantedNo >= 1 && unwantedNo <= 9) {
				for (int no = 1; no <= 49; no++) {

					int lastno = no % 10; // 取餘數是否為unwantedNo
					int firstno = no / 10; // 取整數是否為unwantedNo

					if (lastno != unwantedNo && firstno != unwantedNo) {
						System.out.print(no + " ");
					}
				}
				break;
			} else {
				System.out.println("請輸入介於1~9的數字");
				unwantedNo = sc.nextInt();
			}
		}
	}
}