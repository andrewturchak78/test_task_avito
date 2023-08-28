package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FavoritesPage {
    SelenideElement itemName = $x("//strong[.='Domain-Driven Design Distilled Vaughn Vernon']");
    SelenideElement redHeartOfFavorite = $("[data-marker='toggle-favorite-icon']");
    SelenideElement board = $("[class='empty-state-add-to-favorites-image-fsndM']");
    public String getItemName(){
        return itemName.getText();
    }
    public void clickOnRedHeart(){
        redHeartOfFavorite.click();
    }
    public FavoritesPage reloadPage(){
        refresh();
        return new FavoritesPage();
    }
    public FavoritesPage checkBoardVisibility(){
        board.shouldBe(visible);
        return new FavoritesPage();
    }
}
