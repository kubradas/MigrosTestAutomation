package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");

            if ("chrome".equalsIgnoreCase(browser)) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");

                driver = new ChromeDriver(options);
            } else if ("firefox".equalsIgnoreCase(browser)) {

                FirefoxOptions options = new FirefoxOptions();

                driver = new FirefoxDriver(options);
                driver.manage().window().maximize();

            } else {
                throw new RuntimeException("Geçersiz tarayıcı: " + browser);
            }
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;   // WebDriver referansını null yaparak yeniden başlatılmasını engelle
            System.out.println("Tarayıcı kapatıldı.");
        } else {
            System.out.println("Driver zaten null.");
        }
    }
} 
