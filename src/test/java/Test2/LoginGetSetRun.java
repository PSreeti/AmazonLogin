package Test2;

public class LoginGetSetRun extends login {
    public static void main(String[] args) {
        login l = new LoginGetSetRun();
        l.setUser("pjoshi@gmail.com");
        System.out.println(l.getUser());
        l.setPass("pjoshi");
        System.out.println(l.getPass());


    }



}
