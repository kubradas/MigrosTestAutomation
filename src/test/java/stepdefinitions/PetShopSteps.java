package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.PetShopPage;
import utilities.Driver;


public class PetShopSteps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    PetShopPage petShopPage = new PetShopPage(driver);

    @Given("Kullanıcı Migros ana sayfasına gider")
    public void kullanıcı_migros_ana_sayfasına_gider() {
        driver.get("https://www.migros.com.tr/");
    }

    @When("Kullanıcı Pet Shop kategorisini seçer")
    public void kullanıcı_pet_shop_kategorisini_seçer() {
        homePage.selectPetShopCategory();
    }

    @Then("Pet Shop sayfasının açıldığını doğrular")
    public void pet_shop_sayfasının_açıldığını_doğrular() {
        Assert.assertTrue(petShopPage.isPetShopPageDisplayed());
    }

    @When("Kullanıcı ürünleri düşük fiyata göre sıralar")
    public void kullanıcı_ürünleri_düşük_fiyata_göre_sıralar() {
        petShopPage.sortByLowToHigh();
    }

    @Then("Kullanıcı fiyatları çeker ve düşükten yükseğe sıralandığını doğrular")
    public void ürünlerin_düşük_fiyata_göre_sıralandığını_doğrular() {
        Assert.assertTrue(petShopPage.isPriceSorted());
    }
}
