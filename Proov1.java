public class Proov1{
	public static void main(String[] args){
		Risttahukas tahukas1=new Risttahukas(5, 10, 20);
		Risttahukas tahukas2=new Risttahukas(1.5, 4, 3);
		Risttahukas tahukas3=new Risttahukas(2.5, 7.5, 4.5);
		System.out.println(tahukas1.pindala()+" "+tahukas1.ruumala());
		System.out.println(tahukas2.pindala()+" "+tahukas2.ruumala());
		System.out.println(tahukas3.pindala()+" "+tahukas3.ruumala());
		System.out.println(tahukas1.toString());
		System.out.println(tahukas2.toString());
		System.out.println(tahukas3.toString());
	}
}