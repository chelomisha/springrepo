package ge.icmia.isf.metadataconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Misha on 3/22/2015.
 */
@Configuration
@ComponentScan
public class AnnotationBasedConfig {

    @Bean
    public MessageService helloWorldMessageService() {
        return new HelloWorldMessage();
    }

    public static void runExample() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);
        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}
