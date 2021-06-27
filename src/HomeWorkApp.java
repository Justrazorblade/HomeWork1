// 1 задание
public class HomeWorkApp {
    public static void main(String[] args) {
        // 6 задание
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // 2 задание
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 3 задание
    public static void checkSumSign() {
        int a = 9;
        int b = 4;
        int с = a + b;
        if (с >= 0) {
            System.out.println("Сумма положительная");
        }
        else if (с < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    // 4 задание
    public static void printColor(){
        int value = 78;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100){
            System.out.println("Жёлтый");
        }
        else if (value > 100){
            System.out.println("Зелёный");
        }
    }
    // 5 задание
    public static void compareNumbers(){
        int a = 3;
        int b = 11;
        if (a >= b){
            System.out.println("a >= b");
        }
        else if (a < b){
            System.out.println("a < b");
        }
    }

}