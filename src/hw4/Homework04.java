package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)

	public static void main(String[] args) {
		int[] ary1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(ary1);

		int a = 0;
		for (int b = 0; b < ary1.length; b++) {
			a += ary1[b];
		}

		int aryAvg = a / ary1.length; // avg= 52
		System.out.println("平均值: " + aryAvg);

		for (int b1 = 0; b1 < ary1.length; b1++) {
			if (ary1[b1] > aryAvg) {
				System.out.print(ary1[b1] + " "); // >avg
			}
		}

		System.out.println();
		System.out.println("======================");

//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)

		String s = "Hello World"; // System.out.println(s1.charAt(4));
		for (int str2 = 0; str2 < s.length(); str2++) {
			char str3 = s.charAt(s.length() - 1 - str2);
			System.out.print(str3);
		}

		System.out.println();
		System.out.println("======================");

//有個字串陣列如下 (八大行星)：
//{ "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" }
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)

		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String[] v = { "a", "e", "i", "o", "u" };

		int vowel = 0;
		for (int count = 0; count < planets.length; count++) { // count 陣列的第一個索引值=元素1
			for (int p1 = 0; p1 < planets[count].length(); p1++) { // p1 第一個元素的第1個字元
				for (int v1 = 0; v1 < v.length; v1++) { // v1 第二陣列的第一個字元
					if (planets[count].charAt(p1) == v[v1].charAt(0)) {
						vowel += 1;
					}
				}
			}
		}
		System.out.println(vowel);
		System.out.println("======================");

//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下：
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示：Scanner，二維陣列

		Scanner m = new Scanner(System.in);
		System.out.println("Input a number:");
		int need = m.nextInt();

		String[] empno = { "25", "32", "8", "19", "27" };
		int[] money = { 2500, 800, 500, 1000, 1200 };

		System.out.print("有錢可借的員工編號: ");
		int ppl = 0;
		for (int m1 = 0; m1 < money.length; m1++) {
			if (money[m1] >= need) {
				ppl += 1;
				System.out.print(empno[m1] + ", ");
			}
		}
		System.out.print("共" + ppl + "人");

		System.out.println();
		System.out.println("======================");

//	設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		Scanner date = new Scanner(System.in);
		System.out.println("Input three numbers (yyyy, mm, dd): ");
		int yy = date.nextInt();
		int mm = date.nextInt();
		int dd = date.nextInt();

		// calculate if a year is a leap year
		int year = 0; // 平=0, 閏=1
		if (yy % 4 != 0) {
			year = 0;
		} else {
			if (yy % 100 != 0) {
				year = 1;
			} else {
				if (yy % 400 != 0) {
					year = 0;
				} else {
					year = 1;
				}
			}
		}

		// (Array) list number of days in a month and a leap year.
		int[][] daysOfMonth = { 
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 平 =0
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }  // 閏 =1
		};

		if (year == 0) {
			if (dd < 0 || dd > daysOfMonth[year][mm - 1]) {
				// show a warning when the number of days exceeds those in its given month.
				System.out.println("日期應介於1到" + daysOfMonth[year][mm - 1] + "之間");
			} else {
				// proceed and calculate how many days there are from the beginning of the given
				// year to the given date.
				int allDdaysCount = 0;
				int count;
				for (count = 0; count < mm; count++) {
					allDdaysCount += daysOfMonth[year][count];
				}
				allDdaysCount -= (daysOfMonth[year][mm - 1] - dd);
				System.out.println("你輸入的日期為該年第" + allDdaysCount + "天");
			}
		} else {
			if (year == 1) {
				if (dd < 0 || dd > daysOfMonth[year][mm - 1]) {
					System.out.println("日期應介於1到" + daysOfMonth[year][mm - 1] + "之間");
				} else {
					int allDdaysCount = 0;
					int count;
					for (count = 0; count < mm; count++) {
						allDdaysCount += daysOfMonth[year][count];
					}
					allDdaysCount -= (daysOfMonth[year][mm - 1] - dd);
					System.out.println("你輸入的日期為該年第" + allDdaysCount + "天");
				}
			}
		}

		System.out.println();
		System.out.println("======================");

//	班上有8位同學，他們進行了6次考試結果如下：
//	請算出每位同學考最高分的次數
//	(提示：二維陣列)

		int[][] grade = {
			// 同學 1   2    3    4   5   6   7   8
				{  10, 35,  40, 100, 90, 85, 75, 70 }, //
				{  37, 75,  77,  89, 64, 75, 70, 95 }, // 考
				{ 100, 70,  79,  90, 75, 70, 79, 90 }, // 試
				{  77, 95,  70,  89, 60, 75, 85, 89 }, // 次
				{  98, 70,  89,  90, 75, 90, 89, 80 }, // 數
				{  90, 80, 100,  75, 50, 20, 99, 75 }, // 1 ~ 6次
		};

		int[] studentScore = new int[8];

		for (int ary = 0; ary < 6; ary++) {
			// pick up the maximum score in an array
			int max = grade[ary][0];
			for (int ele = 0; ele < 8; ele++) {
				if (grade[ary][ele] > max) {
					max = grade[ary][ele];
				}
			}
			
			// once the maximum score matches one in an index of an array, the value of that index increases by 1
			for (int student = 0; student < 8; student++) {
				if (max == grade[ary][student]) {
					studentScore[student]++;
				}
			}
		}

		// print out the array that contains how many times each student gets the maximum score in a test
		for (int count = 0; count < 8; count++) {
			int no = count + 1;
			System.out.println("第" + no + "位同學考最高分的次數: " + studentScore[count] + " ");
		}
	}
}