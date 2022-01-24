package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    // 디폴트 생성자=객체의 초기화를 위해 필요!!
    // constructor

    // ()person2스택에,,
    Person2(String d1, int d2, int d3) {
        name = d1;
        height = d2;
        weight = d3;
    }

}

public class OOPEx08 {
    public static void main(String[] args) {

        Person2 s1 = new Person2("홍길동", 170, 70);
        Person2 s2 = new Person2("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);
        // 생성자는 클래스 이름과 동일
        // void return값이 없다
        // 객체의 초기화 용도
        /// 디폴트 생성자는 내가 만들지않으면 자동 생성

    }

}
