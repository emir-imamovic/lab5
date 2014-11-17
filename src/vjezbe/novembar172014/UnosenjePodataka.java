package vjezbe.novembar172014;
import java.util.Scanner;

public class UnosenjePodataka {
	public static void main(String[] args) {
		System.out.println("Unesi brojeve:");
		Scanner unos = new Scanner(System.in);
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		int zbir = broj1 + broj2;
		int razlika = broj1 - broj2;
		int proizvod = broj1 * broj2;
		int kolicnik = broj1 / broj2;
		int korijen = (int)(Math.sqrt(proizvod));
		System.out.println("Zbir je : " + zbir);
		System.out.println("Razlika je: " + razlika);
		System.out.println("Proizvod je: " + proizvod);
		System.out.println("Kolicnik je: " + kolicnik);
		System.out.println("Korijen je : " + korijen);
	}
}
