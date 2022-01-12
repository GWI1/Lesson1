import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void compareNumbers() {
        int a = 17;
        int b = 29;
        if (a >= b) {
            System.out.println("a>=b");
        } else System.out.println("a<b");
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign() {
        int a = 50;
        int b = -200;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 115;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }
}
