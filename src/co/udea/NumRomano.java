package co.udea;

public class NumRomano {
	
	private static final String Unidades[] = {"","I","II","III","IV","V","VI","VII","VIII","IV"};
	private static final String Decenas[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	private static final String Centenas[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	private static final String UMil[] = {"","M"};

	public String convertirARomano(int n) {
		String numRomano ="";
		
		int unid;
		int dec;
		int cen;
		int mil;
		
		String unidades, decenas, centenas, uMil;
		
		mil = n/1000;
		cen = (n%1000)/100;
		dec = (((n%1000)%100)/10);
		unid = (((n%1000)%100)%10);
		
		uMil = UMil[mil];
		centenas = Centenas[cen];
		decenas = Decenas[dec];
		unidades = Unidades[unid];
		
		numRomano = uMil+centenas+decenas+unidades;
		
		return numRomano;
	}

}
