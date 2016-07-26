package prolan10114413;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Class MyStack adalah class penerapan struktur data stack. Class MyStack
 * bersifat generic sehingga bisa memasukkan data dengan bermacam-macam tipe
 * data.
 * 
 * @author Firman Nizammudin Fakhrul - 10114413
 * @version 1.0
 * @since 2016-07-26
 */
public class MyStack<E> {
	LinkedList<E> myStack = new LinkedList<E>();

	/**
	 * Memasukkan data ke dalam list di posisi paling atas.
	 * 
	 * @param x
	 *            adalah data yang akan dimasukkan.
	 * */
	public void push(E x) {
		myStack.addFirst(x);
	}

	/**
	 * Mengeluarkan data pada posisi teratas dari dalam list.
	 * 
	 * @return Data pada posisi teratas.
	 * @exception ListIsEmptyException
	 *                Jika list dalam keadaan kosong.
	 * */
	public E pop() throws ListIsEmptyException {
		if (kosong())
			throw new ListIsEmptyException();
		else
			return myStack.removeFirst();
	}

	/**
	 * Mengubah list ke String.
	 * 
	 * @return List dalam bentuk String, diapit oleh [] dan setiap data
	 *         dipisahkan oleh koma.
	 * */
	public String toString() {
		return myStack.toString();
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
		return myStack.isEmpty() ? true : false;
	}

	/**
	 * Mengembalikan data teratas yang ada di dalam list.
	 * 
	 * @return Data teratas.
	 * @exception ListIsEmptyException
	 *                Jika list dalam keadaan kosong.
	 * */
	public E teratas() throws ListIsEmptyException {
		if (kosong())
			throw new ListIsEmptyException();
		else
			return myStack.peekFirst();
	}

	/**
	 * Membalikkan urutan dari list.
	 * 
	 * @return List yang sudah dibalik urutannya.
	 * @exception ListIsEmptyException
	 *                Jika list dalam keadaan kosong.
	 * */
	public void balikurutan() throws ListIsEmptyException {
		if (kosong())
			throw new ListIsEmptyException();
		else
			Collections.reverse(myStack);
	}

	/**
	 * Mengembalikan jumlah data di dalam list.
	 * 
	 * @return Jumlah data di dalam list.
	 * */
	public int banyak() {
		return myStack.size();
	}
}