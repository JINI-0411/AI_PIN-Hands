package exam05;

public class Ex02 {
    public static void main(String[] args) {
//        LoginService s1 = new LoginService();
        LoginService s1 = LoginService.getInstance();
        LoginService s2 = LoginService.getInstance();

        System.out.println(s1 == s2);
    }
}
