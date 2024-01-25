package src_OOPS_13JAN.AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop cop = new Cop( 10);
        System.out.println(cop.gun);
        cop.canIShoot();
    }
}
