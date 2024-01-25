package src_OOPS_13JAN.Encapsulation;

public class LAB148 {
    public static void main(String[] args) {
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin", "admin");

        boolean check = vwoLogin.isLoggedIn("admin","admin");
        System.out.println(check);
    }

}

class vwoLoginFixed {
    private String username;
    private String password;

    vwoLoginFixed(String u, String p) {
        this.password = p;
        this.username = u;
    }

    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("Logged IN!!");
            return true;
        } else {
            System.out.println("Wrong");
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
