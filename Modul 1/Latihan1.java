import java.util.Scanner;
public class Latihan1 {
	public static void main(String[] args) {
		Scanner masuk = new Scanner(System.in);
		String password;
		System.out.print("Silakan masukkan password anda : ");
		password = masuk.next();
		if (password.equals("AKAKOM")) {
			System.out.println("Password anda benar");
		} else {
			System.out.println("Password anda salah");
		}
	}
}