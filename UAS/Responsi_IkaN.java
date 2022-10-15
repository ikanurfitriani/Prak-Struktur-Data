import java.util.Scanner;

class formatBarang {
	// bagian deklarasi struktur record ---------------------------------
	String nama_barang;
	int banyak_barang, harga_eceran, sub_total, total;
}

class Responsi_IkaN {
	public static int N = 9;
	// ----------- Fungsi untuk mengentri data ke dalam Larik -----------
	public static void ngentriData(formatBarang dataBarang[]) {
		// bagian entri data ke dalam struktur larik --------------------
		Scanner masukan = new Scanner(System.in);
		int x=0;
		for (int i = 0; i <= N - 1; i++) {
			System.out.println("Barang Ke: "+ (i+1));
			System.out.print("Silakan masukkan nama barang : ");
			dataBarang[i].nama_barang = masukan.next();
			System.out.print("Silakan masukkan banyak barang : ");
			dataBarang[i].banyak_barang = masukan.nextInt();
			System.out.print("Silakan masukkan harga eceran : ");
			dataBarang[i].harga_eceran = masukan.nextInt();
			dataBarang[i].sub_total = dataBarang[i].harga_eceran * dataBarang[i].banyak_barang;
			dataBarang[i].total = x += dataBarang[i].sub_total;
			System.out.println("");
			System.out.println("Sub Total : " + dataBarang[i].sub_total);
			System.out.println("Total : " + dataBarang[i].total);
			System.out.println("");
		}
	}

	// ----------- Fungsi untuk menampilkan data -----------
	public static void tampilkanData(formatBarang dataBarang[]) {
		// bagian menampilkan isi struktur Larik ------------------------
		System.out.println("---------------------------------------------");
		System.out.println("No\tNamaBarang\tBanyaknya\tHargaEceran\tSubTotal");
		System.out.println("---------------------------------------------");
		for (int i = 0; i <= N - 1; i++) {
			System.out.print((i+1) + "\t ");
			System.out.print(dataBarang[i].nama_barang + "\t ");
			System.out.print(dataBarang[i].banyak_barang + "\t ");
			System.out.print(dataBarang[i].harga_eceran + "\t ");
			System.out.println(dataBarang[i].sub_total);
		}
		System.out.println("---------------------------------------------");
		for (int i = 0; i <= N - 1; i++) {
			if (dataBarang[i].sub_total >= 15000) {
				System.out.println("---------------------------------------------");
				System.out.println("No\tNamaBarang\tBanyaknya\tHargaEceran\tSubTotal");
				System.out.println("---------------------------------------------");
				System.out.print((i+1) + "\t ");
				System.out.print(dataBarang[i].nama_barang + "\t ");
				System.out.print(dataBarang[i].banyak_barang + "\t ");
				System.out.print(dataBarang[i].harga_eceran + "\t ");
				System.out.println(dataBarang[i].sub_total);
			}
		}
		System.out.println("---------------------------------------------");
	}

	// ----------- Program Utama -----------
	public static void main(String[] args) {
		// bagian deklarasi record berbasis LARIK -----------------------
		formatBarang dataBarang[] = new formatBarang[9];
		dataBarang[0] = new formatBarang();
		dataBarang[1] = new formatBarang();
		dataBarang[2] = new formatBarang();
		dataBarang[3] = new formatBarang();
		dataBarang[4] = new formatBarang();
		dataBarang[5] = new formatBarang();
		dataBarang[6] = new formatBarang();
		dataBarang[7] = new formatBarang();
		dataBarang[8] = new formatBarang();
		// pemanggilan fungsi-fungsi ----------------------
		ngentriData(dataBarang);
		tampilkanData(dataBarang);
	}
}