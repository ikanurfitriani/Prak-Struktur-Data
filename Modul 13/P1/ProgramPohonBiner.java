class simpul {
	String elemen;
	simpul kiri;
	simpul kanan;
}
class pohon {
	public static simpul akar;
	void deklarasiPohon() {
		akar = null;
	}
	simpul tambahSimpul(simpul Penunjuk, String ELEMEN) {
		if (Penunjuk == null) {
			simpul baru = new simpul();
			baru.elemen = ELEMEN;
			baru.kiri = null;
			baru.kanan = null;
			Penunjuk = baru;
			return(Penunjuk);
		} else {
			if (ELEMEN.compareTo(Penunjuk.elemen) < 0) {
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
		x.akar = x.tambahSimpul(x.akar,"M");
		x.akar = x.tambahSimpul(x.akar,"P");
		x.akar = x.tambahSimpul(x.akar,"D");
		x.akar = x.tambahSimpul(x.akar,"A");
		x.akar = x.tambahSimpul(x.akar,"S");
		x.akar = x.tambahSimpul(x.akar,"K");
		x.akar = x.tambahSimpul(x.akar,"N");
		x.akar = x.tambahSimpul(x.akar,"G");
		x.akar = x.tambahSimpul(x.akar,"O");
		x.akar = x.tambahSimpul(x.akar,"L");
		x.akar = x.tambahSimpul(x.akar,"W");
		x.akar = x.tambahSimpul(x.akar,"F");
		x.akar = x.tambahSimpul(x.akar,"J");
		x.akar = x.tambahSimpul(x.akar,"T");
		x.akar = x.tambahSimpul(x.akar,"H");
		x.akar = x.tambahSimpul(x.akar,"U");
		x.preOrder(x.akar);
	}
}