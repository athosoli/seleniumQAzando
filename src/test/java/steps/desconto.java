package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.homePageQazando;
import runner.runCucumberTest;


public class desconto extends runCucumberTest {

   homePageQazando homePage = new homePageQazando();

    @Dado("que estou no site qazando$")
    public void acessarSiteQazando()  {
    homePage.acessarHomePage();

        homePage.Scroll();

      }
    @E("^preencho o email$")
    public void prencherEmail()  {
        homePage.Scroll();
        homePage.preencherEmail("z@z.com");
        homePage.Scroll();

    }
    @Quando("^clico em ganhar cupom$")
   public void clicarGanharCupom()  {
        homePage.Scroll();
   homePage.botaoGanharCupom();

    }
    @Entao("^eu vejo o codigo de desconto$")
   public void verCodigoCupom(){
   homePage.validaMensagem("Seu copom é: QAZANDO15OFF");
   }
}








