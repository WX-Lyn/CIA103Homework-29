package hw9;

class Bank {
	private int balance = 1000;

	// 如果帳戶餘額高於3000，媽媽停止存入金額
	synchronized public void deposit(int amount) {
		while (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			System.out.println("熊大被老媽告知帳戶已經有錢！");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);
		notify();
	}

	// 如果帳戶餘額低於2000，熊大通知媽媽匯款
	// 如果帳戶餘額低於1000，熊大停止提款
	synchronized public void withdrawal(int amount) {
		while (balance < 1000) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("熊大領了" + amount + "帳戶共有：" + balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}

	}
}

class Deposit extends Thread {
	Bank b;

	public Deposit(Bank b) {
		this.b = b;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			b.deposit(2000);
		}
	}
}

class Withdrawal extends Thread {
	Bank b;

	public Withdrawal(Bank b) {
		this.b = b;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			b.withdrawal(1000);
		}
	}

}

public class Transaction {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Deposit deposit = new Deposit(bank);
		Withdrawal withdrawal = new Withdrawal(bank);
		deposit.start();
		withdrawal.start();
	}
}
