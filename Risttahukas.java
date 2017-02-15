public class Risttahukas{
	double a, b, c;
	public Risttahukas(double pikkus, double laius, double k6rgus){
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		if(k6rgus <=0){throw new RuntimeException("Sobimatu kõrgus");}
		a = pikkus;
		b = laius;
		c = k6rgus;
	}
	public double pindala(){
		return 2*(a*b + a*c + b*c);
	}

	public double ruumala(){
		return a*b*c;
	}
	public String toString(){
		return "Risttahuka pikkus on "+a+"m, laius on "+b+"m, kõrgus on "+c+"m, ruumala on "+
		       ruumala()+" kuupmeetrit, pindala on "+pindala()+" ruutmeetrit.";
	}
}