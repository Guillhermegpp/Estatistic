/**
 * 
 */
package fatec;

import java.util.Scanner;

/**
 * @author guilherme
 *
 */

public class Binomial {
	int n,k;
	double p,q;
	Model m = new Model();
	public Binomial() {};

	public void bmn(int n, int k, String p, String q) throws Exception {
		this.n = n;
		this.k = k;
		this.p = m.transforma(p);
		this.q = m.transforma(q);
		P(k);
	}

	
	
	public double P(int k) {
		double P;
		P = ( m.fat(n) / (m.fat(k) * m.fat(n-k)) ) * Math.pow(p, k) * Math.pow(q,(n-k));
		System.out.printf("P(X = %d) = %.4f ou %.2f" ,k,P, P*100);
		System.out.println("%");
		return P;
	}
	
	public void get() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========> Estatística Aplicada <===========\n"
				+ "Distribuição Binomial\n\n"
				+ "Número total de provas: ");
		int n = sc.nextInt();
		System.out.println("Número de vezes que se quer a ocorrência do evento: ");
		int k = sc.nextInt();
		System.out.println("Probabilidade do sucesso: ");
		String p = sc.next();
		System.out.println("Probabilidade do fracasso: ");
		String q = sc.next();
		Binomial bnm = new Binomial();
		bnm.bmn(n,k,p,q);
	}
	
	public double binomial() {
		
		
		
		return 0;
	}
}
