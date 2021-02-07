package ma.cigma.pfe.module1.errorhandling;

import lombok.Getter;
import lombok.Setter;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -3377325407569060574L;

    public BusinessException(String message) {
        super(message);
    }
}
