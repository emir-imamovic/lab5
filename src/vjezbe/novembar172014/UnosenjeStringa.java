package vjezbe.novembar172014;
import java.util.Scanner;
public class UnosenjeStringa {
public static void main(String[] args) {
	Scanner unosStringa = new Scanner(System.in);
	String stringic = unosStringa.nextLine();
	int brojZnakova = stringic.length();
	System.out.println( " Broj znakova u unosu je : " + brojZnakova);
}
}
