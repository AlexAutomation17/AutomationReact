package base.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.FileReading;

import java.io.File;
import java.nio.file.Paths;

public class ChromeDriverCreator extends WebDriverCreator{

    private static String pathChrome = Paths.get("").toAbsolutePath().toString() +
            File.separator + "src"+ File.separator+ "main" + "" +
            File.separator + "java" + File.separator + "base" + File.separator + "drivers" + File.separator + "chromedriver.exe";
    @Override
    public WebDriver createWebDriver() {
        FileReading fileReading = new FileReading();
        fileReading.setFileName("GlobalConfig.properties");
        System.setProperty("webdriver.chrome.driver", pathChrome);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation","load-extension"});
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        options.setHeadless(Boolean.parseBoolean(fileReading.getField("headless")));
        return new ChromeDriver(options);
    }
}
