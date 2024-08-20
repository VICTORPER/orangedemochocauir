package co.com.screenplay.project.utils;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Locale;
import java.util.Random;

//import static co.com.screenplay.project.ui.CategoryUI.SELECT_JOB_TITLE;
//import static co.com.screenplay.project.ui.CategoryUI.getLocatorListJobTitle;
import static co.com.screenplay.project.utils.Constants.ONE;
import static co.com.screenplay.project.utils.Constants.ZERO;
import static co.com.screenplay.project.utils.WebActions.click;

public class SelectorElements {

    private SelectorElements(){}

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    private static int getProductsRandom() {
        return faker.number().numberBetween(ZERO, ZERO);
    }

    public static void selectRandomJobTitle() {
        //click(getLocatorListJobTitle().get(getProductsRandom()));
         //SelectFromOptions.byVisibleText("DevOps Engineer").from(SELECT_JOB_TITLE);
    }
}
