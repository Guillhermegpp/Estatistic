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
	int n, k;
	double p, q;
	Model m = new Model();

	public Binomial() {
	};

	public void bmn(int n, int k, String p, String q) throws Exception {
		this.n = n;
		this.k = k;
		this.p = m.transforma(p);
		this.q = m.transforma(q);
	}

	public double P(int k) {
		double P;
		P = (m.fat(n) / (m.fat(k) * m.fat(n - k))) * Math.pow(p, k) * Math.pow(q, (n - k));
		return P;
	}

	public void get() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========> Estatastica Aplicada <===========\n" + "Distribuicao Binomial\n\n"
				+ "Numero total de provas: ");
		int n = sc.nextInt();
		System.out.println("Namero de vezes que se quer a ocorrencia do evento: ");
		int k = sc.nextInt();
		System.out.println("Probabilidade do sucesso: ");
		String p = sc.next();
		System.out.println("Probabilidade do fracasso: ");
		String q = sc.next();
		while (true) {
			System.out.printf("1 - X = %d\t2 - X <= %d\t3 - X >= %d\t4 - Sair\n", k, k, k);
			int resp = sc.nextInt();
			bmn(n, k, p, q);
			double result = 0;
			if (resp == 1) {
				result = P(k);
				System.out.printf("P(X = ");

			} else if (resp == 2) {
				result = somabin(k);
				System.out.printf("P(X <= ");
			} else if (resp == 3) {
				result = 1 - somabin(k);
				System.out.printf("P(X >= ");
			}
			else 
				break;
			System.out.printf("%d) = %.4f ou %.2f", k, result, result * 100);
			System.out.println("%");
		}
	}

	public double somabin(int ka) {
		if (ka < 0) {
			System.out.println("");
			return 0;
		} else {
			double soma = P(ka);
			System.out.printf("P(X = %d) = %.4f ", ka, soma);
			int kol = ka - 1;
			if (kol-- >= 0)
				System.out.printf("+ ");
			return soma + somabin(--ka);
		}
	}
}
