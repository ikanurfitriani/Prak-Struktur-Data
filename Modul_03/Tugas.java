import java.util.Scanner;
class formatBiodata { //bagian deklarasi struktur record --------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class Tugas {
	public static int N=5;
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
	//-------------------------------------------------
	//--- Fungsi untuk mengedit data di dalam Larik ---
	//-------------------------------------------------
	public static void editData(formatBiodata biodataMahasiswa[])
	{
		formatBiodata biodataMahasiswaBaru = new formatBiodata();
		Scanner masukan = new Scanner(System.in);
		int T;
		System.out.print("Data mana yang akan diedit? : ");
		T = masukan.nextInt();
		for (int i=T; i<=N-2; i++)
		{	biodataMahasiswa[i] = biodataMahasiswa[i+1];
		}
		N--;
		int bacaTombol=0;
		System.out.println("");
		System.out.println("Silakan masukkan data baru!");
		System.out.print("Silakan masukkan nama anda : ");
		biodataMahasiswaBaru.nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
		biodataMahasiswaBaru.alamat = masukan.next();
		System.out.print("Silakan masukkan umur anda : ");
		biodataMahasiswaBaru.umur = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try
		{
			bacaTombol = System.in.read();
		}
		catch(java.io.IOException e)
		{
		}
		biodataMahasiswaBaru.jekel = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswaBaru.hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		biodataMahasiswaBaru.hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		biodataMahasiswaBaru.hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
		biodataMahasiswaBaru.ipk = masukan.nextFloat();
		System.out.println("");
		for (int i=N-1; i>=T; i--)
		{	biodataMahasiswa[i+1] = biodataMahasiswa[i];
		}
		biodataMahasiswa[T] = biodataMahasiswaBaru;
		N++;
	}
	//-------------------------------------------------
	//---	   Fungsi untuk Menampilkan Data	    ---
	//-------------------------------------------------
	public static void tampilkanData(formatBiodata biodataMahasiswa[])
	{	//bagian menampilkan isi struktur Larik -----------------------------------------
		System.out.println("-----------------------------------------------------------");
		System.out.println("NAMA	ALAMAT	UMUR	JEKEL	HOBI1	HOBI2	HOBI3	IPK");
		System.out.println("-----------------------------------------------------------");
		for (int i=0; i<=N-1; i++)
		{
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
		System.out.println("-----------------------------------------------------------");
	}
	//-----------------------------------------------------
	//-------		      Program Utama		      ---------
	//-----------------------------------------------------
	public static void main(String[] args)
	{	//bagian deklarasi record berbasis LARIK -----------------------
		formatBiodata biodataMahasiswa[] = new formatBiodata[10];
		biodataMahasiswa[0] = new formatBiodata();
		biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[4] = new formatBiodata();
		ngentriData(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
		editData(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	}
}