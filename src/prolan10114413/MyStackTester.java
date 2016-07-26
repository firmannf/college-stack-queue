package prolan10114413;

/**
 * Class MyStackTester adalah class tester dari class MyStack
 * 
 * @author Firman Nizammudin Fakhrul - 10114413
 * @version 1.0
 * @since 2016-07-26
 */
public class MyStackTester {

	/**
	 * Method yang akan dijalankan pada saat aplikasi dijalankan.
	 * */
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<Integer>();

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		System.out.println("Stack : " + myStack.toString());

		System.out.println("Data Keluar : " + myStack.pop());
		System.out.println("Stack : " + myStack.toString());

		System.out.println("Stack Penuh ? " + myStack.penuh());
		System.out.println("" + "Stack Kosong ? " + myStack.kosong());

		System.out.println("Data Paling Atas : " + myStack.teratas());

		myStack.balikurutan();
		System.out.println("Balik Urutan Stack : " + myStack.toString());

		System.out.println("Banyaknya Tumpukan : " + myStack.banyak());
	}

}
