package Triangulo;

/**
 * 
 * @author ebarrero
 *
 */
public class CalcularAreaTriangulo 
{
	
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
	
	public static void main(String[] args) 
	{
		// area = ( Base * Altura ) / 2 
		
		 double base = 5;
	     double altura = 10;
	     double area = areaTriangulo(base, altura);
	     System.out.println("El area es : " + area);
	}

}
