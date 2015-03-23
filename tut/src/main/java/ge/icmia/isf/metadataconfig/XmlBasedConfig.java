package ge.icmia.isf.metadataconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Misha on 3/23/2015.
 */
public class XmlBasedConfig {
    public static void example() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

        MessageService helloWorldMessage = (MessageService) context.getBean("message");

        String message = helloWorldMessage.getMessage();
        System.out.println(message);
    }
}
