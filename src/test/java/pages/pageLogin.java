package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.runCucumberTest;
import suport.Utils;

import static runner.runBase.getDriver;

public class pageLogin extends runCucumberTest {
//    WebDriver navegador;

    private By email_field = By.id("user");
    private By password_field = By.id("password");
    private By button_field = By.id("btnLogin");
//    public pageLogin(WebDriver navegador){
//        this.navegador = navegador;
//    }
    public void acessarTelaLogin(){
        getDriver().get("https://automationpratice.com.br/login");
        Utils.esperarElementoAparecer(email_field,20);
    }
    public void preenccherDadosLogin(){
        getDriver().findElement(email_field);
        getDriver().findElement(password_field);

    }
    public void preenccher(){
        getDriver().findElement(button_field);

    }

}
