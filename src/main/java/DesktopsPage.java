import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DesktopsPage extends BasePage {
    @FindBy(id = "input-limit")
    private WebElement showItems;

    @FindBy(id = "input-limit")
    private WebElement optionFour;

    public DesktopsPage(WebDriver driver) {
        super(driver);
    }

    public void selectItemsShow(String items) {
        Select showItemsDropdown = new Select(showItems);
        showItemsDropdown.selectByVisibleText(items);
    }

    public void selectOptionFour(int index) {
        Select fourthElement = new Select(optionFour);
        fourthElement.selectByIndex(index);
    }
}
