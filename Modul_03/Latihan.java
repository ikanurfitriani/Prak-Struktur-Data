import java.util.Scanner;
class formatBiodata{ //bagian deklarasi struktur record ----------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}

class Latihan{
	public static int N=5;
	public static formatBiodata biodataMahasiswaBaru = new formatBiodata();
	public static int T,J;
	//--------------------------------------------------
	//--- Fungsi untuk mengentri data ke dalam Larik ---
	//--------------------------------------------------
	public static void ngentriData(formatBiodata biodataMahasiswa[]){
		for(int i=0; i<= N-1; i++){
			Scanner masukan = new Scanner(System.in);
			int bacaTombol=0;
			System.out.print("Silakan masukkan nama anda : ");
			biodataMahasiswa[i].nama = masukan.next();
			System.out.print("Silakan masukkan alamat anda : ");
			biodataMahasiswa[i].alamat = masukan.next();
			System.out.print("Silakan masukkan umur anda : ");
			biodataMahasiswa[i].umur = masukan.nextInt();
			System.out.print("Silakan masukkan Jenis Kelamin anda : ");
			try{ bacaTombol = System.in.read(); }
			catch(java.io.IOException e){ }
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
			System.out.println();
		}
	}
	//--------------------------------------------------
	//--- 		  Fungsi untuk tukar data 		    ----
	//--------------------------------------------------
	public static void tukarData(){
		//bagian menentukan posisi target T ----------------------------------
		Scanner masukan = new Scanner(System.in);
		System.out.print("Posisi data yang ingin ditukar : ");
		J = masukan.nextInt();
		System.out.print("Dengan posisi data berapa? : ");
		T = masukan.nextInt();
	}
	//--------------------------------------------------
	//--- 		Fungsi untuk Menampilkan Data 		 ---
	//--------------------------------------------------
	public static void tampilkanData(formatBiodata biodataMahasiswa[]){
		//bagian menampilkan isi struktur Larik -------
		System.out.println("-------------------------------------------------------");
		System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
		System.out.println("-------------------------------------------------------" );
		for (int i=0; i<=N-1; i++){
			if(i == J){
				System.out.print(i + ".");
				System.out.print(biodataMahasiswa[T].nama + "\t");
				System.out.print(biodataMahasiswa[T].alamat + "\t");
				System.out.print(biodataMahasiswa[T].umur + "\t");
				System.out.print(biodataMahasiswa[T].jekel + "\t");
				System.out.print(biodataMahasiswa[T].hobi[0] + "\t");
				System.out.print(biodataMahasiswa[T].hobi[1] + "\t");
				System.out.print(biodataMahasiswa[T].hobi[2] + "\t");
				System.out.println(biodataMahasiswa[T].ipk);
			}
			else if(i == T){
				System.out.print(i +".");
				System.out.print(biodataMahasiswa[J].nama + "\t");
				System.out.print(biodataMahasiswa[J].alamat + "\t");
				System.out.print(biodataMahasiswa[J].umur + "\t");
				System.out.print(biodataMahasiswa[J].jekel + "\t");
				System.out.print(biodataMahasiswa[J].hobi[0] + "\t");
				System.out.print(biodataMahasiswa[J].hobi[1] + "\t");
				System.out.print(biodataMahasiswa[J].hobi[2] + "\t");
				System.out.println(biodataMahasiswa[J].ipk);
			}else{
				System.out.print(i +".");
				System.out.print(biodataMahasiswa[i].nama + "\t");
				System.out.print(biodataMahasiswa[i].alamat + "\t");
				System.out.print(biodataMahasiswa[i].umur + "\t");
				System.out.print(biodataMahasiswa[i].jekel + "\t");
				System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
				System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
				System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
				System.out.println(biodataMahasiswa[i].ipk);
			}
		}
		System.out.println("-------------------------------------------------------");
	}
	//--------------------------------------------------
	//-------           Program Utama            -------
	//--------------------------------------------------
	public static void main(String[] args){ //bagian deklarasi record berbasis LARIK -------
		formatBiodata biodataMahasiswa[] = new formatBiodata[10];
		biodataMahasiswa[0] = new formatBiodata();
		biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[4] = new formatBiodata();
		ngentriData(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
		tukarData(); //pemanggilan fungsi tukar data
		tampilkanData(biodataMahasiswa);
	}
}
