package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://aws-aseguramiento-calidad.s3-website.us-east-2.amazonaws.com/";

    public static final Target TITLE = Target.the("Titulo de Pagina").
            located(By.xpath("//div[@class='col-sm-12 btn btn-primary']"));
	public static final Target INPUT_CIUDAD_ORIGEN = Target.the("Ciudad de Origen").
            located(By.xpath("//input[@title='Buscar']"));
    public static final Target INPUT_CIUDAD_DESTINO = Target.the("Ciudad de Destino").
            located(By.xpath("//input[@title='Buscar']"));
    public static final Target INPUT_FECHA_SALIDA = Target.the("Fecha de Salida").
            located(By.xpath("//input[@title='Buscar']"));
    public static final Target INPUT_FECHA_REGRESO = Target.the("Fecha de Regreso").
            located(By.xpath("//input[@title='Buscar']"));
    public static final Target BOTON_BUSCAR_VUELO = Target.the("Boton buscar vuelo").
            located(By.xpath("//input[@title='Buscar']"));
}
