import java.util.Scanner;
import java.text.DecimalFormat;
public class CASO15 
{
	public static void main(String[] args) 
	{
		Scanner Mark1 = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Cantidad: ");
		float cantidad = Mark1.nextFloat();
		
		System.out.print("Ingrese precio: ");
		float precio = Mark1.nextFloat();
		
		float importe = cantidad * precio, DOLARES, EUROS;
		DOLARES =  (float) ((cantidad * precio) / 3.24); 
		EUROS	=	(float) ((cantidad * precio) / 3.75);
				
		System.out.println("*****************");
		System.out.println("***RESULTADOS***");
		System.out.println("*****************");
		System.out.println("IMPORTE: " + df.format(importe));
		System.out.println("EN DOLARES: " + df.format(DOLARES));
		System.out.println("EN DOLARES: " + df.format(EUROS));
		
		
		
		
		
	}

}
