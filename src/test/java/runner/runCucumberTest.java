package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
       // tags = {"@cadastro-sucesso"},
        features = "/home/athos/IdeaProjects/qazandoSeleniumTest/src/test/resources/features",
        glue = {"steps"}
)
public class runCucumberTest extends runBase{
//    public static WebDriver navegador;
//
//    @BeforeClass
//    public static void start() {
//        navegador = new ChromeDriver();
//        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }

    @AfterClass

    public static void stop() {
        TakesScreenshot screenshotDriver = (TakesScreenshot) navegador;
        File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

        // Define o caminho e o nome do arquivo
        String filePath = "target/fotos/screenshot.png";

        // Tenta salvar o arquivo no caminho especificado
        try {
            FileUtils.copyFile(screenshotFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Fecha o navegador
        navegador.quit();
    }
}
