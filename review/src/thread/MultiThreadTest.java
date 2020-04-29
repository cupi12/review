package thread;

/*
 * Thread 클레스
 */
public class MultiThreadTest {
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		task1.start();

		Task2 task2 = new Task2();
		Thread thread2 = new Thread(task2);
		thread2.start();

		Thread thread3 = new Thread(() -> {
			for (int i = 1000; i < 1100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500); // Thread를 잠시 멈춰줌
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		for (int i = 10000; i <= 10100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of main
}// end of class
