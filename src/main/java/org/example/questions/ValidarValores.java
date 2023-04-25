package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarValores implements Question<Boolean> {
    public static ValidarValores ConLaBase() {
        return new ValidarValores();
    }

    @Override
    public Boolean answeredBy(Actor actor) {return actor.recall("resultado");}

}
