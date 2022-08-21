import java.util.LinkedList;
public class Latihan1 {
	LinkedList list = new LinkedList();
	Latihan1() {
		list.add(new Integer(10));
		list.add(new Float(10.2f));
		list.add(new Long(10L));
		if (list.isEmpty()==true) {
			System.out.println("Linkedlist kosong");
		} else {
			System.out.println("Linkedlist isi");
			System.out.println("Integer : " + list.get(0));
			System.out.println("Float : " + list.get(1));
			System.out.println("Long : " + list.get(2));
		}
	}

	public static void main(String args[]) {
		new Latihan1();
	}
}