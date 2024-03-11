package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {

    public static Properties getPropertyObject() throws IOException {

        FileInputStream fp = new FileInputStream("Config/config.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }
    public static String getNumber() throws IOException {
        return getPropertyObject().getProperty("phoneNumber");
    }
    public static String getPassword() throws IOException {
        return getPropertyObject().getProperty("password");
    }

}
