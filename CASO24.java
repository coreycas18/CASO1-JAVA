import java.util.Scanner;

public class CASO24 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		System.out.println("INGRESE PRIMER NUMERO:");
		float NUM1 = Mark.nextInt();
		System.out.println("INGRESE SEGUNDO NUMERO:");
		float NUM2 = Mark.nextInt();
		System.out.println("INGRESE TERCER NUMERO:");
		float NUM3 = Mark.nextInt();
		
		float R1 = (float) ((NUM1 / 5) + 0.2 * NUM2);
		float R2 = (float) ((1.60 * NUM3) / 2);
		float R3 = (float) ((NUM1 + NUM2 + NUM3) * 0.92) ;
		
		System.out.println("EL RESULTADO ES: " + R1);
		System.out.println("El RESULTADO ES: "  + R2 );
		System.out.println("El RESULTADO ES : "  + R3 );
	
		
		
		
		

	}

}
