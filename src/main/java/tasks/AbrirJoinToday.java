package tasks;

import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.RegistroUtestPagina;

public class AbrirJoinToday implements Task {
    public AbrirJoinToday(TablaDeDatosFeature tablaDeDatosFeature) {
        this.tablaDeDatosFeature = tablaDeDatosFeature;
    }

    private TablaDeDatosFeature tablaDeDatosFeature;

    public static AbrirJoinToday LaPagina(TablaDeDatosFeature tablaDeDatosFeature) {
        return Tasks.instrumented(AbrirJoinToday.class, tablaDeDatosFeature);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroUtestPagina.boton_registroutest),
                Enter.theValue(tablaDeDatosFeature.getNombre()).into(RegistroUtestPagina.caja_nombre),
                Enter.theValue(tablaDeDatosFeature.getApellido()).into(RegistroUtestPagina.caja_apellido),
                Enter.theValue(tablaDeDatosFeature.getEmail()).into(RegistroUtestPagina.caja_email),
                SelectFromOptions.byVisibleText("June").from(RegistroUtestPagina.lista_mes),
                SelectFromOptions.byVisibleText("11").from(RegistroUtestPagina.lista_dia),
                SelectFromOptions.byVisibleText("1987").from(RegistroUtestPagina.lista_anio),
                Click.on(RegistroUtestPagina.boton_siguienteubicacion),
                Click.on(RegistroUtestPagina.caja_ciudad),
                Click.on(RegistroUtestPagina.boton_siguientedispositivos),
                Click.on(RegistroUtestPagina.boton_ultimopaso),
                Enter.theValue(tablaDeDatosFeature.getContrasena()).into(RegistroUtestPagina.caja_contrasena),
                Enter.theValue(tablaDeDatosFeature.getConfirmcontrasena()).into(RegistroUtestPagina.caja_confirmcontrasena),
                Click.on(RegistroUtestPagina.casilla_terminos),
                Click.on(RegistroUtestPagina.casilla_privacidad),
                Click.on(RegistroUtestPagina.boton_completar)
                );


    }


}
