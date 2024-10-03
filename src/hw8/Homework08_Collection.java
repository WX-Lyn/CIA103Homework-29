package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework08_Collection {
	public static void main(String[] args) {
		List list = new ArrayList();
		Object ob = new Object();

		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short("100"));
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(ob);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// Iterator
		System.out.println("使用iterator迴圈");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======================");

		// 傳統for
		System.out.println("傳統的for 迴圈");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");

		// foreach
		System.out.println("使用for-each");
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("======================");

		// 移除不是number相關的物件並印出
		for (Object numericEle : list) {
			if (numericEle instanceof Number) {
				System.out.println(numericEle);
			}
		}
	}
}
