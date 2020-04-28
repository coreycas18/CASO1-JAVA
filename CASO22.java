import java.util.Scanner;

public class CASO22 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		System.out.print("Ingrese Nombre: ");
		String NAME = Mark.nextLine();
		
		System.out.println("INGRESE PRIMERA NOTA:");
		int N1 = Mark.nextInt();
		System.out.println("INGRESE SEGUNDA NOTA:");
		int N2 = Mark.nextInt();
		System.out.println("INGRESE TERCERA NOTA:");
		int N3 = Mark.nextInt();
		
		int PRO = (int) (N1 * 0.2 + N2 * 0.3 + N3 * 0.5);
		
		System.out.println("EL PROMEDIO TOTAL ES: "+ PRO);
		
		
	}

}
