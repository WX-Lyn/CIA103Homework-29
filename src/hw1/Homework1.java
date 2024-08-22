package hw1;

public class Homework1 {

	public static void main(String[] args) {
//	• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12 + 6;
		int b = 12 * 6;
		System.out.println("1. 12與6的和與積為:" + a + "與" + b);

//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int c = 200 / 12;
		int d = 200 - (c*12);
		System.out.println("2. 200顆雞蛋是" + c + "打" + d + "顆");
		
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total = 256559;
		int day;
		int hour;
		int minute;
		int second;
		
		day = total/60/60/24;
		hour = (total/60/60) - day * 24;
		minute = (total/60) - (hour * 60) - (day * 24 * 60);
		second = total - (minute * 60) - (hour * 60 * 60) - (day * 24 * 60 * 60);
				
		System.out.println("3. " + total + "秒為" + day + "天" + hour + "小時" + minute + "分" + second + "秒");
		
//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double p = 3.1415;
		double area = p * Math.pow(5, 2);
		double circle = 2 * 5 * p;
		System.out.printf("4. 圓面積與圓周長分別為%.2f", area);
		System.out.printf("與%.2f%n", circle);
				
//	• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//	  金加利息共有多少錢(用複利計算，公式請自行google)
		double fv = 0;
		double pv = 1_500_000;
		double r = 1.02;
		int n = 10;
		fv = pv * Math.pow(r, n);
		System.out.printf("5. 10年後的本金加利息為 %.0f 元%n", fv);
				
//	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
		int ans1 = 5 + 5;
		int ans2 = 5 + '5';
		char ans2_2 = 5 + '5';
		String ans3 = 5 + "5";
		System.out.println("6. 答 " + ans1);
		// 資料型態int整數，搭配算術運算子，以數值計算，所以5+5=10
		
		System.out.println("   答 " + ans2);
		/* 等號右邊第一個 5 是數值(10進位)，第二個 '5' 屬於char字元
		 * 如果使用資料型態整數int組合數值與字串，
		 * 後面的字串會依其在unicode表中對應的編號(16進位)，轉換成10進位後，再與前面的數值 5 相加
		 * 在unicode表中 '5' 對應的編號是0035(16進位)，轉換成10進位後為數值 53
		 * 故答案為 5 + 53 = 58
		 */
		
		System.out.println("   答 " + ans2_2);
		/* 如果使用資料型態字元char組合5 + '5'
		 * 等號右邊的 '5' 同樣依照unicode對應的編號0035(16進位)轉換成10進位的數值 53
		 * 進行數值的計算 5 + 53 = 58 (10進位)
		 * 因為是char，所以會把58轉回成16進位的003A，在unicode表中對應到的是符號 : 
		 */
		
		System.out.println("   答 " + ans3);
		// 使用字串String搭配數值，數值會直接被當作文字串接，而不是做計算
				
	}
}
