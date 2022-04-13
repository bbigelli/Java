package entities;

public class Exchange {

	public static final double IOF = 0.06;

    	public static double converter(double dollar, double quantity){

        	double convertedValue = dollar * quantity;

        	return convertedValue += convertedValue * IOF;
    }
}