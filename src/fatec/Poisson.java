package fatec;

import java.util.Scanner;

public class Poisson {
	/*
	X = número de ocorrências
	e = base dos logaritmos naturais ~= 2,718
	λ = taxa média por unidade de tempo
	t = número de unidades de tempo ou de outra unidade
	μ = λt = média de ocorrências no intervalo t
	
	*/
	int x;
	double t, u,y;
	private Model m = new Model();
	
	public double calculo(int x) {
		double P;
		P = ((Math.pow(Math.E, -(y*t)) * Math.pow(y*t,x)) / (m.fat(x) ));
		
		return P;
	}
	public void poisson(int x, double y, String t) throws Exception {
		this.x = x;
		this.y = y;
		this.t = m.transforma(t);
	}
	
	public void get() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero de ocorr�ncias: ");
		int xx = sc.nextInt();
		System.out.println("Taxa media por unidade de tempo: ");
		double yy = sc.nextDouble();
		System.out.println("Numero de unidades de tempo ou de outra unidade: ");
		String tt = sc.next();
		poisson(xx,yy,tt);
		System.out.printf("P(X = %d) = %.4f or %.2f" ,x,calculo(xx), calculo(xx)*100);
		System.out.println("%");
	}

}
