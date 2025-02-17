package UtilitiesClass;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadFiles {
    Properties properties;

    String path = "D:\\Luma_Project\\Configration\\Config.properties";

    public ReadFiles() {
        try {
            properties = new Properties();


            FileInputStream fis = new FileInputStream(path);

            properties.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    public String Getbaseurl() {
        String value = properties.getProperty("baseurl");
        if (value != null) {
            return value;
        } else
            throw new RuntimeException("url not Found");
    }

    public String Getbrowser() {
        String value = properties.getProperty("browser");
        if (value != null) {
            return value;
        } else
            throw new RuntimeException("url not Found");
    }

}



