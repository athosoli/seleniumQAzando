package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runBase {
    static WebDriver navegador;

    public enum Navegadores {CHROME, FIREFOX}

    public static WebDriver getDriver() {
        if (navegador == null) {
            return getDriver(Navegadores.CHROME);
        } else {
            return navegador;
        }
    }

    public static WebDriver getDriver(Navegadores navegadores) {
        if (navegador != null) {
            navegador.quit();
        }
        switch (navegadores) {
            case CHROME:
                navegador = new ChromeDriver();
                break;
            case FIREFOX:
                navegador = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("informe o navegador correto CHROME ou FIREFOX");


        }
        return navegador;
    }
}
