package hw8;

import java.util.*;

public class Homework08_TrainHashSet {
	public static void main(String[] args) {
		Set <Homework08_Train> train = new HashSet<Homework08_Train>();
		Homework08_Train t1 = new Homework08_Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Homework08_Train t2 = new Homework08_Train(1254, "區間", "屏東", "基隆", 700);
		Homework08_Train t3 = new Homework08_Train(118, "自強", "高雄", "台北", 500);
		Homework08_Train t4 = new Homework08_Train(1288, "區間", "新竹", "基隆", 400);
		Homework08_Train t5 = new Homework08_Train(122, "自強", "台中", "花蓮", 600);
		Homework08_Train t6 = new Homework08_Train(1222, "區間", "樹林", "七堵", 300);
		Homework08_Train t7 = new Homework08_Train(1254, "區間", "屏東", "基隆", 700);
		
		train.add(t1);
		train.add(t2);
		train.add(t3);
		train.add(t4);
		train.add(t5);
		train.add(t6);
		train.add(t7);
		
		
		// Train物件不重複
		System.out.println("Train物件不重複(無順序要求) HashSet");
		System.out.println("");
		System.out.println("for-each:");
		for(Homework08_Train tr : train) {
			System.out.println(tr.getNumber() + ", " + tr.getType() + ", " + tr.getStart() + ", " + tr.getDest() + ", " + tr.getPrice());
		}
		
		System.out.println("");
		System.out.println("迭代");
		Iterator<Homework08_Train> it = train.iterator();
		while(it.hasNext()) {
			Homework08_Train tr = it.next();
			System.out.println(tr.getNumber() + ", " + tr.getType() + ", " + tr.getStart() + ", " + tr.getDest() + ", " + tr.getPrice());
		}
		
	}
}
