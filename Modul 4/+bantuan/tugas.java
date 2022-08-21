import java.util.Scanner;
class formatBiodata{
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}

public class tugas{
	public static int N=5;
	public static boolean hasil = false;
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
			System.out.print("Silakan masukkan Jenis Kelamin anda (L / P) : ");
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
	public static void mencariData(formatBiodata biodataMahasiswa[]){
		System.out.println("-------------------------------------------------------");
		System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
		System.out.println("-------------------------------------------------------");
		for(int j = 0; j <= N-1; j++){
			tampilkanData(biodataMahasiswa, j);
		}
		System.out.println("-------------------------------------------------------");

		Scanner input = new Scanner(System.in);
		System.out.print("\nMasukkan nama yang ingin anda hapus datanya : ");
		String nHapus = input.next();

		for (int i=0; i <= N-1; i++){
			if (biodataMahasiswa[i].nama.equalsIgnoreCase(nHapus)){
				hasil = true;
				hapusData(biodataMahasiswa, i, nHapus);
				System.out.println("\n-------------------------------------------------------");
				System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
				System.out.println("-------------------------------------------------------");
				for(int j = 0; j <= N-1; j++){
					tampilkanData(biodataMahasiswa, j);
				}
				System.out.println("-------------------------------------------------------");
			}
		}
		if(hasil != true){
			System.out.println("\nMaaf, data yang anda cari tidak ditemukan maka tidak dilakukan penghapusan");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
			System.out.println("-------------------------------------------------------");
			for(int j = 0; j <= N-1; j++){
				tampilkanData(biodataMahasiswa, j);
			}
			System.out.println("-------------------------------------------------------");
		}
	}

	public static void hapusData(formatBiodata biodataMahasiswa[], int x, String dNama){ // fungsi hapus data di tengah
		for (int i=x; i<= N-2; i++){
			biodataMahasiswa[i] = biodataMahasiswa[i+1];
		}
		System.out.println("\nData ditemukan pada larik "+x+", hapus data dengan nama " + dNama + " selesai.");
		N--;
	}

	public static void tampilkanData(formatBiodata biodataMahasiswa[], int i){
		System.out.print (i +". ");
		System.out.print (biodataMahasiswa[i].nama + "\t");
		System.out.print (biodataMahasiswa[i].alamat + "\t");
		System.out.print (biodataMahasiswa[i].umur + "\t");
		System.out.print (biodataMahasiswa[i].jekel + "\t");
		System.out.print (biodataMahasiswa[i].hobi[0] + "\t");
		System.out.print (biodataMahasiswa[i].hobi[1] + "\t");
		System.out.print (biodataMahasiswa[i].hobi[2] + "\t");
		System.out.println(biodataMahasiswa[i].ipk);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah data : ");
		N = input.nextInt();

		formatBiodata biodataMahasiswa[] = new formatBiodata[N];
		for(int i = 0; i <= N-1; i++){
			biodataMahasiswa[i] = new formatBiodata();
		}

		ngentriData(biodataMahasiswa);
		mencariData(biodataMahasiswa);
	}
}