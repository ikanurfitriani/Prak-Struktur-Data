import java.util.LinkedList;
public class Tugas2_LinkedList {
	public static void main(String args[]) {
		LinkedList<String> nama = new LinkedList<String>();
		//Untuk menambahkan data nama
		nama.add("Ika");
		nama.add("Suho");
		nama.add("Siwon");
		nama.add("Aleta");
		nama.add("Angi");
		//Untuk melihat seluruh isi ArrayList sebelum dihapus
		System.out.println("Sebelum dihapus : " + nama);
		//Untuk menghapus (Disini saya menghapus nama Aleta)
		nama.remove(3);
		//Untuk melihat secara satu per satu setelah dihapus
		System.out.println("Sesudah dihapus : ");
		for(int x = 0; x < nama.size(); x++) {
			System.out.println(nama.get(x));
		}
	}
}