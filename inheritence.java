import java.util.Scanner;

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        // Do not close the Scanner here if you plan to reuse it
    }
}

class X extends A {
    int sum;

    void output() {
        sum = a + b;
        System.out.println("Sum value is: " + sum);
    }
}

public class inheritence extends X { // Make C the public class
    public static void main(String[] args) {
        X obj = new X(); // Corrected to use X directly since B is undefined
        obj.input();
        obj.output();
    }
}
