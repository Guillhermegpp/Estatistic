package fatec;

import java.util.Scanner;

public class EMain {

	public static double transforma(String str) throws Exception {
		String[] s = str.split("/");
		try{
			return Double.parseDouble(s[0])/Double.parseDouble(s[1]);
		}catch (Exception a){
			throw new Exception("Minimo 6");			
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Binomial bnm = new Binomial();
		bnm.get();
	}

}
