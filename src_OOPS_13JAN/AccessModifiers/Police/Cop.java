package src_OOPS_13JAN.AccessModifiers.Police;

public class Cop {
    public int gun;
    //modifier return type name_variable
    public Cop(int gun){
        this.gun =gun;
    }

    protected void canIShoot(){
        System.out.println("Of-course, Shoot");
    }
}
