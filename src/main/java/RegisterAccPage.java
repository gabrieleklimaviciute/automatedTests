import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccPage extends BasePage {

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(css = "div#header-cart .fa-cart-shopping.fa-solid")
    private WebElement cartButton;

    @FindBy(name = "agree")
    private WebElement agreeButton;

    @FindBy(css = "li:nth-of-type(1) > .dropdown-toggle.nav-link")
    private WebElement desktopsButton;

    @FindBy(css = ".dropdown-menu.show > .see-all")
    private WebElement desktopsDropdown;

    public RegisterAccPage(WebDriver driver) {
        super(driver);
    }

    public void enabledPasswordField() {
        System.out.println("Password input field is enabled: " + passwordField.isEnabled());
    }

    public void cartButtonDisplayed() {
        System.out.println("Cart element is displayed: " + cartButton.isDisplayed());
    }

    public void selectedAgreeButton() {
        System.out.println("Agree checkbox is selected: " + agreeButton.isSelected());
    }

    public void clickDesktopsButton() {
        desktopsButton.click();
    }

    public void clickDesktopsDropdown() {
        desktopsDropdown.click();
    }
}
