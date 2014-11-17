package vjezbe.novembar172014;

public class Jmbg {
	public static void main(String[] args) {
		String maticniBroj = ("0306992193826");
		String danRodjenja = maticniBroj.substring(0, 2);
		String mjesecRodjenja = maticniBroj.substring(2, 4);
		String godinaRodjenja = maticniBroj.substring(4, 7);
		String politickaRegija = maticniBroj.substring(7, 9);
		String spol = maticniBroj.substring(9, 12);
		String zadnjiBroj= maticniBroj.substring(12, 13);
		System.out.println("maticni broj: " + maticniBroj);
		System.out.println("dan rodjenja: " + danRodjenja + ".");
		System.out.println("mjesec rodjenja: " + mjesecRodjenja + ".");
		System.out.println("godina rodjenja: " + godinaRodjenja + ".");
		System.out.println("spol: " + spol + ".");
		System.out.println(zadnjiBroj);
}
}