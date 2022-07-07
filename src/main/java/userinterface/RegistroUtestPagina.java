package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class RegistroUtestPagina extends PageObject {
    public static final Target boton_registroutest = the("Boton que nos muestra el formulario para registro en Utest").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target caja_nombre = the("Caja de texto que nos permite ingresar el nombre").
            located(By.id("firstName"));
    public static final Target caja_apellido = the("Caja de texto que nos permite ingresar el apellido").
            located(By.id("lastName"));
    public static final Target caja_email = the("Caja de texto que nos permite ingresar el email").
            located(By.id("email"));
    public static final Target lista_mes = the("Lista desplegable que nos permite seleccionar el mes").
            located(By.id("birthMonth"));
    public static final Target lista_dia = the("Lista desplegable que nos permite seleccionar el dia").
            located(By.id("birthDay"));
    public static final Target lista_anio = the("Lista desplegable que nos permite seleccionar el año").
            located(By.id("birthYear"));
    public static final Target boton_siguienteubicacion = the("Boton que nos muestra el formulario para registro en: Ubicacion").
            located(By.xpath("//i[@class='material-icons']"));
    public static final Target caja_ciudad = the("Caja ciudad").
            located(By.id("city"));
    public static final Target boton_siguientedispositivos = the("Boton que nos muestra el formulario para registro en: Dispositivos").
            located(By.xpath("//SPAN[@aria-hidden='true'][text()='Next: Devices']"));
    public static final Target boton_ultimopaso = the("Boton que nos muestra el formulario para registro en: Ultimo Paso").
            located(By.xpath("//SPAN[text()='Next: Last Step']"));
    public static final Target caja_contrasena = the("Caja de texto que nos permite ingresar la contraseña").
            located(By.id("password"));
    public static final Target caja_confirmcontrasena = the("Caja de texto que nos permite confimar la contraseña").
            located(By.id("confirmPassword"));
    public static final Target casilla_terminos = the("Casilla de verificacion que nos permite aceptar los terminos").
            located(By.id("termOfUse"));
    public static final Target casilla_privacidad = the("Casilla de verificacion que nos permite aceptar la privacidad").
            located(By.id("privacySetting"));
    public static final Target boton_completar = the("Boton que nos permite completar el registro").
            located(By.id("laddaBtn"));
    public static final Target cabecera_bienvenido = the("Cabecera de bienvenido que nos permite corrobar la creación del registro").
            located(By.id("mainContent"));

}
