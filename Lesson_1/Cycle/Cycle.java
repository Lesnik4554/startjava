public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println(" ");

        int a = 6;
        
        while (a >= -6) {
            System.out.println(a);
            a = a - 2;
        }
    }
}