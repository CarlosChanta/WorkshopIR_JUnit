package Tests_Promart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class TestSuite_SKU_No_Disponible {

    private WebDriver driver;
    By seccionNoDisp = By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[5]/div");

    @Before
    public void configurar(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verificarSKU_118300(){
        driver.get("https://www.promart.pe/horno-microondas-samsung-age83x-xpe/p");
        boolean mostrar= driver.findElement(seccionNoDisp).isDisplayed();
        assertTrue(mostrar);
    }

    @Test
    public void verificarSKU_108139(){
        driver.get("https://www.promart.pe/carrete-cable-tw-cu-80c-12awg-750v-azul/p");
        boolean mostrar= driver.findElement(seccionNoDisp).isDisplayed();
        assertTrue(mostrar);
    }

    @Test
    public void verificarSKU_108140(){
        driver.get("https://www.promart.pe/carrete-cable-tw-cu-80c-14awg-750v-azul/p");
        boolean mostrar= driver.findElement(seccionNoDisp).isDisplayed();
        assertTrue(mostrar);
    }

    @After
    public void cerrarDriver(){
        driver.quit();
    }

}
