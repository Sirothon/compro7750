package th.ac.nu.student.u54347750.compro.ch02;
import java.util.Scanner;

/**
   This program prints the price per liter for a six-pack of cans.
 */
 
public class Volume3 
{
    public static void main(String[] args) 
    {
        // Read price per pack
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the price for a six-pack: ");
        double packPrice = in.nextDouble();
        
        // Compute pack volume
        final double LITER_PER_OUNCE = 0.0296;
        final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
        final double PACK_VOLUME = 6 * CAN_VOLUME;
        
        // Compute and print price per liter
        
        double pricePerLiter = packPrice / PACK_VOLUME;
        
        System.out.printf("Price per liter: %8.2f", pricePerLiter);
        System.out.println();
        
    }
}
