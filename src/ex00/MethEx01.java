package ex00;

//계산기
//상태와 행위는 꼭 필요한것은 아니다.
class Calculator {
    // add뒤에있는 ()는 입구
    // void는 출구가 없다.
    void add(int n1, int n2) {
        System.out.println("더하기 메서드 입니다.");
        System.out.println(n1 + n2);

    }
    // minus

    void minus(int n1, int n2) {
        System.out.println("마이너스 메서드 입니다.");
        System.out.println(n1 - n2);

    }

    // multi(곱하기)
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드 입니다.");
        System.out.println(n1 * n2);
    }

    // divide(나누기)
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드 입니다.");
        System.out.println(n1 / n2);
    }

}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 5);
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

    }

}
// 어떤 특정한 목적이나 기능을 시행하는 코드 꾸러미를 모둘이라 한다.
