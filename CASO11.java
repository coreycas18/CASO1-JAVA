import java.util.Scanner;

public class CASO11 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		
		System.out.print("Ingrese Nombre: ");
		String NAME = Mark1.nextLine();
		
		System.out.println("*RESULTADOS*");
		System.out.println("NOMBRE: " + NAME);
		System.out.println("NUMERO DE CARACTERES: " + NAME.length());


	}

}
