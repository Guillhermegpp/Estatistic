package fatec;

public class Poisson {
	/*
	X = número de ocorrências
	e = base dos logaritmos naturais ~= 2,718
	λ = taxa média por unidade de tempo
	t = número de unidades de tempo ou de outra unidade
	μ = λt = média de ocorrências no intervalo t
	
	*/
	int x,y;
	double t, u;
	
	public double P(int k) {
		Model f = new Model();
		double P;
		P = ( Math.pow(Math.E, y*t) / (f.fat(x) ));
		System.out.printf("P(X = %d) = %.4f ou %.2f" ,k,P, P*100);
		System.out.println("%");
		return P;
	}
	
}
