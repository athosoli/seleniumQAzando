package suport;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.runCucumberTest;
import java.time.Duration;
import java.util.Random;


public class Utils extends runCucumberTest {


    public static void esperarElementoAparecer(By element, int tempoEmSegundos) {

        Duration tempoDeEspera = Duration.ofSeconds(tempoEmSegundos);
        WebDriverWait Aguardar = new WebDriverWait(getDriver(), tempoDeEspera);
        Aguardar.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static String gerarEmailAleatorio(){
        String email_init = "z";
        String email_final = "@z.com";
        Random valorAleatorio = new Random();
        int minimo = 1;
        int maximo = 999999;
        int resultado = valorAleatorio.nextInt(maximo - minimo)+ minimo;
        return email_init + resultado + email_final;
    }
}

