package th.ac.nu.student.u54347750.compro.ch02;
import java.util.Scanner;
public class Exercises_P2_20 {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Number Month: ");
        int Month;
        Month = in.nextInt();//ลำดับของเดือนต้องใช้ int
        String name = "January February March April May June July August September October November December";
       
        String one = name.substring(0,7);
        String two = name.substring(8,16);
        String three = name.substring(17,22);
        String four = name.substring(23,28);
        String five = name.substring(29,32);
        String six = name.substring(33,37);
        String seven = name.substring(38,42);
        String eight = name.substring(43,49);
        String nine = name.substring(50,59);
        String ten = name.substring(60,67);
        String eleven = name.substring(68,76);
        String twelve = name.substring(77,85);
        
        if (Month==1)
            System.out.println(one);
        else{
            if (Month==2)
                System.out.println(two);
            else{
                if (Month==3)
                    System.out.println(three);
                else{
                    if (Month==4)
                        System.out.println(four);
                    else{
                        if (Month==5)
                            System.out.println(five);
                        else{
                            if (Month==6)
                                System.out.println(six);
                            else{
                                if (Month==7)
                                    System.out.println(seven);
                                else{
                                    if (Month==8)
                                        System.out.println(eight);
                                    else{
                                        if (Month==9)
                                            System.out.println(nine);
                                        else{
                                            if (Month==10)
                                                System.out.println(ten);
                                            else{
                                                if (Month==11)
                                                    System.out.print(eleven);
                                                else{
                                                    if (Month==12)
                                                        System.out.println(twelve);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}




