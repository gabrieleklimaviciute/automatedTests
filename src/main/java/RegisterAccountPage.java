import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-email")
    private WebElement emailInputField;

    @FindBy(id = "input-password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn.btn-primary")
    private WebElement continueButton;

    @FindBy(name = "agree")
    private WebElement agreeButton;

    @FindBy(id = "alert")
    private WebElement emailAlreadyExistsError;

    public RegisterAccountPage(WebDriver driver) {
        super(driver);

    }

    public void clickAgreeButton() {

        agreeButton.click();
    }

    public void enterFirstName(String firstname) {
        firstNameField.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        lastNameField.sendKeys(lastname);
    }

    public void enterEmail(String email) {

        emailInputField.sendKeys(email);

    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(500);
    }

    public String expectEmailAlreadyRegistered() {
        return emailAlreadyExistsError.getText();
    }
}