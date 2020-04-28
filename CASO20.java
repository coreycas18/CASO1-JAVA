import java.util.Scanner;

public class CASO20 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		System.out.print("INGRESE VALOR DE VENTA:  ");
		float A = Mark.nextFloat();
		
		float Aumento = (float) (1.42 * A);
		System.out.println("EL RESULTADO DEL INCREMENTO ES:  "+ Aumento);
	
	
	
	}

}
