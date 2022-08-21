import java.util.Scanner;
class formatBiodata { //bagian deklarasi struktur record --------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class Latihan {
	public static int N;
	public static boolean hasil = false;
	//--------------------------------------------------
	//--- Fungsi untuk mengentri data ke dalam Larik ---
	//--------------------------------------------------
	public static void ngentriData(formatBiodata biodataMahasiswa[])
	{
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		for (int i=0; i<=N-1; i++)
		{
			System.out.print("Silakan masukkan nama anda : ");
			biodataMahasiswa[i].nama = masukan.next();
			System.out.print("Silakan masukkan alamat anda : ");
			biodataMahasiswa[i].alamat = masukan.next();
			System.out.print("Silakan masukkan umur anda : ");
			biodataMahasiswa[i].umur = masukan.nextInt();
			System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
			try
			{
				bacaTombol = System.in.read();
			}
			catch(java.io.IOException e)
			{
			}
			biodataMahasiswa[i].jekel = (char)bacaTombol;
			System.out.println("Silakan masukkan hobi (maks 3) : ");
			System.out.print("hobi ke-0 : ");
			biodataMahasiswa[i].hobi[0] = masukan.next();
			System.out.print("hobi ke-1 : ");
			biodataMahasiswa[i].hobi[1] = masukan.next();
			System.out.print("hobi ke-2 : ");
			biodataMahasiswa[i].hobi[2] = masukan.next();
			System.out.print("Silakan masukkan IPK anda : ");
			biodataMahasiswa[i].ipk = masukan.nextFloat();
			System.out.println("");
		}
	}
	//---------------------------------------------------------------------
	//---	 Fungsi untuk Mencari Data Secara Linear Search (Loop: For)	---
	//---------------------------------------------------------------------
	public static void cariDataLinear(formatBiodata biodataMahasiswa[])
	{
		Scanner masukan = new Scanner(System.in);
		//bagian memasukkan kata kunci ----------------------------------------
		System.out.print("\nMasukkan jenis kelamin (L/P) yang dicari : ");
		char carijekel = masukan.next().charAt(0);
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
		System.out.println("-------------------------------------------------------------");
		for (int i=0; i <= N-1; i++){
			if (biodataMahasiswa[i].jekel == carijekel){
				hasil = true;
				tampilkanData(biodataMahasiswa, i);
				System.out.println("");
			}
		}
		if(hasil != true){
			System.out.println("Maaf, data yang anda cari tidak ditemukan");
			System.out.println("");
		}
	}
	//-------------------------------------------------
	//---	   Fungsi untuk Menampilkan Data	    ---
	//-------------------------------------------------
	public static void tampilkanData(formatBiodata biodataMahasiswa[], int i)
	{	//bagian menampilkan isi struktur Larik -----------------------------------------
			System.out.print(i + ".");
			System.out.print(biodataMahasiswa[i].nama + "\t");
			System.out.print(biodataMahasiswa[i].alamat + "\t");
			System.out.print(biodataMahasiswa[i].umur + "\t");
			System.out.print(biodataMahasiswa[i].jekel + "\t");
			System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
			System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
			System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
			System.out.println(biodataMahasiswa[i].ipk + "\t");
	}
	//-----------------------------------------------------
	//-------		      Program Utama		      ---------
	//-----------------------------------------------------
	public static void main(String[] args)
	{	//bagian deklarasi record berbasis LARIK -----------------------
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan jumlah data : ");
		N = masukan.nextInt();
		formatBiodata biodataMahasiswa[] = new formatBiodata[N];
		for(int i = 0; i <= N-1; i++) {
			biodataMahasiswa[i] = new formatBiodata();
		}
		ngentriData(biodataMahasiswa);
		cariDataLinear(biodataMahasiswa);
	}
}