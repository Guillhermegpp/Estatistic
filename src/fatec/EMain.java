package fatec;

import java.util.Scanner;

public class EMain {

	public static double transforma(String str) throws Exception {
		String[] s = str.split("/");
		try {
			return Double.parseDouble(s[0]) / Double.parseDouble(s[1]);
		} catch (Exception a) {
			throw new Exception("Erro");
		}
	}
	
	public static void intro() {
		System.out.println("==================================");
		System.out.println("======Estatistica Aplicada========");
		System.out.println("==================================");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		intro();
		while (true) {
			
			System.out.println("1- Binomial\t\t2- Poisson");
			int r = sc.nextInt();
			if (r == 1) {
				Binomial bnm = new Binomial();
				bnm.get();
			} else if (r == 2) {
				Poisson ps = new Poisson();
				ps.get();
			}
		}
	}

}
