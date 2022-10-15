import java.util.ArrayList;
class Tugas2_ArrayList {
	public static void main(String args[]) {
		ArrayList<String> nama = new ArrayList<String>();
		//Untuk menambahkan data nama
		nama.add("Ika");
		nama.add("Suho");
		nama.add("Siwon");
		nama.add("Aleta");
		nama.add("Angi");
		//Untuk melihat seluruh isi ArrayList sebelum dihapus
		System.out.println("Sebelum dihapus : " + nama);
		//Untuk menghapus (Disini saya menghapus nama Dimas)
		nama.remove(2);
		//Untuk melihat secara satu per satu setelah dihapus
		System.out.println("Sesudah dihapus : ");
		for(int x = 0; x < nama.size(); x++) {
			System.out.println(nama.get(x));
		}
	}
}