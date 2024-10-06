import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test
    void testRegister() {
        MainPage mainpage = new MainPage(driver);
        mainpage.clickWishlist();

        WishlistPage wishlistpage = new WishlistPage(driver);
        wishlistpage.countSearchBox();
        wishlistpage.enterEmail("email@email.com");
        wishlistpage.clearEmailField();
        wishlistpage.pressLogin();
        wishlistpage.pressRegister();

        RegisterAccPage registeraccpage = new RegisterAccPage(driver);
        registeraccpage.enabledPasswordField();
        registeraccpage.cartButtonDisplayed();
        registeraccpage.selectedAgreeButton();
        registeraccpage.clickDesktopsButton();
        registeraccpage.clickDesktopsDropdown();

        DesktopsPage desktopspage = new DesktopsPage(driver);
        desktopspage.selectItemsShow("25");
        desktopspage.selectOptionFour(3);
    }
}
