package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task2()); //task 실행시, 에러발생 thread 종료
		executorService.execute(()->{//task 실행시, 에러발생 thread 종료되지 않고, thread는 재사용이 가능
			for(int i =1; i<=100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
	}
}
