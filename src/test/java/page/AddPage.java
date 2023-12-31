package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddPage {
    SelenideElement addBtn = $x("//span[.= 'Добавить в избранное']");
    SelenideElement goBtn = $("[d='M7.71 3c1.78 0 3.34.87 4.29 2.21A5.22 5.22 0 0 1 16.29 3a5.73 5.73 0 0 1 4.1 9.73l-7.72 7.61a.95.95 0 0 1-1.34 0l-7.72-7.62A5.73 5.73 0 0 1 7.71 3Z']");

    public void addInFavClick(){
        addBtn.click();
    }
    public void goToFavClick(){
        goBtn.click();
    }
}
