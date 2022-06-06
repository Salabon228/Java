// import java.util.Scanner;
/**
 * Двумерный массив
 */
public class massiv {
    public static void main(String[] args) {

        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        } 
    }
}
/**
 * Получение данных из терминала
 */
// public class program {

//     public static void main(String[] args) {

//         Scanner iScanner = new Scanner(System.in);

//         System.out.printf("int a: ");

//         int x = iScanner.nextInt();

//         System.out.printf("double a: ");

//         double y = iScanner.nextDouble();

//         System.out.printf("%d + %f = %f", x, y, x + y);

//         iScanner.close();
//     }
// }

/**
 * Получени факториала
 */
// public class program {

//     public static void main(String[] args) {

//     System.out.println(factor(2));
//     }

//     static double factor(int n) {
//     if (n == 1)
//     return 1;
//     return n * factor(n - 1);
//     }
// }