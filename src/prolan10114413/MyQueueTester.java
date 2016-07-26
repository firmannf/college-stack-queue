package prolan10114413;

/**
 * Class MyQueueTester adalah class tester dari class MyQueue
 * 
 * @author Firman Nizammudin Fakhrul - 10114413
 * @version 1.0
 * @since 2016-07-26
 */
public class MyQueueTester {
	
	/**
	 * Method yang akan dijalankan pada saat aplikasi dijalankan.
	 * */
	public static void main(String[] args) {
		MyQueue<String> myQueue = new MyQueue<String>();

		myQueue.enqueue("Firman");
		myQueue.enqueue("Nizammudin");
		myQueue.enqueue("Fakhrul");
		System.out.println("Queue : " + myQueue.toString());

		System.out.println("Data Keluar : " + myQueue.dequeue());
		System.out.println("Queue : " + myQueue.toString());

		System.out.println("Queue Penuh ? " + myQueue.penuh());
		System.out.println("Queue Kosong ? " + myQueue.kosong());

		System.out.println("Data Paling Depan : " + myQueue.terdepan());
	}

}
