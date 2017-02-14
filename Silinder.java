import java.util.Scanner;

public class Silinder{
	double r, h, p;
	public Silinder(double raadius, double k6rgus, double tihedus){
		if(raadius <= 0){throw new RuntimeException("Sobimatu pikkus");}
		if(k6rgus <= 0){throw new RuntimeException("Sobimatu pikkus");}
		if(tihedus <=0){throw new RuntimeException("Sobimatu pikkus");}
		r = raadius;
		h = k6rgus;
		p = tihedus;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sisesta silindri sisu tihedus(vesi=1, betoon=2.2, teras=7.8): ");
		p = input.nextDouble();
		if(tihedus != 1 && tihedus!= 2.2 && tihedus != 7.8){throw new RuntimeException("Sobimatu pikkus");}
		
	}
	
	public double ruumala(){
		return Math.PI*h*Math.pow(r, 2);
	}
	
	public double pindala(){
		return 2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h;
	}
	
	public double kylgpindala(){
		return 2*Math.PI*r*h;
	}
	
	public double mass(){
		return ruumala() * p;
	}

	public String toString(){
			return "Silindri ruumala on "+Math.round(ruumala())+" kuupsentimeetrit, pindala on "+
			Math.round(pindala())+" ruutsentimeetrit ja kylgpindala on "+Math.round(kylgpindala())+" ruutsentimeetrit ja kaalub "+Math.round(mass())+" kilogrammi.";	
	}
	
}