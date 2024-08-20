package co.com.screenplay.project.ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUI extends PageObject {

    /**
     * Mapeo de localozadores vista LOGIN
     */


    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.name("username"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.name("password"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.xpath("//div[@id='app']//form//div[3]//button"));
}
