package co.com.devco.questions;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.devco.utils.MyWebDriverFactory.getDriverBrowser;

public class ValidarImagenes implements Question<Boolean> {

    private static WebDriver driver= getDriverBrowser();

    @Override
    public Boolean answeredBy(Actor actor) {

        WebElement industries = driver.findElement(By.xpath("//div[@class='row']/ul"));
        List<WebElement> links = industries.findElements(By.tagName("img"));
        int contienePerro = 0;
        for (int i = 0; i < links.size(); i++)
        {
            if(links.get(i).getAttribute("src").contains("perro") || links.get(i).getAttribute("src").contains("gato"));
                contienePerro = contienePerro + 1 ;
        }
        if(links.size() == contienePerro){
            return true;
        }else
            return false;
    }


    public static ValidarImagenes cargadas() {
        return new ValidarImagenes();
    }
}
