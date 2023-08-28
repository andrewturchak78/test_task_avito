package test;

import org.junit.jupiter.api.Test;
import page.AddPage;
import page.FavoritesPage;

import static com.codeborne.selenide.Selenide.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FavoritesTest {

    @Test
    void addInFavoriteTest(){
        AddPage addPage = new AddPage();
        FavoritesPage favPage = new FavoritesPage();
        open("https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363");
        addPage.addInFavClick();
        addPage.goToFavClick();
        assertEquals("Domain-Driven Design Distilled Vaughn Vernon",favPage.getItemName());
        favPage.clickOnRedHeart();
        favPage.reloadPage();
        favPage.checkBoardVisibility();

    }
}
