package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://aws-aseguramiento-calidad.s3-website.us-east-2.amazonaws.com/";

    public static final Target TITLE = Target.the("Titulo de Pagina").
            located(By.xpath("//div[@class='col-sm-12 btn btn-primary']"));
	public static final Target BT_PERRO = Target.the("Boton para filtro de perro").
            located(By.xpath("//*[text()= 'Perro']"));
    public static final Target BT_GATO = Target.the("Boton para filtro de gato").
            located(By.xpath("//*[text()= 'Gato']"));
    public static final Target BT_ALL = Target.the("Buton para filtrar todo").
            located(By.xpath("//*[text()= 'All']"));
    public static final Target PRIMERA_IMAGEN = Target.the("Primera imagen")
            .located(By.xpath("//div/ul/li/a"));
    }
