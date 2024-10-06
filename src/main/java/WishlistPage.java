import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class WishlistPage extends BasePage {
    @FindBy(css = "input[name='search']")
    private List<WebElement> searchBoxes;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(css = "[action] .btn-primary")
    private WebElement loginSubmit;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    public WishlistPage(WebDriver driver) {
        super(driver);

    }

    public void countSearchBox() {
        System.out.println("Search boxes count number: " + searchBoxes.size());
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clearEmailField() {
        emailField.clear();
    }

    public void pressLogin() {
        loginSubmit.click();
    }

    public void pressRegister() {
        registerButton.click();
    }
}
