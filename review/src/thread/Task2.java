package thread;

public class Task2 implements Runnable {
	public void run() {
		for (int i = 1000; i < 1100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); // Thread를 잠시 멈춰줌
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
