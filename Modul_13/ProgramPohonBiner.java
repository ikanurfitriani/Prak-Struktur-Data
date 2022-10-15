class simpul {
	int elemen;
	simpul kiri;
	simpul kanan;
}
class pohon {
	public static simpul akar;
	void deklarasiPohon() {
		akar = null;
	}
	simpul tambahSimpul(simpul Penunjuk, int ELEMEN) {
		if (Penunjuk == null) {
			simpul baru = new simpul();
			baru.elemen = ELEMEN;
			baru.kiri = null;
			baru.kanan = null;
			Penunjuk = baru;
			return(Penunjuk);
		} else {
			if (ELEMEN < Penunjuk.elemen) {
				Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
				return(Penunjuk);
			} else {
				Penunjuk.kanan = tambahSimpul(Penunjuk.kanan, ELEMEN);
				return(Penunjuk);
			}
		}
	}
	void preOrder(simpul Penunjuk) {
		if (Penunjuk != null) {
			System.out.print(Penunjuk.elemen + ",");
			preOrder(Penunjuk.kiri);
			preOrder(Penunjuk.kanan);
		}
	}
	void inOrder(simpul Penunjuk) {
		if(Penunjuk != null) {
			inOrder(Penunjuk.kiri);
			System.out.print(Penunjuk.elemen + ",");
			inOrder(Penunjuk.kanan);
		}
	}
	void postOrder(simpul Penunjuk) {
		if(Penunjuk != null) {
			postOrder(Penunjuk.kiri);
			postOrder(Penunjuk.kanan);
			System.out.print(Penunjuk.elemen + ",");
		}
	}
}
class ProgramPohonBiner {
	public static void main(String[] args) {
		pohon x = new pohon();
		x.deklarasiPohon();
		x.akar = x.tambahSimpul(x.akar,10);
		x.akar = x.tambahSimpul(x.akar,19);
		x.akar = x.tambahSimpul(x.akar,31);
		x.akar = x.tambahSimpul(x.akar,5);
		x.akar = x.tambahSimpul(x.akar,1);
		x.akar = x.tambahSimpul(x.akar,28);
		x.akar = x.tambahSimpul(x.akar,17);
		x.akar = x.tambahSimpul(x.akar,29);
		x.akar = x.tambahSimpul(x.akar,3);
		x.akar = x.tambahSimpul(x.akar,13);
		x.akar = x.tambahSimpul(x.akar,20);
		x.akar = x.tambahSimpul(x.akar,4);
		x.akar = x.tambahSimpul(x.akar,15);
		x.akar = x.tambahSimpul(x.akar,8);
		x.akar = x.tambahSimpul(x.akar,23);
		x.akar = x.tambahSimpul(x.akar,11);
		System.out.print("PreOrder: ");
		x.preOrder(x.akar);
		System.out.println();
		System.out.print("InOrder: ");
		x.inOrder(x.akar);
		System.out.println();
		System.out.print("PostOrder: ");
		x.postOrder(x.akar);
		System.out.println();
	}
}