package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean
        // 2. 문자열: 사이즈를 알 수 없다. 자료형이 아님!!
        String s1 = "안녕하세요";
        System.out.println(s1);
        String s2 = s1; // 주소가 저장된다.(string은 무조건4바이트이기 때문 "안녕하세요"못넣음)
        s2 = "바보";

        System.out.println(s1);
        System.out.println(s2);
    }

}
