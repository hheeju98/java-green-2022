package ex05;

public class ComparisonOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        // 논리연산자
        // &&그리고(AND)
        // ||거나(OR)
        // 논이연산은 둘다 boolean타입이어야 한다.
        System.out.println((x == 3) && (y == 7));
        System.out.println((x == 3) || (y == 4));

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x <= y);
    }

}
