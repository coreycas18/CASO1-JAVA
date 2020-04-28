import java.util.Scanner;
public class CASO16 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		
		System.out.print("Ingrese Horas trabajadas: ");
		int H = Mark1.nextInt();
		System.out.print("Ingrese Tarifa de horas: ");
		float T = Mark1.nextFloat();
		
		float sueldo = H * T;
		double BONO = sueldo * 0.05;
		double total = (sueldo + BONO);
		double total_dolares = (total / 3.24);
		
		System.out.println("***RESULTADOS****");
		System.out.println("SUELDO:  "+ sueldo);
		System.out.println("BONO: "+ BONO);
		System.out.println("TOTAL: " + total);
		System.out.println("TOTAL EN DOLARES:  " + total_dolares);
		

	}

}
