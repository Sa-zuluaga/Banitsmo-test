package org.example.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConvertidorPage extends PageObject {
    public static final Target BOTON_CALCULAR_TASA = Target.the("boton cotizar").located(By.xpath("//body/div[@id='main-content']/div[2]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
    public static final Target INPUT_INTERES = Target.the("input interes").located(By.xpath("//input[@id='interes']"));
    public static final Target INPUT_PERIODICIDAD = Target.the("input peiodicidad").located(By.xpath("//select[@id='periodicidad-deseada']"));
    public static final Target INPUT_CAPITALIZACION = Target.the("input capitalizacion").located(By.xpath("//select[@id='capitalizacion']"));
    public static final Target RESULTADO_TASA = Target.the("valor tasa interes").located(By.xpath("//h3[@id='respuesta']"));

}
