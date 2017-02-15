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

/*700.0 1000.0
45.0 18.0
127.5 84.375


Risttahuka pikkus on 5.0m, laius on 10.0m, kõrgus on 20.0m, ruumala on 1000.0 kuupmeetrit, pindala on 700.0 ruutmeetrit.
Risttahuka pikkus on 1.5m, laius on 4.0m, kõrgus on 3.0m, ruumala on 18.0 kuupmeetrit, pindala on 45.0 ruutmeetrit.
Risttahuka pikkus on 2.5m, laius on 7.5m, kõrgus on 4.5m, ruumala on 84.375 kuupmeetrit, pindala on 127.5 ruutmeetrit.
*/
