import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {


    @FindBy(css = "a#wishlist-total > .d-md-inline.d-none")
    private WebElement wishlist;


    public MainPage(WebDriver driver) {

        super(driver);
    }
    public void clickWishlist(){

        wishlist.click();
    }

}
