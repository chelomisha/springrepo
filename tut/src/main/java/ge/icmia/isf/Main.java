package ge.icmia.isf;

import ge.icmia.isf.metadataconfig.AnnotationBasedConfig;
import ge.icmia.isf.metadataconfig.HelloWorldMessage;
import ge.icmia.isf.metadataconfig.MessageService;
import ge.icmia.isf.metadataconfig.XmlBasedConfig;

/**
 * Hello world!
 */

public class Main {
    public static void main(String[] args) {

//        AnnotationBasedConfig.runExample();
//        XmlBasedConfig.example();
        example();

    }

    private static void example() {
        MessageService messageService = new HelloWorldMessage();
        String message = messageService.getMessage();
        System.out.println(message);
    }
}
