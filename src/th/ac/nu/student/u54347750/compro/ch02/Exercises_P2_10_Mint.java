package th.ac.nu.student.u54347750.compro.ch02;

import java.util.Scanner; 

public class Exercises_P2_10_Mint {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Price : ");
        
        double price = in.nextDouble();//การรับค่าเงินอาจมีเศษสตางค์จึงใช้ชนิดของข้อมูลเป็น double        
        int price1 = (int)(price*100);//เปลี่ยนชนิดของตัวแปลจาก double เป็น int        
        System.out.println(price1);
        
         int dollar = price1 / 100;        
         int cent = price1 - (dollar * 100);        
         System.out.println("a price "+price+" yields value "+dollar+" dollars and "+cent+" cents");   
    }
    }

