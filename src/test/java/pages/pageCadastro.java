package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;
import runner.runCucumberTest;

import static suport.Utils.esperarElementoAparecer;

public class pageCadastro extends runCucumberTest {
    WebDriver navegador;
    private By campoUsuario = By.id("user");
    private By campEmail = By.id("email");
    private By campoSenha = By.id("password");

//    public pageCadastro(WebDriver navegador) {
//        this.navegador = navegador;
//    }

    public void acessarTelaCadastro() {
        getDriver().get("https://automationpratice.com.br/register");
        Utils.esperarElementoAparecer(By.id("btnRegister"), 20);
    }

    public void preencherFormularioCadastro(String usuario, String senha) {
        getDriver().findElement(campoUsuario).sendKeys(usuario);
        getDriver().findElement(campEmail).sendKeys(Utils.gerarEmailAleatorio());
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void clicarNoBotaoRegistrar() {
        getDriver().findElement(By.id("btnRegister")).click();
    }

    public void validarCadastroComSucesso() {

        esperarElementoAparecer(By.xpath("//h2[contains(.,'Cadastro realizado!')]"), 10);
        String textoCadastroRealizado = getDriver().findElement(By.xpath("//h2[contains(.,'Cadastro realizado!')]")).getText();
        Assert.assertEquals("Nao achou o texto", "Cadastro realizado!", textoCadastroRealizado);


    }

    public void validarUsuarioCadastroComSucesso(String usuario) {


        String textoUsuario = getDriver().findElement(By.xpath("//div[@class='swal2-html-container'][contains(.,'Bem-vindo " + usuario + "')]")).getText();
        Assert.assertEquals("Nao achou o texto", "Bem-vindo " + usuario, textoUsuario);


    }

    public void selecionarTipo(Integer tipo) {
        if (tipo == 1) {
            getDriver().findElement(By.id("gender1")).click();
        } else if (tipo == 2) {
            getDriver().findElement(By.id("gender2")).click();
        }
    }

    public void selecionarDataNascimento(Integer dia, Integer mes, String ano) {
        Select selecionarDia = new Select(navegador.findElement(By.id("dia")));
        selecionarDia.selectByIndex(dia);
        Select selecionarMes = new Select(navegador.findElement(By.id("mes")));
        selecionarMes.selectByIndex(mes);
        Select selecionarAno = new Select(navegador.findElement(By.id("ano")));
        selecionarAno.selectByValue(ano);

    }
    public void selecionarAssunto(String assunto) {
        Select selecionarAssunto = new Select(navegador.findElement(By.id("assunto")));
        selecionarAssunto.selectByVisibleText(assunto);
    }
    public void uploadArquivo(String assunto) {
        getDriver().findElement(By.id("fileUpload")).sendKeys("/home/athos/IdeaProjects/qazandoSeleniumTest/src/test/java/massa/screenshot.png");
    }

}
