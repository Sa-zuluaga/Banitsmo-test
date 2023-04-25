package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterface.ConvertidorPage.*;
import static org.example.userinterface.HomePage.*;

public class CalcularTasa implements Task {

    public static Performable Interes() {
        return instrumented(CalcularTasa.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean resultado;
        actor.attemptsTo(
                WaitUntil.the(MENU_NEGOCIOS, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(MENU_NEGOCIOS),
                WaitUntil.the(MENU_HERRAMIENTAS, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(MENU_HERRAMIENTAS),
                WaitUntil.the(BOTON_DERECHA, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BOTON_DERECHA),
                WaitUntil.the(MENU_GESTION_FINANZAS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MENU_GESTION_FINANZAS),
                WaitUntil.the(CONVERTIDOR_TASAS, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(CONVERTIDOR_TASAS),
                WaitUntil.the(BOTON_CALCULAR_TASA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CALCULAR_TASA),
                WaitUntil.the(INPUT_INTERES, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("20").into(INPUT_INTERES).thenHit(Keys.ENTER),
                SelectFromOptions.byValue("2").from(INPUT_PERIODICIDAD),
                SelectFromOptions.byValue("1").from(INPUT_CAPITALIZACION)
        );
        resultado = RESULTADO_TASA.resolveFor(actor).getText().contains("9.54 %");
        actor.remember("resultado", resultado);
        System.out.println(RESULTADO_TASA.resolveFor(actor).getText());
    }
}
