package galdino.projetobasearquiteturamvp.domain;

/**
 * Created by galdino on 08/01/18.
 */

public class BaseClass {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccessful() {
        return message == null || message.isEmpty();
    }
}
