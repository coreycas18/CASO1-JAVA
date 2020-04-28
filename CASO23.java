import java.util.Scanner;

public class CASO23 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		System.out.print("Ingrese Nombre Del Producto: ");
		String NAME = Mark.nextLine();
		
		System.out.println("INGRESE PRECIO:");
		int PRE = Mark.nextInt();
		System.out.println("INGRESE CANTIDAD:");
		int CAN = Mark.nextInt();
		
		float importe = PRE * CAN;
		double IGV = importe * 0.18;
		double Descuento = 0.03 * importe;
		double Total_Importe = importe + IGV - Descuento;
		
		
		System.out.println("El Importe es: " + importe);
		System.out.println("El IGV es: " + IGV);
		System.out.println("El Descuento es: " + Descuento);
		System.out.println("El importe total es: " + Total_Importe);
		
		
		
		

	}

}
