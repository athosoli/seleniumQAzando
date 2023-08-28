package pages;
import org.junit.Assert;
import org.openqa.selenium.*;
import suport.Utils;
import runner.runCucumberTest;



public class homePageQazando extends runCucumberTest {

//    public homePageQazando(WebDriver navegador) {
//
//        this.navegador = navegador;
//    }

    public void acessarHomePage(){

        getDriver().get("https://www.qazando.com.br/#cursos");

        Utils.esperarElementoAparecer(By.id("btn-ver-cursos"),20);


    }
    public void rolarPagina(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 200000)");

    }
    public void preencherEmail(String email)  {
        Utils.esperarElementoAparecer(By.id("email"),10);
        getDriver().findElement(By.id("email")).sendKeys(email);

//        WebElement inputElement = navegador.findElement(By.id("email"));
        // Execute um script JavaScript para remover o foco
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) navegador;
//        jsExecutor.executeScript("arguments[0].blur();", inputElement);

    }

    public void botaoGanharCupom()  {


       Assert.assertEquals("Nao achou o botao",true,getDriver().findElement(By.id("button")).isDisplayed());

        Utils.esperarElementoAparecer(By.id("form"),10);

        getDriver().findElement(By.id("button")).submit();
    }
    public void Scroll(){
        WebElement element = getDriver().findElement(By.xpath("//h3[contains(.,'(48) 99192-9692')]"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
       // jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        jsExecutor.executeScript("window.scrollBy(0,2000800);");

    }
    public void validaMensagem(String textoCupom){

     Utils.esperarElementoAparecer(By.cssSelector("h2.cupom-text"),10);
        String textoDoCupon = getDriver().findElement(By.cssSelector("h2.cupom-text")).getText();
        Assert.assertEquals("Nao achou o texto",textoCupom, textoDoCupon);

    }
}
