package step;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    WebDriver chrome;

    @Given("^Entro al navegador Chrome$")
    public void entro_al_navegador_Chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nicolas.Onufryjczuk\\Cucumber\\driver\\chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.get("https://www.google.com.ar/?hl=es-419");
        //throw new PendingException();
    }

    @And("^Ingreso a twitter$")
    public void ingreso_a_twitter() {
        chrome.findElement(By.name("q")).sendKeys("Twitter");
        chrome.findElement(By.name("btnK")).click();
        chrome.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
    }

    @And("^Voy a iniciar sesion$")
    public void voyAIniciarSesion() {
        Actions builder = new Actions(chrome);
        WebElement iniciarS = chrome.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/a[2]/div/span/span"));
        builder.moveToElement(iniciarS).click();
        builder.perform();
    }

    @Then("^Cierro el navegador$")
    public void cierro_el_navegador() throws Throwable {
        chrome.close();
    }
}
