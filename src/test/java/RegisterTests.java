import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTests extends BaseTest {

    @Test
    void testRegister() throws InterruptedException {
        MainPage mainpage = new MainPage(driver);
        mainpage.clickWishlist();

        WishlistPage wishlistpage = new WishlistPage(driver);
        wishlistpage.countSearchBox();
        wishlistpage.enterEmail("email@email.com");
        wishlistpage.clearEmailField();
        wishlistpage.pressLogin();
        wishlistpage.pressRegister();

        RegisterAccountPage registerAccount = new RegisterAccountPage(driver);


        registerAccount.enterFirstName("Vardenis");
        registerAccount.enterLastName("Pavardenis");
        registerAccount.enterEmail("Vardenis_Pavardenis123@gmail.com");
        registerAccount.enterPassword("Password123");
        registerAccount.clickAgreeButton();
        registerAccount.clickContinueButton();

        Assertions.assertEquals("Warning: E-Mail Address is already registered!", registerAccount.expectEmailAlreadyRegistered());

    }
}
