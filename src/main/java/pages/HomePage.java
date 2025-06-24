package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    //cookie
    @FindBy(id = "accept-all")
    public WebElement acceptCookie;

    //teslimat duyurusunu kapatmak için
    @FindBy(xpath = "//div[@class='title-close-btn-wrapper']/fa-icon[@class='ng-fa-icon']")
    public WebElement announcer;

    // Kategoriler sekmesi
    @FindBy(xpath = "//span[.='KATEGORİLER']")
    public WebElement kategorilerButton;

    // Pet Shop kategorisi
    @FindBy(xpath = "//a[contains(.,'Pet Shop')]")
    public WebElement petShopLink;

    public void selectPetShopCategory() {
        wait.until(ExpectedConditions.visibilityOf(acceptCookie));
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookie)).click();
        wait.until(ExpectedConditions.elementToBeClickable(announcer)).click();
        wait.until(ExpectedConditions.visibilityOf(kategorilerButton));
        actions.moveToElement(kategorilerButton).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String hoverScript = "var event = new MouseEvent('mouseover', {bubbles: true, cancelable: true}); arguments[0].dispatchEvent(event);";

        WebElement petShopMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Pet Shop')]")));
        js.executeScript(hoverScript, petShopMenu);
        js.executeScript("arguments[0].click();", petShopMenu);
        // Boş bir alana tıklayarak hover etkisini kaldır
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
    }
}
