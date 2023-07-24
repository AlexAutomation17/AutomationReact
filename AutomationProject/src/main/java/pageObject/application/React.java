package pageObject.application;

import base.driverInitialize.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.pages.DataTablePage;
import utils.JsonFiles;

import java.nio.file.NoSuchFileException;

public class React {
    private WebDriver driver;
    private DataTablePage dataTablePage;
    public React(){
        driver = DriverFactory.getDriver();
        dataTablePage = PageFactory.initElements(driver, DataTablePage.class);
    }

    public DataTablePage getDataTablePage() { return dataTablePage; }

    public void goTo() throws NoSuchFileException {
        JsonFiles file = new JsonFiles();
        file.setFileName("credentials");
        driver.get(file.getField("url"));
    }
}
