import java.util.Scanner;
class formatBiodata { //bagian deklarasi struktur record --------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
class Tugas1 {
	public static int N=10, pilih;
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
	//---	 Fungsi untuk Mengurutkan Data (Insertion)	---
	//------------------------------------------------------
	public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[])
	{
		formatBiodata biodataSementara = new formatBiodata();
		//untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
		int awal;
		//untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
		int cari;
		awal = 1;
		while (awal <=N-1)
		{
			biodataSementara = biodataMahasiswa[awal];
			cari = awal-1;
			//cari akan bergerak dari kanan (awal-1) ke kiri
			while ( cari >= 0)
			{
				//( biodataMahasiswa[cari].nama > biodataSementara.nama )
				if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama)>0)
				{
					biodataMahasiswa[cari+1] = biodataMahasiswa[cari];
					biodataMahasiswa[cari] = biodataSementara;
					cari--; //cari digeser kekiri 1 langkah
				}
				else {
					biodataMahasiswa[cari+1] = biodataSementara;
					// perintah ini untuk keluar dari loop while
					cari=-1;
				}
			}
			awal++;
		}
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
		int j = 0;
		Scanner masukan = new Scanner (System.in);
		formatBiodata biodataMahasiswa[]=new formatBiodata[N+1];
		for (int i = 0; i < (N+1); i++) {
			biodataMahasiswa[i] = new formatBiodata();
		}
		do {
			System.out.println("-------------MENU PILIHAN-------------");
			System.out.println("1. Insert\n2. View\n3. Sort\n4. Exit\n");
			System.out.print("Pilih : ");
			pilih = masukan.nextInt();
			if(pilih==1){
				System.out.print("Silakan masukan banyaknya data : ");
				N=masukan.nextInt();
				ngentriData(biodataMahasiswa);
			} else if (pilih==2){
				System.out.println("");
				System.out.println("------HASIL INSERT DATA------");
				tampilkanData(biodataMahasiswa);
				System.out.println("");
			} else if (pilih==3){
				System.out.println("");
				System.out.println("------HASIL INSERTIONSORT DATA------");
				mengurutkanDataInsertion(biodataMahasiswa);
				tampilkanData(biodataMahasiswa);
				System.out.println("");
				break;
			} else if (pilih==4){
				System.out.println("=======Program selesai=======");
			} else {
				System.out.println("Salah masukan pilihan!!!");
			}
		}while ( pilih != 4 );
	}
}