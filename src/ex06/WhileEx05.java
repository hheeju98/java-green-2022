package ex06;

public class WhileEx05 {
    public static void main(String[] args) {
        int n = 1;
        // 변수n을 이용해서 1부터 10까지 출력하시오.
        // 출력이 끝나면 break문으로 빠져나오시오.
        while (true) {
            if (n % 2 == 0) {
                System.out.println(n);
            }

            if (n > 10) {
                break;
            }

        }
    }

}
