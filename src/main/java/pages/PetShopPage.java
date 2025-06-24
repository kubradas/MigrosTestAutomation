package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PetShopPage {
    WebDriver driver;
    WebDriverWait wait;

    public PetShopPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@id='product-filter-desktop-title']")
    public WebElement petShopTitle;

    @FindBy(css = ".mat-mdc-select-value")
    public WebElement sortingDropdown;

    @FindBy(xpath = "//span[contains(.,'Önce En Düşük Fiyat')]")
    public WebElement lowToHighOption;

    @FindBy(xpath = "//sm-list-page-item//div[@class='price subtitle-1 ng-star-inserted']")
    public List<WebElement> productPrices;

    public boolean isPetShopPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(petShopTitle)).isDisplayed();
    }

    public void sortByLowToHigh() {
        sortingDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(lowToHighOption)).click();
    }


    public boolean isPriceSorted() {
        List<Double> actualPrices = productPrices.stream()
                .map(e -> e.getText().replace("TL", "").replace(",", ".").trim())
                .map(priceText -> {
                    try {
                        return Double.parseDouble(priceText);
                    } catch (NumberFormatException e) {
                        System.out.println("Fiyat format hatası: " + priceText);
                        return Double.NaN;
                    }
                })
                .filter(price -> !price.isNaN())
                .collect(Collectors.toList());

        List<Double> sortedPrices = actualPrices.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        Assert.assertEquals("Ürün fiyatları düşükten yükseğe sıralı değil!", sortedPrices, actualPrices);
        return sortedPrices.equals(actualPrices);
    }
}