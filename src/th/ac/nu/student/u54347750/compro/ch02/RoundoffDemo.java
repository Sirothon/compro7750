package th.ac.nu.student.u54347750.compro.ch02;

public class RoundoffDemo {

    public static void main(String[] args) {
        double price = 4.35;
        int cents = (int) (100 * price); // Should be 100 * 4.35 = 435
        System.out.println(cents); // Prints 434!
    }
}
