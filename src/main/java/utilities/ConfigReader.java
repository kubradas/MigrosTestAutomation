package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            File file = new File("src/main/resources/config.properties");
            if (!file.exists()) {
                throw new RuntimeException("Config dosyası bulunamadı: " + file.getAbsolutePath());
            }

            FileInputStream fileInput = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInput);
            fileInput.close();
        } catch (Exception e) {
            throw new RuntimeException("Config dosyası okunamadı! Hata mesajı: " + e.getMessage());
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
