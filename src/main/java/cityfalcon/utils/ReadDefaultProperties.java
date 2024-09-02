package cityfalcon.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadDefaultProperties {

//    protected static Properties props;
//    private static InputStream input;
//
//
//    private static  String propertiesPath = "propertyfiles/default.properties";
//    //src/test/resources/propertyfiles/
//
//    static{
//
//        props = readPropertiesFiles();
//
//
//
//    }
//    public static String getPropertyValue(String key){
//       return props.getProperty(key);
//    }
//
//    private static  Properties  readPropertiesFiles(){
//   props = new Properties();
//     // input = ReadDefaultProperties.class.getClassLoader().getResourceAsStream(propertiesPath);
//     //   BufferedReader reader;
//
//
//        try {
//            //new FileInputStream(propertiesPath);
//
//
//
//
//
//
//          input = ResourceLoader.getResource();
//
//            props.load(input);
//        }catch(Exception e){
//            throw new RuntimeException("The properties path was not found");
//        }
//        System.out.println(props.getProperty("url"));
//        return props;
//    }
private static Properties properties;
    private static Map<String, String> configParam = new HashMap<>();

    private static String configPath = "/home/ibrahim/workspace/ReactDesktopWebApp/target/docker-resources/propertyfiles/default.properties";

   // private  String config = getClass().getClassLoader().getResourcesAsStream(configPath);


    static{

            try {
                properties = readProperties();


                for (Map.Entry prop : properties.entrySet()) {
                    if (System.getProperties().stringPropertyNames().contains(prop.getKey().toString())) {
                        properties.setProperty(prop.getKey().toString(), System.getProperty(prop.getKey().toString()));
                    }

                }
                properties.entrySet().forEach(
                        entry -> configParam.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()));


            } catch (Exception e) {
                throw new RuntimeException("The file is not found");

            }

    }

//    public ReadDefaultProperties() throws IOException {
//    }


    public static String getPropertyValue(String key){
        String value = null;
        if( Objects.nonNull(configParam.get(key))){

            value = configParam.get(key);
            System.out.println(value);
        }else{
            throw new RuntimeException("The value of the " + key + " does not exit in the configparams file");
        }
        return value;
    }
    private static Properties readProperties()  {
        Properties properties = new Properties();


        try (InputStream input = new FileInputStream(configPath)){
            properties.load(input);
        }catch(Exception e){
            throw new RuntimeException("Unable to read the property file " + configPath );
            //  log.error("Unable to read the property file {}", DEFAULT_PROPERTIES, e);
        }
        return properties;
    }

}
