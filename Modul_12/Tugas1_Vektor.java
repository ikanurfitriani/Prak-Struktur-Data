import java.util.ArrayList;
import java.util.Iterator;
class Tugas1_Vektor {
	public static void main(String args[]) {
		ArrayList<String> nama=new ArrayList<String>();
		nama.add("Ika");
		nama.add("Suho");
		nama.add("Siwon");
		nama.add("Aleta");
		nama.add("Angi");
		Iterator iterator = nama.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}