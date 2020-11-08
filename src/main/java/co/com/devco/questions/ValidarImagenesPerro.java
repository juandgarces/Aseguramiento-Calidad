package co.com.devco.questions;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidarImagenesPerro implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(PetbookHomePage.TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        WebElement driver = null;
        WebElement industries = driver.findElement(By.xpath("//div[@class='row']/ul"));
        List<WebElement> links = industries.findElements(By.tagName("li"));
        for (int i = 0; i < links.size(); i++)
        {
            String x = links.get(i).getText();
        }
        return Text.of(PetbookHomePage.TITLE).viewedBy(actor).asString().equals("title");
    }


    public static ValidarImagenesPerro filtradas() {
        return new ValidarImagenesPerro();
    }
}
