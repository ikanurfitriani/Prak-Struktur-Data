import java.util.Vector;
import java.util.Enumeration;
class Tugas1_ArrayList {
	public static void main(String args[]) {
		Vector<String> nama = new Vector<String>();
		nama.add("Ika");
		nama.add("Suho");
		nama.addElement("Siwon");
		nama.addElement("Aleta");
		nama.addElement("Angi");
		Enumeration e = nama.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}