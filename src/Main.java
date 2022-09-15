import javax.swing.text.html.ImageView;

public class Main {
    public static void main(String[] args) {

        generateRandomArray();
        task1();
        task2();
        task3();
        task4();

    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {

        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {

        int minNumber = arr[0];
        int maxNumber = arr[0];

        for (int j : arr) {
            if (minNumber > j) {
                minNumber = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNumber + " рублей.");

        for (int j : arr) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxNumber + " рублей.");
    }
    public static void task3() {

         double averageNumber = 0;

        for (int j : arr) {
            averageNumber += j / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageNumber + " рублей.");
    }
    public static void task4() {

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 10; i < reverseFullName.length && i >= 0; i--) {
            char tmp = reverseFullName[i];
            System.out.print(tmp);
        }



    }
}