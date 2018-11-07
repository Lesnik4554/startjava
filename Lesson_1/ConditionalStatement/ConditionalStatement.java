public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 26;
        boolean male;
        boolean female;
        double growth = 1.83;
        char name = 'К';

        if (age > 20) {
            System.out.println("Мне 26 лет");
        }

        if (male = true) {
            System.out.println("Пол мужской");
        }

        if (female = true) {
            System.out.println("Пол женский");
        }

        if (growth < 1.80) {
            System.out.println("Больше 1.80");
        }
        else {
            System.out.println("Мой рост 1.83");
        }

        if (name == 'М') {
            System.out.println("Моё имя начинается не с буквы М");
        }
        else if (name == 'И') {
            System.out.println("Моё имя начинается не с буквы И");
        }
        else {
            System.out.println("Моё имя начинается с буквы К");
        }
    }
}