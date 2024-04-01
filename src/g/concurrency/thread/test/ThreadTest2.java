package g.concurrency.thread.test;

/**
 * Question: What happens ?
 * Answer: Who can say ? This is a severe race condition perhaps some numbers will be printed,or perhaps not !!
 */
public class ThreadTest2 {

	public static void main(String[] args) {
		
		final int[] data = { 0 };
		new Thread(() -> {
			while (data[0] < 4) {
				System.out.println("> " + data[0]);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				data[0] = i;
			}
		}).start();
		

	}

}
