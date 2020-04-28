 import java.util.Scanner;
 

public class CASO4 {

	public static void main(String[] args) {
		//INSTANCIA
		Scanner Mark1 = new Scanner(System.in);
		
		//definir las variables
		
		float NUM1 = 0;
		float NUM2 = 0;
		
		System.out.print("Primer Número: ");
		NUM1 = Mark1.nextFloat();
		
		System.out.print("Segundo Número: ");
		NUM2 = Mark1.nextFloat();
		
		float suma, resta, producto, division, resto;
		suma = NUM1 + NUM2;
		resta = NUM1 - NUM2;
		producto= NUM1 * NUM2;
		division = NUM1 / NUM2;
		resto = NUM1 % NUM2;
		
		System.out.println("****RESULTADOS****");
		System.out.println("SUMA: " + suma);
		System.out.println("RESTA: " + resta);
		System.out.println("PRODUCTO: " + producto);
		System.out.println("DIVISION: " + division);
		System.out.println("RESTO: " + resto);
		
	}

}
