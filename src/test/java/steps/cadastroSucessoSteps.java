package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.pageCadastro;
import runner.runCucumberTest;

public class cadastroSucessoSteps extends runCucumberTest {

    pageCadastro paginaDeCadastro = new pageCadastro();

    @Dado("^que acesso o cadastro de usuario$")
    public void que_acesso_o_cadastro_de_usuario() {
        getDriver(Navegadores.CHROME);
        paginaDeCadastro.acessarTelaCadastro();
    }

    @E("^preencho todo o formulario$")
    public void preencho_todo_o_formulario() {
        paginaDeCadastro.preencherFormularioCadastro("seuJose", "123456");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        paginaDeCadastro.clicarNoBotaoRegistrar();
    }

    @Entao("^vejo a mensagem cadastro com sucesso$")
    public void vejo_a_mensagem_cadastro_com_sucesso() {
        paginaDeCadastro.validarCadastroComSucesso();
        paginaDeCadastro.validarUsuarioCadastroComSucesso("seuJose");

    }


}
