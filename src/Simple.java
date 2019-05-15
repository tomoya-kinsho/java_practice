class Weapon {
    int x;

    Weapon(int x) {
        this.x = x;
        System.out.println("クラスWeaponのコンストラクタを実行しました。");
    }

    public void fire() {
        System.out.println("fireeeeeeeeeee");
    }
}

class Gun extends Weapon {
    int y;

    Gun() {
        super(10);  // 明示的にWeaponのコンストラクタを指定しないといけない。
        y = 20;
        System.out.println("クラスGunのコンストラクタを実行しました。");
    }

    public void fight() {
        System.out.println("fightttttttttttt");
    }
}


public class Simple {
    public static void main(String[] args) {
        Weapon gun1 = new Gun();
        System.out.println(gun1.x);
        gun1.fire();
//        gun1.fight();  gun1の参照型は、WeaponなのでGunクラスのfightメソッドは参照することはできない。
//        System.out.println(gun1.y);　　また、Gunクラスのフィールドも参照することはできない。

        Gun gun2 = (Gun) gun1; // 参照型をキャストすると、Gunクラスのメソッド、フィールドを参照することができるようになる。
        System.out.println(gun2.x);
        System.out.println(gun2.y);
        gun2.fight();
    }
}
