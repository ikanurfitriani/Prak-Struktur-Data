import java.util.Scanner;
class formatBiodata{
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}

public class praktik4_2{
	public static int N;
	public static formatBiodata biodataMahasiswaBaru = new formatBiodata();
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
	//------------------------------------------------------
	//--- Fungsi untuk Mengurutkan Data (Selection) (Descending) ---
	//------------------------------------------------------
	public static void mengurutkanDataSelectionDescending(formatBiodata biodataMahasiswa[]){
		formatBiodata biodataSementara = new formatBiodata();
		String teksTerkecil = "";
		int lokasi=0;
		//bagian mengurutkan dengan teknik selection
		for (int i=0; i<=N-2; i++){
			//data pertama yang dibaca dianggap data terkecil
			teksTerkecil = "AAAAAA";
			//menentukan bilangan terkecil mulai larik ke i+1 sampai N-1
			for (int S=i+1; S<=N-1; S++){
				if (biodataMahasiswa[S].nama.compareTo(teksTerkecil)>0){
				//jika data[S] adlh bilangan terbesar, simpan di
					teksTerkecil = biodataMahasiswa[S].nama;
					//mencatat posisi dimana data terbesar ada
					lokasi = S;
				}
			}
			//membandingkan data[lokasi] yang adalah data terkecil,
			// versus data[i] yang adalah ‘diagonal ke-i'
			if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[lokasi].nama)<0){
				//tukar posisi
				{ biodataSementara = biodataMahasiswa[i];
					biodataMahasiswa[i] = biodataMahasiswa[lokasi];
					biodataMahasiswa[lokasi] = biodataSementara;
				}
			}
		}
	}
	//--------------------------------------------------
	//--- Fungsi untuk Menampilkan Data ---
	//--------------------------------------------------
	public static void tampilkanData(formatBiodata biodataMahasiswa[]){
		System.out.println("-------------------------------------------------------");
		System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
		System.out.println("-------------------------------------------------------");
		for (int i=0; i<=N-1; i++){
			System.out.print (i +".");
			System.out.print (biodataMahasiswa[i].nama + "\t");
			System.out.print (biodataMahasiswa[i].alamat + "\t");
			System.out.print (biodataMahasiswa[i].umur + "\t");
			System.out.print (biodataMahasiswa[i].jekel + "\t");
			System.out.print (biodataMahasiswa[i].hobi[0] + "\t");
			System.out.print (biodataMahasiswa[i].hobi[1] + "\t");
			System.out.print (biodataMahasiswa[i].hobi[2] + "\t");
			System.out.println(biodataMahasiswa[i].ipk);
		}
		System.out.println("-------------------------------------------------------");
	}
	//--------------------------------------------------
	//--- Program Utama ---
	//--------------------------------------------------
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah data : ");
		N = input.nextInt();
		formatBiodata biodataMahasiswa[] = new formatBiodata[N];
		for(int i = 0; i <= N-1; i++){
			biodataMahasiswa[i] = new formatBiodata();
		}
		ngentriData(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
		mengurutkanDataSelectionDescending(biodataMahasiswa);
		tampilkanData(biodataMahasiswa);
	}
}
