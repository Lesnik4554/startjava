public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");

        int chet = 6;
        while (chet >= -6) {
            System.out.print(" " + chet);
            chet -= 2;
        }
        System.out.println(" ");

        int nechet = 11;
        int summ = 0;
        do {
            summ = summ + nechet;
            if (nechet % 2 != 0) {
                System.out.println("Число " + nechet + " нечетное");
            } 
            nechet += 2;
        } while (nechet <= 20);
        System.out.println("11 + 13 + 15 + 17 + 19 = " + summ);
    }
}