package thread;

public class SyncTest {
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		task1.start();
		task1.setName("task1");
		
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();

		Task1 task3 = new Task1();
		task3.setName("task3");
		task3.start();
		
		String a = new String();

	}
}
