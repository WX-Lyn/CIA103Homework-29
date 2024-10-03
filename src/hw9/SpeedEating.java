package hw9;

public class SpeedEating implements Runnable {
	int count = 1;
	private String name;
	boolean finished = false;

	public SpeedEating(String name) {
		this.name = name;
	};

	public SpeedEating() {
	};

	public void run() {
		while (!finished) {
			synchronized (this) {
				while (count <= 10) {
					System.out.println(name + "吃第" + count + "碗飯");
					count++;
					try {
						Thread.sleep(((int) (Math.random() * 3000)) + 500);
					} catch (Exception e) {
					}
				}
				finished = true;
				System.out.println(name + "吃完了!");
			}
		}
	}

	public static void main(String[] args) {
		SpeedEating se1 = new SpeedEating("詹姆士");
		Thread t1 = new Thread(se1);
		SpeedEating se2 = new SpeedEating("饅頭人");
		Thread t2 = new Thread(se2);

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			
		}
		System.out.println("-----大胃王比賽結束-----");
	}
}
