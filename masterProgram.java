import java.util.Scanner;
class formatBiodata { //bagian deklarasi struktur record --------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class masterProgram {
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
	//------------------------------------------------------
	//---	 Fungsi untuk	---
	//------------------------------------------------------

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

		tampilkanData(biodataMahasiswa);
	}
}