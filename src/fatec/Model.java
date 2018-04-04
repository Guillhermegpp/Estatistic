package fatec;

public class Model {
	public int fat(int nro) {
		if (nro <= 1)
			return 1;
		else
			return nro * fat(--nro);
	}
	public double transforma(String str) throws Exception {
		String[] s = str.split("/");
		try{
			return Double.parseDouble(s[0])/Double.parseDouble(s[1]);
		}catch (Exception a){
			throw new Exception("Minimo 6");			
		}
	}
}
