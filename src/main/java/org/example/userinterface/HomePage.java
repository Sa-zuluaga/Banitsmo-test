package org.example.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage  extends PageObject {
    public static final Target MENU_NEGOCIOS = Target.the("menu negocios").located(By.xpath("//*[text()='Negocios']"));
    public static final Target MENU_HERRAMIENTAS = Target.the("menu herramientas").located(By.xpath("//*[text()='Herramientas']"));
    public static final Target BOTON_DERECHA = Target.the("boton derecha").located(By.xpath("//*[contains(text(),'arrow2-right')]"));
    public static final Target MENU_GESTION_FINANZAS = Target.the("menu gestion de finanzas").located(By.xpath("//a[contains(text(),'Gestionar las finanzas de mi negocio')]"));
    public static final Target CONVERTIDOR_TASAS = Target.the("convertidor de tasas ").located(By.xpath("//h5[contains(text(),'Convertidor de tasas de inter')]"));

}
