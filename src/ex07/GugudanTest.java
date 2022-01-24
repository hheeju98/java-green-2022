package ex07;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int h1;
        int h2;

        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 시작");
        h1 = sc.nextInt();
        h2 = sc.nextInt();

        for (int step = h1; step <= h2; step++) {
            for (int a = 1; a <= 9; a++) {
                System.out.println(step + "*" + a + "=" + (step * a));
            }
            System.out.println("");

        }
    }
}