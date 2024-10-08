package Circulo;

import java.text.DecimalFormat;

/**
 * 
 * @author ebarrero
 *
 */
public class CalcularAreaCirculo 
{

	public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

	
	public static void main(String[] args) 
	{
		// Area  =  π * radio*2
		 
	    double radio = 5;
        double area = areaCirculo(radio);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El area es : " + df.format(area));

	}

}
