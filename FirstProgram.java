
package firstprogram;


import java.util.Scanner;

public class FirstProgram {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        if (isPrime(num1) && isPrime(num2)) {
            int sum = num1 + num2;
            System.out.println("Ca hai so deu la so nguyen to. Tong = " + sum);
        } else {
            System.out.println("Mot hoac ca hai so khong phai la so nguyen to.");
        }

        scanner.close();
    }
}

