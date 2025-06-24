package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Test başlıyor...");
    }

    @After
    public void afterScenario() {
        System.out.println("Test başarıyla tamamlandı, tarayıcıyı kapatıyorum...");
        Driver.closeDriver();
    }
}