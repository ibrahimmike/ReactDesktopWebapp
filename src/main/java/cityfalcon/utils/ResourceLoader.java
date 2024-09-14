package cityfalcon.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class ResourceLoader {

    //private static final Logger loger = LoggerFactory.getLogger(ResourceLoader.class);

    public static InputStream getResource() {


        InputStream stream;
        try {
            System.out.println("Hello I am the first try on the resources " + "src/test/resources/propertyfiles/default.properties");
            stream = Files.newInputStream(Path.of("src/test/resources/propertyfiles/default.properties"));


        } catch (IOException e) {
            try {
                System.out.println("Hello I am the second try on the resources " + "propertyfiles/default.properties");
                stream = Files.newInputStream(Path.of("propertyfiles/default.properties"));

            } catch (IOException c) {
                throw new RuntimeException("Both the paths are not returning  the values of the configurations");


            }
        }
        if (Objects.isNull(stream)){
            System.out.println("Hello I am the stream was null ");
            throw new RuntimeException("Stream was not set to a value");
        }
        return stream;
    }







}
