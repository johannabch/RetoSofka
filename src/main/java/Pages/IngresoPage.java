package Pages;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class IngresoPage extends BaseSelenium {

    boolean visible;
    By botonDeIngreso = By.id("login2");
    By nombresurio = By.id("loginusername");
    By claveUsuario = By.id("loginpassword");
    By botonIngresar = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By bienvenida = By.id("nameofuser");

    public IngresoPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void ingresarUsuario(String usuario, String clave) {

        click(botonDeIngreso);
        if (isDisplayed(botonDeIngreso)) {
            type(usuario, nombresurio);
            type(clave, claveUsuario);
            click(botonIngresar);
           // visible = isVisible(bienvenida);

        } else {
            System.out.print("No fue posible ingresar");
        }
    }

    @Test
    public Boolean mensajeBienvenida() {
        visible = isVisible(bienvenida);

        return visible;
    }


}

