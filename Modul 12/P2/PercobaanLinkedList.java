import java.util.LinkedList;
public class PercobaanLinkedList
{
	LinkedList daftarMhs = new LinkedList();

	PercobaanLinkedList()
	{
		if (daftarMhs.isEmpty()==true)
		{
			System.out.println("Linkedlist kosong");
		}
		else
		{
			System.out.println("Linkedlist isi");
		}
		daftarMhs.add("Agungbp");
		daftarMhs.add("Bambang");
		if (daftarMhs.isEmpty()==true){
			System.out.println("Linkedlist kosong");
		} else {
			System.out.println("Linkedlist isi");
		}
	}

	public static void main(String args[])
	{
		new PercobaanLinkedList();
	}
}