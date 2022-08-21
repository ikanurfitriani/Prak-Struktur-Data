import java.util.Scanner;
class formatBiodata{
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}
public class latihan2{
	public static int N;
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
		Scanner input = new Scanner(System.in);
		System.out.println("1. Alamat\n2. Jenis Kelamin");
		System.out.print("Ingin mencari data dengan syarat yang mana ? (1 / 2) : ");
		int syarat = input.nextInt();

		if(syarat == 1){
			Scanner masukan = new Scanner(System.in);
			System.out.print("\nMasukkan alamat : ");
			String cariAlamat = masukan.next();
			System.out.println("\n-------------------------------------------------------");
			System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
			System.out.println("-------------------------------------------------------");

			for (int i=0; i <= N-1; i++){
				if (biodataMahasiswa[i].alamat.equalsIgnoreCase(cariAlamat)){
					hasil = true;
					tampilkanData(biodataMahasiswa, i);
				}
			}
			if(hasil != true){ System.out.println("Maaf, data yang anda cari tidak ditemukan"); }
			System.out.println("-------------------------------------------------------");

		}else if(syarat == 2){
			Scanner masukan = new Scanner(System.in);
			System.out.print("\nMasukkan jenis kelamin (L / P) : ");
			char cariJenkel = masukan.next().charAt(0);
			System.out.println("\n-------------------------------------------------------");
			System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
			System.out.println("-------------------------------------------------------");

			for (int i=0; i <= N-1; i++){
				if (biodataMahasiswa[i].jekel == cariJenkel){
					hasil = true;
					tampilkanData(biodataMahasiswa, i);
				}
			}
			if(hasil != true){ System.out.println("Maaf, data yang anda cari tidak ditemukan"); }
			System.out.println("-------------------------------------------------------");
		}else{
			System.out.println("Maaf, yang anda inputkan tidak ada");
		}
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
