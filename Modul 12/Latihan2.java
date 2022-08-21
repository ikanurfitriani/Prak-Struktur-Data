import java.util.ArrayList;
public class Latihan2 {
	Latihan2() {
		ArrayList<String> daftarMhs = new ArrayList<String>();
		if (daftarMhs.isEmpty() == true) {
			System.out.println("Linkedlist kosong");
		} else {
			System.out.println("Linkedlist isi");
		}
		daftarMhs.add("Agungbp");
		daftarMhs.add("Bambang");
		if (daftarMhs.isEmpty() == true) {
			System.out.println("Linkedlist kosong");
		} else {
			System.out.println("Linkedlist isi");
		}
	}

	public static void main(String[] args) {
		new Latihan2();
	}
}