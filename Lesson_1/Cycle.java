public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");

        int even = 6;
        while (even >= -6) {
            System.out.print(" " + even);
            even -= 2;
        }
        System.out.println(" ");

        int odd = 11;
        int summa = 0;
        do {
            if (odd % 2 != 0) {
                System.out.println("Число " + odd + " нечетное");
            } 
            summa += odd;
            odd += 2;
        } while (odd <= 20);
        System.out.println("11 + 13 + 15 + 17 + 19 = " + summa);
    }
}