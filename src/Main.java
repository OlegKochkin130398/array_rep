public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int summ = 0;
        int arrayCash[] = generateRandomArray();
        for (int i = 0; i < arrayCash.length; i++) {
            summ = summ + arrayCash[i];
        }
        float medium;
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
        int min = 200_000;
        for (int i = 0; i < arrayCash.length; i++) {
            if (arrayCash[i] < min) {
                min = arrayCash[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        int max = -1;
        for (int i = 0; i < arrayCash.length; i++) {
            if (arrayCash[i] > max) {
                max = arrayCash[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        medium = summ / 30;
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");
    }
}
