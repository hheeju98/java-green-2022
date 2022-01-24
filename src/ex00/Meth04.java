package ex00;
//오버로딩 = over loading = 과적재

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "호랑이";
    int hp = 100;
    int attack = 50;
}

public class Meth04 {
    // 사자-> 호랑이 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "가 공격 당하고 있습니다.");
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이->사자 공격
    static void attackTigerToLion(사자 unit1, 호랑이 unit2) {
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 곰->호랑이 공격
    static void attackBearToTiger(호랑이 unit2, 곰 unit3) {
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "가 공격 당하고 있습니다.");
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰->사자 공격
    static void attackBearToLion(사자 unit1, 곰 unit3) {
        unit1.hp = unit1.hp - unit3.attack;
        System.out.println(unit1.name + "가 공격 당하고 있습니다.");
        System.out.println(unit1.name + "의 hp : " + unit1.hp);
    }

    // 호랑이->곰 공격
    static void attackTigerToBear(호랑이 unit2, 곰 unit3) {
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "가 공격 당하고 있습니다.");
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자->곰 공격
    // 낙타표기법 첫문자 소문자 class이름만 파스칼 첫글자 대문자
    static void attackLionToBear(사자 unit1, 곰 unit3) {
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "가 공격 당하고 있습니다.");
        System.out.println(unit3.name + "의 hp : " + unit3.hp);
    }

    // unit1,2가 heap공간 가르키고 있음
    public static void main(String[] args) {
        사자 u1 = new 사자();
        호랑이 u2 = new 호랑이();
        곰 u3 = new 곰();

        attackLionToTiger(u1, u2);
        attackTigerToLion(u1, u2);
        attackBearToTiger(u2, u3);
        attackBearToLion(u1, u3);
        attackTigerToBear(u2, u3);
        attackLionToBear(u1, u3);
        // 사자, 호랑이 타입만 넣어야 하기 때문

    }

}
