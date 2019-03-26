package Login;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login_Invalid {
    private WebDriver driver;
    private By username = By.usernmae("app-product-item");
    private By productName = By.xpath("//span[@itemprop='name']");

    public ProductCanvas(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProduct() {
        return driver.findElement(product);
    }

    public WebElement getProductName() {
        return driver.findElement(productName);
    }

    public List<WebElement> getProductNames() {
        return driver.findElements(productName);   
    }


}

