/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n",func(i));
        iScanner.close();
    }

    public static int func(int a) {
        return (a * (a + 1)) / 2;
        }
}


 