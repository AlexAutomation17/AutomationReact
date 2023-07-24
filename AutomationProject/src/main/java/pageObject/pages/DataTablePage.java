package pageObject.pages;

import base.Functions.CommonFunctions;
import org.openqa.selenium.By;

public class DataTablePage extends CommonFunctions {
     private By checkboxTable = By.xpath("//div[@class='p-datatable p-component']/..//h5[contains(text(),'Checkbox')]/..//div[@class='p-datatable p-component']");

     private String tableOption = "//div[@class='p-datatable p-component']/..//h5[contains(text(),'Checkbox')]/..//div[@class='p-datatable p-component']//td[contains(text(),'%s')]/..//td[@class='p-selection-column']";


     public void scrollToCheckboxSection() throws Exception{
         waitForPresenceOfAllElementsLocatedBy(checkboxTable,15);
         movetoElement(getWebElement(checkboxTable));
     }

    public void selectCheckboxOption(String option) throws Exception{
         String completeFormat = String.format(tableOption,option);
        clickElementClickable(getWebElement(By.xpath(completeFormat)),10);
    }

}
