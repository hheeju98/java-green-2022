package ex07;

class Person7 {
    String name;
    int height;
    int weight;

    Person7(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.name = name;
    }
}

public class OOPEx10 {
    public static void main(String[] args) {
        Person7 person = new Person7("홍길동", 70, 180);
        System.out.println(person.name);
    }

}
