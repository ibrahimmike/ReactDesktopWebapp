package cityfalcon.utils;

import java.io.InputStream;
import java.util.Properties;

public class ReadDefaultProperties {

    protected static Properties props;
    private static InputStream input;

    private static  String propertiesPath = "default.properties";

    static{

        props = readPropertiesFiles();



    }
    public static String getPropertyValue(String key){
       return props.getProperty(key);
    }

    private static  Properties  readPropertiesFiles(){
   props = new Properties();
      input = ReadDefaultProperties.class.getClassLoader().getResourceAsStream(propertiesPath);

        try {
            props.load(input);
        }catch(Exception e){
            throw new RuntimeException("The properties path was not found");
        }
        return props;
    }

}
