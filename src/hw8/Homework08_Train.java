package hw8;

import java.util.Objects;

public class Homework08_Train implements Comparable<Homework08_Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Homework08_Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Homework08_Train other = (Homework08_Train) obj;
		return number == other.number;
	}

	public int compareTo(Homework08_Train train) {
		if (this.number > train.number) {
			return -1;
		} else {
			if (this.number == train.number) {
				return 0;
			} else {
				return 1;
			}
		}
	}

}
