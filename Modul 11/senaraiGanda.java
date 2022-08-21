import java.util.Scanner;
class simpul
{
	//bagian deklarasi struktur record ----------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
	simpul kiri;
	simpul kanan;
}

class senaraiGanda
{
	public static simpul awal;
	public static simpul akhir;
	public static void inisialisasiSenaraiKosong()
	{
		awal = null;
		akhir = null;
	}
	public static void tambahDepan()
	{
		//------------bagian entri data dari keyboard--------------
		String NAMA;
		String ALAMAT;
		int UMUR;
		char JEKEL;
		String HOBI[] = new String[3];
		float IPK;
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		System.out.println("TAMBAH DEPAN : ");
		System.out.print("Silakan masukkan nama anda : ");
		NAMA = masukan.nextLine();
		System.out.print("Silakan masukkan alamat anda : ");
		ALAMAT = masukan.nextLine();
		System.out.print("Silakan masukkan umur anda : ");
		UMUR = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try
		{
			bacaTombol = System.in.read();
		}
			catch(java.io.IOException e)
		{
		}
		JEKEL = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		HOBI[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		HOBI[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		HOBI[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
		IPK = masukan.nextFloat();
		//------------bagian menciptakan & mengisi simpul baru--------------
		simpul baru;
		baru = new simpul();
		baru.nama = NAMA;
		baru.alamat = ALAMAT;
		baru.umur = UMUR;
		baru.jekel = JEKEL;
		baru.hobi[0] = HOBI[0];
		baru.hobi[1] = HOBI[1];
		baru.hobi[2] = HOBI[2];
		baru.ipk = IPK;
		//---------bagian mencangkokkan simpul baru ke dalam simpul lama------------
		if (awal == null) 	// jika senarai masih kosong
		{
			awal = baru;
			akhir = baru;
			baru.kiri = null;
			baru.kanan = null;
		}
		else 	// jika senarai tidak kosong
		{
			baru.kanan = awal;
			awal.kiri = baru;
			awal = baru;
			awal.kiri = null;
		}
	}
	public static void tambahBelakang()
	{
		//------------bagian entri data dari keyboard--------------
		String NAMA;
		String ALAMAT;
		int UMUR;
		char JEKEL;
		String HOBI[] = new String[3];
		float IPK;
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		System.out.println("TAMBAH BELAKANG : ");
		System.out.print("Silakan masukkan nama anda : ");
		NAMA = masukan.nextLine();
		System.out.print("Silakan masukkan alamat anda : ");
		ALAMAT = masukan.nextLine();
		System.out.print("Silakan masukkan umur anda : ");
		UMUR = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try
		{
			bacaTombol = System.in.read();
		}
			catch(java.io.IOException e)
		{
		}
		JEKEL = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		HOBI[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		HOBI[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		HOBI[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
		IPK = masukan.nextFloat();
		//------------bagian menciptakan & mengisi simpul baru--------------
		simpul baru;
		baru = new simpul();
		baru.nama = NAMA;
		baru.alamat = ALAMAT;
		baru.umur = UMUR;
		baru.jekel = JEKEL;
		baru.hobi[0] = HOBI[0];
		baru.hobi[1] = HOBI[1];
		baru.hobi[2] = HOBI[2];
		baru.ipk = IPK;
		//----------bagian mencangkokkan simpul baru ke dalam simpul lama----------
		if (awal == null) 	// jika senarai kosong
		{
			awal = baru;
			akhir = baru;
			baru.kiri = null;
			baru.kanan = null;
		}
		else 	// jika senarai tidak kosong
		{
			baru.kiri = akhir;
			akhir.kanan = baru;
			akhir = baru;
			baru.kanan = null;
		}
	}
	public static int hitungJumlahSimpul()
	{
		int N = 0;
		simpul bantu;
		bantu = awal;
		while (bantu!=null)
		{
			N++;
			bantu = bantu.kanan;
		}
		return(N);
	}
	public static void tambahTengah()
	{
		//---------------bagian menentukan lokasi target-------------
		Scanner masukan = new Scanner(System.in);
		System.out.print("Tentukan Lokasi Penambahan Data : ");
		int LOKASI = masukan.nextInt();
		int jumlahSimpulYangAda = hitungJumlahSimpul();
		if (LOKASI==1)
			System.out.println("Lakukan penambahan di depan");
		else if (LOKASI > jumlahSimpulYangAda)
			System.out.println("Lakukan penambahan di belakang");
		else
		{
			//----------------bagian entri data dari keyboard---------------
			String NAMA;
			String ALAMAT;
			int UMUR;
			char JEKEL;
			String HOBI[] = new String[3];
			float IPK;
			Scanner input = new Scanner(System.in);
			int bacaTombol=0;
			System.out.println("TAMBAH TENGAH : ");
			System.out.print("Silakan masukkan nama anda : ");
			NAMA = input.nextLine();
			System.out.print("Silakan masukkan alamat anda : ");
			ALAMAT = input.nextLine();
			System.out.print("Silakan masukkan umur anda : ");
			UMUR = input.nextInt();
			System.out.print("Silakan masukkan Jenis Kelamin anda : ");
			try
			{
				bacaTombol = System.in.read();
			}
			catch(java.io.IOException e)
			{
			}
			JEKEL = (char)bacaTombol;
			System.out.println("Silakan masukkan hobi (maks 3) : ");
			System.out.print("hobi ke-0 : ");
			HOBI[0] = input.next();
			System.out.print("hobi ke-1 : ");
			HOBI[1] = input.next();
			System.out.print("hobi ke-2 : ");
			HOBI[2] = input.next();
			System.out.print("Silakan masukkan IPK anda : ");
			IPK = input.nextFloat();
			//----------bagian menemukan posisi yang dikehendaki----------
			simpul bantu;
			bantu = awal;
			int i = 1;
			while ((i<LOKASI) && (bantu!=akhir))
			{
				bantu = bantu.kanan;
				i++;
			}
			//----------bagian menciptakan & mengisi simpul baru----------
			simpul baru = new simpul();
			baru.nama = NAMA;
			baru.alamat = ALAMAT;
			baru.umur = UMUR;
			baru.jekel = JEKEL;
			baru.hobi[0] = HOBI[0];
			baru.hobi[1] = HOBI[1];
			baru.hobi[2] = HOBI[2];
			baru.ipk = IPK;
			//--------bagian mencangkokkan simpul baru ke dalam linkedlist lama------
			baru.kiri = bantu.kiri;
			bantu.kiri.kanan = baru;
			baru.kanan = bantu;
			bantu.kiri = baru;
		}
	}
	public static void hapus(){
		if (awal == null){ // jika senarai masih kosong
			System.out.println("senarai kosong, menghapus tidak dapat dilakukan");
		}else{ // jika senarai tidak kosong
			Scanner masukan = new Scanner(System.in);
			System.out.print("Silakan masukkan nama yang ingin dihapus : ");
			String NAMACARI = masukan.nextLine();
			if (awal == akhir){ //jika hanya ada sebuah simpul
				if (awal.nama.equals(NAMACARI)){
					System.out.println("menghapus "+NAMACARI+" dilakukan..");
					inisialisasiSenaraiKosong();
				}else
					System.out.println("data " +NAMACARI+" tidak ditemukan");
				}
			else if (awal.nama.equals(NAMACARI)){//jika nama ditemukan di awal
				System.out.println("menghapus "+NAMACARI+" dilakukan..");
				awal = awal.kanan;
				awal.kiri = null;
			}else{
				simpul bantu;
				bantu = awal.kanan;
				while (bantu.nama.equals(NAMACARI)==false){
					bantu = bantu.kanan;
					if (bantu.kanan == null)
						break;
				}
				if ((bantu == akhir) && (akhir.nama.equals(NAMACARI)==false)){
					System.out.println("data " +NAMACARI+" tidak ditemukan");
				}else if (akhir.nama.equals(NAMACARI)){//jika nama ditemukan di akhir
					akhir = bantu.kiri;
					akhir.kanan = null;
				}else{
					System.out.println("menghapus "+NAMACARI+" dilakukan..");
					bantu.kanan.kiri = bantu.kiri;
					bantu.kiri.kanan = bantu.kanan;
				}
			}
		}
	}
	public static void cetakSenaraiMaju()
	{
		if (awal==null) 	// jika senarai masih kosong
		System.out.print("....MAAF SENARAI KOSONG....");
		else 	// jika senarai tidak kosong
		{
			System.out.println("---------------------------------------------------");
			System.out.println("NO 	NAMA 	ALAMAT 	UMUR 	JEKEL 	IPK ");
			System.out.println("---------------------------------------------------");
			simpul bantu;
			bantu = awal;
			while (bantu != null)
			{
				System.out.print (bantu.nama + "\t ");
				System.out.print (bantu.alamat + "\t ");
				System.out.print (bantu.umur + "\t ");
				System.out.print (bantu.jekel + "\t ");
				System.out.print (bantu.hobi[0] + "\t ");
				System.out.print (bantu.hobi[1] + "\t ");
				System.out.print (bantu.hobi[2] + "\t ");
				System.out.println(bantu.ipk);
				bantu = bantu.kanan;
			}
			System.out.println("---------------------------------------------------");
		}
	}
	public static void cetakSenaraiMundur()
	{
		if (awal==null) 	// jika senarai masih kosong
		System.out.print("....MAAF SENARAI KOSONG....");
		else 	// jika senarai tidak kosong
		{
			System.out.println("---------------------------------------------------");
			System.out.println("NO 	NAMA 	ALAMAT 	UMUR 	JEKEL 	IPK ");
			System.out.println("---------------------------------------------------");
			simpul bantu;
			bantu = akhir;
			while (bantu != null)
			{
				System.out.print (bantu.nama + "\t ");
				System.out.print (bantu.alamat + "\t ");
				System.out.print (bantu.umur + "\t ");
				System.out.print (bantu.jekel + "\t ");
				System.out.print (bantu.hobi[0] + "\t ");
				System.out.print (bantu.hobi[1] + "\t ");
				System.out.print (bantu.hobi[2] + "\t ");
				System.out.println(bantu.ipk);
				bantu = bantu.kiri;
			}
			System.out.println("---------------------------------------------------");
		}
	}
	public static void tukarNilai(simpul X, simpul Y) {
		simpul sementara = new simpul();
		sementara.nama = X.nama;
		sementara.alamat = X.alamat;
		sementara.umur = X.umur;
		sementara.jekel = X.jekel;
		sementara.ipk = X.ipk;
		X.nama = Y.nama;
		X.alamat = Y.alamat;
		X.umur = Y.umur;
		X.jekel = Y.jekel;
		X.ipk = Y.ipk;
		Y.nama = sementara.nama;
		Y.alamat = sementara.alamat;
		Y.umur = sementara.umur;
		Y.jekel = sementara.jekel;
		Y.ipk = sementara.ipk;
	}
	//---------------------------------------------
	// bisa untuk single LL dan double LL
	//---------------------------------------------
	public static void mengurutkanDataBubble_TeknikTukarNilai(){
		int N = hitungJumlahSimpul();
		simpul A=null;
		simpul B=null;
		simpul berhenti = akhir.kanan;
		System.out.println("Banyaknya simpul = " + hitungJumlahSimpul());
		for (int i=1; i<=hitungJumlahSimpul()-1; i++){
			A = awal;
			B = awal.kanan;
			int nomor = 1;
			while (B != berhenti){
				if (A.nama.compareTo(B.nama)>0){
					//tukarkan elemen dari simpul A dan elemen dari simpul B
					tukarNilai(A, B);
				}
				A = A.kanan;
				B = B.kanan;
				nomor++;
			}
			berhenti = A;
		}
		System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI===");
	}
	public static void mengurutkanDataBubble_TeknikTukarHeap()
	{
		int N = hitungJumlahSimpul();
		simpul bantu = awal;
		System.out.println("Banyaknya simpul = "+hitungJumlahSimpul());
		for (int i=1; i<=hitungJumlahSimpul(); i++)
		{
			//khusus menguji simpul pertama dgn sebelahnya
			if (awal.nama.compareTo(awal.kanan.nama)>0)
			{
				bantu = awal.kanan;
				awal.kanan = bantu.kanan;
				bantu.kanan.kiri = awal;
				bantu.kanan = awal;
				bantu.kiri = null;
				awal.kiri = bantu;
				awal = bantu;
			}
			//khusus menguji simpul kedua dgn sebelahnya, simpul ketiga dgn sebelahnya dst
			bantu = awal;
			while (bantu.kanan != akhir)
			{
				simpul A = bantu.kanan;
				simpul B = bantu.kanan.kanan;
				if (A.nama.compareTo(B.nama)>0)
				{
					//tukarkan simpul A dan simpul B
					A.kanan = B.kanan;
					if (B!=akhir) A.kanan.kiri = A;
					B.kanan.kiri = A;
					B.kanan = A;
					A.kiri = B;
					bantu.kanan = B;
					B.kiri = bantu;
					if (B==akhir) akhir = A;
				}
				bantu = bantu.kanan;
			}
			System.out.println("");
		}
		System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI===");
	}
	public static void cariLinear()
	{
		if (awal==null) //jika senarai masih kosong
			System.out.print("....MAAF SENARAI KOSONG....");
		else //jika senarai tidak kosong
		{
			Scanner masukan = new Scanner(System.in);
			System.out.print("Silakan masukkan nama yang anda cari : ");
			String NAMACARI = masukan.nextLine();
			boolean statusKetemu = false;
			int i = 0;
			int posisiKetemu=-1;
			simpul bantu;
			bantu = awal;
			while (bantu != null)
			{
				if (NAMACARI.equals(bantu.nama))
				{
					statusKetemu = true;
					posisiKetemu = i;
				}
				bantu = bantu.kanan;
				i++;
			}
			System.out.println("Status Ketemu = "+statusKetemu+" di posisi ke "+posisiKetemu);
		}
	}
	//---------bagian program utama-----------
	public static void main(String[] args)
	{
		inisialisasiSenaraiKosong();
		tambahDepan();
		tambahDepan();
		tambahBelakang();
		tambahBelakang();
		tambahTengah();
		cetakSenaraiMaju();
		cariLinear();
	}
}