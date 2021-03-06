package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자!
 * 신입이 실수하면 내책임 이니까!
 */
// abstract class 추상 클래스 =
// 1. new할 수 없다
// 2.추상 매서드를 만들 수 있다.(객체의 행위를 공통적으로 적용할 수 없을 때)
// 3. 일반 메서드도 만들 수 았다.(모든 구체적인 애들의 공통적인 것)
abstract class ProtossUnit {// 종족이름
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

// 1.일반 클래스는 추상 메서드를 가질 수 없다.
class Zealot extends ProtossUnit {// 근거리공격
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    // 상태변수 new할때 힙에 들어감 stack아님
    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    int getHp() {

        return hp;
    }

    @Override
    int getAttack() {

        return attack;
    }

}

class Dragoon extends ProtossUnit {// 원거리공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    int getHp() {

        return hp;
    }

    @Override
    int getAttack() {

        return attack;
    }
}

class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int attack = 50;
    int hp = 100;

    @Override
    void setHp(int hp) {

        this.hp = hp;

    }

    @Override
    int getHp() {
        return hp;

    }

    @Override
    int getAttack() {

        return attack;
    }
}
// 신입아 DarkTempler 하나 만들어!!
// name = 다크템플러
// attack=50
// 꼭 ProtossUnit으로 추상화 해야돼!!
// 테스트 =>다크템플러 질럿을 공격!!

public class ExtendsEx04 {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1.u1이 u2를 공격=> u2.hp=u2.hp-u1.attack=>자식변수 접근 안되군=>오버라이드하자

        u2.setHp(u2.getHp() - u1.getAttack());
        // 2.u2의 hp를출력 => sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        attack(z1, d1);
        ProtossUnit d2 = new DarkTempler();
        attack(d2, z1);

    }

}
