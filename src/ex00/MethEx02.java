package ex00;

class Calculator2 {
    // 투입구, 출구 다있는 메서드
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    // minus, multi, divide 생성
    static int minus(int a1, int a2) {
        return a2 - a1;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }

    static int divide(int a1, int a2) {
        return a2 / a1;
    }
}

public class MethEx02 {
    public static void main(String[] args) {
        int r1 = Calculator2.add(10, 20);
        System.out.println("r1 : " + r1);
        int r2 = Calculator2.minus(10, 20);
        System.out.println("r2 :" + r2);
        int r3 = Calculator2.multi(10, 20);
        System.out.println("r3 :" + r3);
        int r4 = Calculator2.divide(10, 20);
        System.out.println("r4 :" + r4);

    }
    // r2,r3,r4 출력

}
