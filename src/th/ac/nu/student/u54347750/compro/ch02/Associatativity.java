package th.ac.nu.student.u54347750.compro.ch02;

public class Associatativity {

    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 1;
            System.out.println("x = " + x + ", y = " + y + ", z = " + z);
            System.out.println(32 % 7 % 3); // 1
            System.out.println((32 % 7) % 3); // 1
            System.out.println(32 % (7 % 3)); // 0

    }
}
