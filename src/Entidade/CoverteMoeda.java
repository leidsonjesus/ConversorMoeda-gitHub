package Entidade;

public class CoverteMoeda {
	
	public static double IOF = 0.06;
	
	public static double Coverte(double vlrDolar, double qtdDolar) {
		return  vlrDolar * qtdDolar * (1.0 + IOF);
		
	}

}
