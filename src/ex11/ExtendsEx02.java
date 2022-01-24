
package ex11;

class 동물 {

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class ExtendsEx02 {
    // 오버라이딩=무효화하다->아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(사자 unit1, 호랑이 unit2) {
        // System.out.println(unit2.name + "가 공격당하고 있습니다.");
        // unit2.hp = unit2.hp - unit1.attack;
        // System.out.println(unit2.name + "의 hp : " + unit2.hp);
        // 변수는 위로 타고 올라가기 때문
    }

    public static void main(String[] args) {
        사자 lion = new 사자();
        호랑이 tiger = new 호랑이();
        곰 bear = new 곰();
        attack(lion, tiger);

    }
}
