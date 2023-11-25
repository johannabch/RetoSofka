package Pages;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public  class RegistroPage extends BaseSelenium {
    By botonDeRegistro = By.id("signin2");
    By nombresuario = By.id("sign-username");
    By claveUsuario = By.id("sign-password");
    By botonRegistrarse = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void registrarUsuario(String usuario, String clave) {
        click(botonDeRegistro);
        if (isDisplayed(botonDeRegistro)) {
            type(usuario, nombresuario);
            type(clave, claveUsuario);
            click(botonRegistrarse);


        } else {
            System.out.print("No fue posible entrar a registrarse");
        }
    }


}