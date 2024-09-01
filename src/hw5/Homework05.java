package hw5;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		/*
		 * for the fourth question please refer to class MyRectangle & MyRectangleMain
		 */
		
		//Q1
		Scanner dim = new Scanner(System.in);
		System.out.println("請輸入寬與高: ");
		int wid = dim.nextInt();
		int hei = dim.nextInt();
		starSquare(wid, hei);
		
		//Q2
		randAvg();
		
		//Q3
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
			};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
			};
		
		Homework05 w = new Homework05();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
		//Q5
		genAuthCode();
		
	}

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
	public static void starSquare(int width, int height) {

		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}


//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void randAvg() {
		
		System.out.print("本次亂數結果: ");
		int rand = 0;
		double avg = 0;
		for (int count = 1; count <= 10; count++) {
			rand = (int) (Math.random() * 100);
			System.out.print(rand + " ");
			avg += rand;
		}
		System.out.println();
		System.out.println("平均數: " + (avg / 10));
		System.out.println();
	}

//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳,如圖:

	public static int maxElement(int x[][]) {
		int max = 0;
		
		for (int i = 0; i < 2; i++) {
			max = x[i][0];
			for (int j = 0; j < 3; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public static double maxElement(double x[][]) {
		double max = 0;
		
		for (int i = 0; i < 2; i++) {
			max = x[i][0];
			for (int j = 0; j < 3; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),
//	當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:

	public static void genAuthCode() {
		System.out.println();
		
		System.out.println("本次隨機產生驗證碼為:");
		rand: 
		for (int count = 1; count <= 8; count++) { // 正確範圍48-57, 65-90, 97-122 (不正確範圍58-64, 91-96)
			int maxloop = 0;
			while (maxloop == 0) {
				int rand = (int) (Math.random() * 75) + 48;
				if (rand >= 58 && rand <= 64) {
					continue;
				} else {
					if (rand >= 91 && rand <= 96) {
						continue;
					} else {
						System.out.print((char)rand);
						continue rand;
					}
				}
			}
		}
	}
}
