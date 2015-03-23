package ge.icmia.isf.metadataconfig;

/**
 * Created by Misha on 3/22/2015.
 */
public class HelloWorldMessage implements MessageService {
    private String defaultMessage = "Hi world!";

    @Override
    public String getMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
