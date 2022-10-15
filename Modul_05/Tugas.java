import java.util.Scanner;
class formatBiodata {
	String nama;
	int noMhs;
	int UTS, UAS;
}
class Tugas2 {
	public static int n = 1, pilih;
	public static void inData(formatBiodata biodataMahasiswa[]){
		Scanner masukan = new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("Masukkan Nama anda : ");
			biodataMahasiswa[i].nama = masukan.next();
			System.out.print("Masukkan No.Mhs anda : ");
			biodataMahasiswa[i].noMhs = masukan.nextInt();
			System.out.print("Masukkan Nilai UTS anda : ");
			biodataMahasiswa[i].UTS = masukan.nextInt();
			System.out.print("Masukkan Nilai UAS anda : ");
			biodataMahasiswa[i].UAS = masukan.nextInt();
			System.out.println();
		}
	}
	public static void tampilData(formatBiodata biodataMahasiswa[]){
		System.out.println("-----------------------------------------------------------");
		System.out.println("NAMA\tNIM\t\tNILAI UTS\tNILAI UAS");
		System.out.println("-----------------------------------------------------------");
		for(int i=0; i<=n-1; i++){
			System.out.print(biodataMahasiswa[i].nama + "\t");
			System.out.print(biodataMahasiswa[i].noMhs + "\t");
			System.out.print(biodataMahasiswa[i].UTS + "\t\t");
			System.out.println(biodataMahasiswa[i].UAS + "\t");
		}
	}
	public static void tambahData(formatBiodata biodataMahasiswa[]){
		formatBiodata biodataMahasiswaBaru = new formatBiodata();
		Scanner input = new Scanner(System.in);
		System.out.print(" ");
		System.out.print("Masukkan Nama anda : ");
		biodataMahasiswaBaru.nama = input.next();
		System.out.print("Masukkan No.Mhs anda : ");
		biodataMahasiswaBaru.noMhs = input.nextInt();
		System.out.print("Masukkan Nilai UTS anda : ");
		biodataMahasiswaBaru.UTS = input.nextInt();
		System.out.print("Masukkan Nilai UAS anda : ");
		biodataMahasiswaBaru.UAS = input.nextInt();
		n++;
		System.out.println("");
	}
	public static void main(String[] args) {
		int j = 0;
		Scanner in = new Scanner (System.in);
		formatBiodata biodataMahasiswa[]=new formatBiodata[n+1];
		for (int i = 0; i < (n+ 1); i++) {
			biodataMahasiswa[i] = new formatBiodata();
		}
		do {
			System.out.println("--------MENU PILIHAN------");
			System.out.println("1. Input\n2. View\n3. Exit\n");
			System.out.print("Pilih : ");
			pilih = in.nextInt();
			if(pilih==1){
				System.out.print("Silakan masukan banyaknya data : ");
				n=in.nextInt();
				inData(biodataMahasiswa);
			} else if (pilih==2){
				System.out.println("");
				System.out.println("------HASIL------");
				tampilData(biodataMahasiswa);
				System.out.println("-----------------");
				break;
			} else if (pilih==3){
				System.out.println("=======Program selesai=======");
			} else {
				System.out.println("Salah masukan pilihan!!!");
			}
		}while ( pilih != 3 );
	}
}