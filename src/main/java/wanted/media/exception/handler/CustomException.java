package wanted.media.exception.handler;

import lombok.Getter;
import wanted.media.exception.ErrorCode;

@Getter
public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;
    private String customMessage;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.customMessage = errorCode.getMessage();
    }
}
