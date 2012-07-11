/**
   This program computes the volume (in liters) of a six-pack of soda cans.
 */
package th.ac.nu.student.u54347750.compro.ch02;

public class Volume1
{
    public static void main(String[] args) 
    {
        int cansPerPack = 6;
        double canVolume = 0.355; // Liters in a 12-ounce can
        
        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(cansPerPack * canVolume);
        System.out.println(" liters.");
        
    }
}
