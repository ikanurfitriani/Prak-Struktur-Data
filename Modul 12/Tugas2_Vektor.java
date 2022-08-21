import java.util.Vector;
class Tugas2_Vektor {
	public static void main(String args[]) {
		Vector<String> nama = new Vector<String>();
		//Untuk menambahkan data nama
		nama.add("Ika");
		nama.add("Suho");
		nama.addElement("Siwon");
		nama.addElement("Aleta");
		nama.addElement("Angi");
		//Untuk melihat seluruh isi Vector sebelum dihapus
		System.out.println("Sebelum dihapus : " + nama);
		//Untuk menghapus (Disini saya menghapus nama Angi)
		nama.remove(4);
		//Untuk melihat secara satu per satu setelah dihapus
		System.out.println("Sesudah dihapus : ");
		for(int x = 0; x < nama.size(); x++) {
			System.out.println(nama.get(x));
		}
	}
}