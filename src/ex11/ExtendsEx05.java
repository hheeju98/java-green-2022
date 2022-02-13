package ex11;

abstract class ProtossUnit {
    abstract void setHp(int hp);

    abstract int getHp();

    abstract int getAttack();
}

class Zealot extends ProtossUnit {
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    void setHp(int hp) {
        this.hp = hp;

    }

    class Dragoon extends ProtossUnit {
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
        int hp = 100;
        int attack = 90;

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

}

public class ExtendsEx05 {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit dk1 = new DarkTempler();
        attack(z1, d1);
        attack(dk1, z1);
    }

}
