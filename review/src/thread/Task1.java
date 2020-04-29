package thread;

public class Task1 extends Thread {
	public void run() { // Thread를 사용하면 run메서드를 사용해야한다.
		synchronized (this) {
			System.out.println(this.getName());
			for (int i = 0; i < 1000; i++) {
				System.out.print(i + " ");
				if (i % 100 == 0) {
					System.out.println("");
				}
//				try {
//					Thread.sleep(500); // Thread를 잠시 멈춰줌
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
	}
}
