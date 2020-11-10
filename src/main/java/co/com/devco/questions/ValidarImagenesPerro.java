package co.com.devco.questions;

import co.com.devco.userinterfaces.PetbookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.devco.utils.MyWebDriverFactory.getDriverBrowser;

public class ValidarImagenesPerro implements Question<Boolean> {

    private static WebDriver driver= getDriverBrowser();

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(PetbookHomePage.TITLE, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds());
        WebElement industries = driver.findElement(By.xpath("//div[@class='row']/ul"));
        List<WebElement> links = industries.findElements(By.tagName("li"));
        for (int i = 0; i < links.size(); i++)
        {
            String x = links.get(i).getAttribute("src");
        }
        return Text.of(PetbookHomePage.TITLE).viewedBy(actor).asString().equals("title");
    }


    public static ValidarImagenesPerro filtradas() {
        return new ValidarImagenesPerro();
    }
}
