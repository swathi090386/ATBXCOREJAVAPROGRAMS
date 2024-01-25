package src_OOPS_13JAN.AccessModifiers.criminal;

import src_OOPS_13JAN.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop( 10);
        System.out.println(cop.gun);
        // cop.canIShoot();
    }
}

