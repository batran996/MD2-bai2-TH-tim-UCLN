import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("tim ước chiung lơn nhất nhé !");
        System.out.println("nhập vào số a ");
        a = scanner.nextInt();
        System.out.println("nhập vào số b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println(" không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                    System.out.println("a = " + a);
                } else {
                    b = b - a;
                    System.out.println("b = " + b);
                }
            }
            System.out.println("UCLN là " + a);
        }


    }
}