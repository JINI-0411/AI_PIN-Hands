package exam02;

public class UserIdValidationException extends RuntimeException { // Validation : 검증
    // Exception의 상위가 trow여서 던질 수 있음
    public UserIdValidationException(String message) {
        super(message);
    }
}
