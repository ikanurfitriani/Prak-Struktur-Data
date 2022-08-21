import java.util.Scanner;
public class Tugas1
{
	public static void main(String[] args)
	{
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		int n=5;
		String nama[] = new String[n];
		String alamat[] = new String[n];
		int umur[] = new int[n];
		char jekel[] = new char[n]; //jenis kelamin
		String hobi[][] = new String[n][3];
		float ipk[] = new float[n];
		for(int i=0; i<n;  i++) {
			System.out.print("Silakan masukkan nama anda : ");
			nama[i] = masukan.next();
			System.out.print("Silakan masukkan alamat anda : ");
			alamat[i] = masukan.next();
			System.out.print("Silakan masukkan umur anda : ");
			umur[i] = masukan.nextInt();
			System.out.print("Silakan masukkan Jenis Kelamin anda : ");
			try
			{
				bacaTombol = System.in.read();
			}
			catch(java.io.IOException e)
			{
			}
			jekel[i] = (char)bacaTombol;

			System.out.println("Silakan masukkan hobi (maks 3) : ");
			System.out.print("hobi ke-0 : "); hobi[i][0] = masukan.next();
			System.out.print("hobi ke-1 : "); hobi[i][1] = masukan.next();
			System.out.print("hobi ke-2 : "); hobi[i][2] = masukan.next();
			System.out.print("Silakan masukkan IPK anda : ");
			ipk[i] = masukan.nextFloat();
		}
		System.out.println("================================");
		System.out.println("NAMA	ALAMAT	UMUR	JEKEL	HOBI1	HOBI2	HOBI3	IPK");
		for(int i=0; i<n; i++) {
			System.out.println(nama[i]+"	"+alamat[i]+"	"+umur[i]+"	"+jekel[i]+
			"	"+hobi[i][0]+"	"+hobi[i][1]+"	"+hobi[i][2]+"	"+ipk[i]);
		}
	}
}