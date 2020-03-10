package step;

import cucumber.api.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ElementosPresentes {

    WebDriver driver;

    @Dado("^Abrir Navegador$")
    public void abrir_Navegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nicolas.Onufryjczuk\\Cucumber\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Dado("^Entrar a Google$")
    public void entrar_a_Google()  {
        driver.get("https://www.google.com.ar/?hl=es-419");
    }

    @Y("^Buscar text box de busqueda$")
    public boolean buscar_text_box_de_busqueda(){
        WebElement textBox = driver.findElement(By.name("q"));
        try { if (textBox.isDisplayed()) return true;
        } catch (NoSuchElementException e) { e.getMessage(); }
          return false;
    }

    @Y("^Buscar boton de busqueda$")
    public boolean buscar_boton_de_busqueda(){
        WebElement busqueda = driver.findElement(By.name("btnK"));
        try { if (busqueda.isDisplayed()) return true;
        } catch (NoSuchElementException e) { e.getMessage(); }
          return false;
    }

    @Y("^Buscar me siento con suerte$")
    public boolean buscar_me_siento_con_suerte() {
        WebElement suerte = driver.findElement(By.name("btnI"));
        try { if (suerte.isDisplayed()) return true;
        } catch (NoSuchElementException e) { e.getMessage(); }
          return false;
    }

    @Entonces("^Cerrar el navegador$")
    public void cerrar_el_navegador() { driver.close(); }
}
