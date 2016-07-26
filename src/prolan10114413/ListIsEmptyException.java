package prolan10114413;

/**
 * Class ListIsEmptyException adalah class exception yang digunakan jika ada
 * suatu operasi atau tindakan yang tidak bisa dilakukan jika list dalam keaadan
 * kosong.
 * 
 * @author Firman Nizammudin Fakhrul - 10114413
 * @version 1.0
 * @since 2016-07-26
 */
public class ListIsEmptyException extends RuntimeException {
	
	/**
	 * Mengembalikan pesan kesalahan jika terjadi ListIsEmptyException.
	 * 
	 * @return Pesan kesalahan.
	 * */
	public String getMessage() {
		return "List is empty";
	}
}
