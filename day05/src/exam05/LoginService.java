package exam05;

// 로그인 기능을 만들 것임
public class LoginService {

    private static LoginService instance = new LoginService();

    private LoginService() {
    }
    public  static LoginService getInstance(){
        return instance;
    }

    public void login(String userId, String password) {
        // 단일 책임 원칙

    }
}
