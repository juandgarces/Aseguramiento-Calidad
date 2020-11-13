package co.com.devco.questions;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static co.com.devco.userinterfaces.PetbookHomePage.*;

import java.util.List;

import static co.com.devco.utils.MyWebDriverFactory.getDriverBrowser;

public class ValidarImagen implements Question<Boolean> {

    private static WebDriver driver= getDriverBrowser();

    @Override
    public Boolean answeredBy(Actor actor) {

        WebElement industries = driver.findElement(By.xpath("//div[@class='row']"));
        List<WebElement> links = industries.findElements(By.className("img-container"));

       if(links.size() == 1){
            return true;
        }else
            return false;
    }


    public static ValidarImagen ampliada() {
        return new ValidarImagen();
    }
}
