package cz.vsb.signum;

public class Signum2 {
	
	public int znamenko2(int cislo) {
		
		if (cislo<0) {
			return -1;
		}
		else if (cislo>0) {
			return 1;
		}
		else {
			return 0;
		}
		
		
		
	}
	
	public double znamenko2(String s) {
		double cislo = Double.parseDouble(s);
		
		if (cislo<0) {
			return -1;
		}
		else if (cislo>0) {
			return 1;
		}
		else {
			return 0;
		}
		
		
		
	}

}
