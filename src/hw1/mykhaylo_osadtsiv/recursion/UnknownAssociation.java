package hw1.mykhaylo_osadtsiv.recursion;

public class UnknownAssociation {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("ninja1");
        Ninja ninja2 = new Ninja("ninja2");
        System.out.println(ninja1);
        System.out.println(ninja2);
        figth(ninja1, ninja2);
    }

    public static Ninja figth (Ninja ninja1, Ninja ninja2) {
        ninja1.setEnemy(ninja2);
        ninja2.setEnemy(ninja1);
        while (true) {
            ninja1.hit();
            if (ninja2.getCurHP() <=0 ) {
                System.out.println(ninja1.getName() + " is the winner");
                return ninja1;
            }
            System.out.println(ninja1.toString() + ninja2);
            ninja2.hit();
            if (ninja1.getCurHP() <=0 ) {
                System.out.println(ninja2.getName() + " is the winner");
                return ninja2;
            }
            System.out.println(ninja1.toString() + ninja2);
        }
    }
}
