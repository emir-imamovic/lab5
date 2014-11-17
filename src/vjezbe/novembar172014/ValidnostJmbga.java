package vjezbe.novembar172014;

import java.util.Scanner;

public class ValidnostJmbga {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("unesi JMBG: ");

		String jmbg;
		int ostatak;
		jmbg = in.nextLine();
		String prvi = jmbg.substring(0, 1);
		int prvo = Integer.parseInt(prvi);
		String drugi = jmbg.substring(1, 2);
		int drugo = Integer.parseInt(drugi);
		String treci = jmbg.substring(2, 3);
		int trece = Integer.parseInt(treci);
		String cetvrti = jmbg.substring(3, 4);
		int cetvrto = Integer.parseInt(cetvrti);
		String peti = jmbg.substring(4, 5);
		int peto = Integer.parseInt(peti);
		String sesti = jmbg.substring(5, 6);
		int sesto = Integer.parseInt(sesti);
		String sedmi = jmbg.substring(6, 7);
		int sedmo = Integer.parseInt(sedmi);
		String osmi = jmbg.substring(7, 8);
		int osmo = Integer.parseInt(osmi);
		String deveti = jmbg.substring(8, 9);
		int deveto = Integer.parseInt(deveti);
		String deseti = jmbg.substring(9, 10);
		int deseto = Integer.parseInt(deseti);
		String jedanaesti = jmbg.substring(10, 11);
		int jedanaesto = Integer.parseInt(jedanaesti);
		String dvanaesti = jmbg.substring(11, 12);
		int dvanaesto = Integer.parseInt(dvanaesti);
		String trinaesti = jmbg.substring(12, 13);
		int trinaesto = Integer.parseInt(trinaesti);
		int formula = prvo * 7 + drugo * 6 + trece * 5 + cetvrto * 4 + peto * 3
				+ sesto * 2 + sedmo * 7 + osmo * 6 + deveto * 5 + deseto * 4
				+ jedanaesto * 3 + dvanaesto * 2;
		ostatak = formula/11;
	
			if(((ostatak==0)&&(trinaesto==0))||(ostatak+trinaesto==11)) 
		
		{System.out.print("JMBG je ispravan!!!");}

		else {System.out.print("JMBG je neispravan!!!");}
		}
	}
		
	
	
