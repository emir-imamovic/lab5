package vjezbe.novembar172014;

public class MaticniBrojSaTackicama {
	public static void main(String[] args) {
		String maticniBroj = ("0306992193826");
		String danRodjenja = maticniBroj.substring(0, 2);
		String mjesecRodjenja = maticniBroj.substring(2, 4);
		String godinaRodjenja = maticniBroj.substring(4, 7);
		String politickaRegija = maticniBroj.substring(7, 9);
		String spol = maticniBroj.substring(9, 12);
		String zadnjiBroj= maticniBroj.substring(12, 13);
		System.out.println(danRodjenja + "." + maticniBroj.substring(2, 4) + "." + 
		maticniBroj.substring(4, 7) + "." + maticniBroj.substring(7, 9) + "." + 
				maticniBroj.substring(9, 12) + "." + 
		maticniBroj.substring(12, 13));
	}
}
