package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

public class BaseSelenium {
    private WebDriver driver;
    private Alert alert;

    public BaseSelenium(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.builes.chavarria\\Desktop\\PruebaS\\RetoSofka\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public String obtenerAlerta() throws InterruptedException {
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        String mensajeAlerta = alert.getText();
        Thread.sleep(3000);
        return mensajeAlerta;

    }
    public void aceptarAlerta() {
        alert.accept();
    }


    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isVisible(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void visitWebsite(String url) {
        driver.get(url);

    }
}