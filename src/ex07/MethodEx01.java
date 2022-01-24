package ex07;

//자바는 모든코드가 class내부에
public class MethodEx01 {
    static void add(int n1) {
        System.out.println("받은숫자는 " + n1);
    }

    public static void main(String[] args) {
        MethodEx01.add(5000); // 메서드 호출

    }

}
