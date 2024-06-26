package exception.ex3;

public class NetworkClientExceptionV3 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV3(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}
