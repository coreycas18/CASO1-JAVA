import java.util.Scanner;

public class CASO21 {

	public static void main(String[] args) {
		Scanner Mark2 = new Scanner(System.in);
		
		System.out.print("INGRESE VALOR DE GASTO:  ");
		float D = Mark2.nextFloat();
		
		float Descuento = (float) (0.88 * D);
		System.out.println("EL RESULTADO DEL INCREMENTO ES:  "+ Descuento);
	
	}

}
