package prolan10114413;

import java.util.LinkedList;

/**
 * Class MyQueue adalah class penerapan struktur data queue. Class MyQueue
 * bersifat generic sehingga bisa memasukkan data dengan bermacam-macam tipe
 * data.
 * 
 * @author Firman Nizammudin Fakhrul - 10114413
 * @version 1.0
 * @since 2016-07-26
 */
public class MyQueue<E> {
	LinkedList<E> myQueue = new LinkedList<E>();
	
	/**
	 * Memasukkan data ke dalam list di posisi paling akhir.
	 * 
	 * @param x
	 *            adalah data yang akan dimasukkan.
	 * */
	public void enqueue(E x) {
		myQueue.addLast(x);
	}
	
	/**
	 * Mengeluarkan data pertama yang ada di dalam list.
	 * 
	 * @return Data pada posisi terdepan/pertama.
	 * @exception ListIsEmptyException
	 *                Jika list dalam keadaan kosong.
	 * */
	public E dequeue() throws ListIsEmptyException {
		if (kosong())
			throw new ListIsEmptyException();
		else
			return myQueue.removeFirst();
	}
	
	/**
	 * Mengubah list ke String.
	 * 
	 * @return List dalam bentuk String, diapit oleh [] dan setiap data
	 *         dipisahkan oleh koma.
	 * */
	public String toString() {
		return myQueue.toString();
	}
	
	/**
	 * Mengecek apakah list dalam keadaan penuh atau tidak. Menghasilkan selalu
	 * false karena list bersifat dinamis dan tidak dipatok maksimal jumlah
	 * data.
	 * 
	 * @return false
	 * */
	public boolean penuh() {
		return false;
	}
	
	/**
	 * Mengecek apakah list dalam keadaan kosong atau tidak.
	 * 
	 * @return true jika list kosong, false jika list tidak kosong.
	 * */
	public boolean kosong() {
		return myQueue.isEmpty() ? true : false;
	}

	/**
	 * Mengembalikan data pertama yang ada di dalam list.
	 * 
	 * @return Data terdepan/pertama.
	 * @exception ListIsEmptyException
	 *                Jika list dalam keadaan kosong.
	 * */
	public E terdepan() throws ListIsEmptyException {
		if (kosong())
			throw new ListIsEmptyException();
		else
			return myQueue.peekFirst();
	}
}
