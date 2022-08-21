import java.util.Scanner;
class formatBiodata3
{	//bagian deklarasi struktur record --------------------------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class Tugas1
{	public static int N=5;
	//--------------------------------------------------
	//--- Fungsi untuk mengentri data ke dalam Larik ---
	//--------------------------------------------------
	public static void ngentriData(formatBiodata3 biodataMahasiswa[])
	{
		//bagian entri data ke dalam struktur larik -------------------------------------
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
			System.out.print("Silakan masukkan Jenis Kelamin anda : ");
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
	//-----------------------------------------
	//---	Fungsi untuk menampilkan data	---
	//-----------------------------------------
	public static void tampilkanData(formatBiodata3 biodataMahasiswa[])
	{
		//bagian menampilkan isi struktur Larik -----------------------------------------
		System.out.println("-----------------------------------------------------------");
		System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI0\tHOBI1\tHOBI2\tIPK");
		System.out.println("-----------------------------------------------------------");
		for (int i=0; i<=N-1; i++)
		{
			System.out.print(biodataMahasiswa[i].nama + "\t");
			System.out.print(biodataMahasiswa[i].alamat + "\t");
			System.out.print(biodataMahasiswa[i].umur + "\t");
			System.out.print(biodataMahasiswa[i].jekel + "\t");
			System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
			System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
			System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
			System.out.println(biodataMahasiswa[i].ipk + "\t");
		}
		System.out.println("-----------------------------------------------------------");
	}
	public static void tambahDatadibelakang(formatBiodata3 biodataMahasiswa[]) {
		formatBiodata3 biodataMahasiswaBaru = new formatBiodata3();
		Scanner masukan = new Scanner(System.in);
		int bacaTombol = 0;
		System.out.print("Silahkan masukan nama anda : ");
		biodataMahasiswaBaru.nama = masukan.next();
		System.out.print("Silahkan masukan alamat anda : ");
		biodataMahasiswaBaru.alamat = masukan.next();
		System.out.print("Silahkan masukan umur anda : ");
		biodataMahasiswaBaru.umur = masukan.nextInt();
		System.out.print("Silahkan masukan jenis kelamin anda : ");
		try {
		bacaTombol = System.in.read();
		}
		catch(java.io.IOException e) {
		}
		biodataMahasiswaBaru.jekel = (char)bacaTombol;
		System.out.println("Silahkan masukan hobi (maks 3) : ");
		System.out.print("Hobi ke-0 : ");biodataMahasiswaBaru.hobi[0] = masukan.next();
		System.out.print("Hobi ke-1 : ");biodataMahasiswaBaru.hobi[1] = masukan.next();
		System.out.print("Hobi ke-2 : ");biodataMahasiswaBaru.hobi[2] = masukan.next();
		System.out.print("Silahkan masukan ipk anda : ");
		biodataMahasiswaBaru.ipk = masukan.nextFloat();
		biodataMahasiswa[N] = biodataMahasiswaBaru;
		N++;
		System.out.println(" ");
	}
	//---------------------------------
	//---		Program Utama		---
	//---------------------------------
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Silahkan masukan banyak data record : ");
		N = input.nextInt();
		if (N>0 && N<=20) {
			//bagian deklarasi record berbasis LARIK ----------------------------------------
			formatBiodata3 biodataMahasiswa[] = new formatBiodata3[N + 1];
			for (int i = 0; i < (N + 1); i++) {
				biodataMahasiswa[i] = new formatBiodata3();
			}
			ngentriData(biodataMahasiswa);
			tampilkanData(biodataMahasiswa);
			String j = "Y";
			while (j.equalsIgnoreCase("Y")) {
				System.out.println("");
				System.out.print("Masukan data lagi(Y/N) : ");
				j = input.next();
				if (j.equalsIgnoreCase("N")) {
					tampilkanData(biodataMahasiswa);
					break;
				} else {
					tambahDatadibelakang(biodataMahasiswa);
				}
			}
		} else {
			System.out.println("Salah masukan data (Maks. 20)!!!");
		}
	}
}