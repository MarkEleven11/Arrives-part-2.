import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }


        ///Task 1.
        System.out.println("Task 1");
        int sum = 0;
        for (int element : arr)
            sum += element;
        System.out.println("Сумма трат за месяц составила " + sum);


            ///Task 2.
            System.out.println("Task 2");
        int max = arr[0];
        for (int value : arr) {
            if (max < value)
                max = value;
        }
            System.out.println("Максимальная сумма " + max);

        int min = arr[0];
        for (int j : arr) {
            if (min > j)
                min = j;
        }
            System.out.println("Минимальная сумма " + min);


            ///Task 3.
            System.out.println("Task 3");
        float mid = 0f;
        for (int j : arr) {
            mid += j / arr.length;
        }
            System.out.println("Средняя сумма затрат за месяц составила " + mid + " рублей.");

            ///Task 4.
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }







    }
}

