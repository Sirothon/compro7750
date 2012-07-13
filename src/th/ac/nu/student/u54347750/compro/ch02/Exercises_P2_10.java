
package th.ac.nu.student.u54347750.compro.ch02;
import java.util.Scanner;
public class Exercises_P2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Price: ");
        double price = in.nextDouble();//ค่าเงินมักจะกำหนดค่าเป็น double
        int priceX = (int)(price*100);//แปลงชนิดข้อมูลจาก double เป็น int        
        int dollar = priceX / 100;        
        int cent = priceX-(dollar * 100);        
        System.out.println("Yields Value: "+dollar+" dollars and "+cent+" cents");   
    }   
}
