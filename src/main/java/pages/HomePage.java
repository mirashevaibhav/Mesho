package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.GenericUtility;

public class HomePage extends WebTestBase {
@FindBy(xpath = "//span[text()='Men']")
    WebElement mouseOverOnMen;

@FindBy(xpath = "//span[text()='Category']")
        WebElement dropDown;

@FindBy(xpath = "//p[text()='Sort by : ']")
WebElement scrollDropDn;

@FindBy(xpath = "//p[text()='Shirts']")
WebElement shirtSearch;

@FindBy(xpath = "//span[text()='Analog Watches']")
WebElement checkBox;

public HomePage(){
    PageFactory.initElements(driver,this);
}
public void mouseover(){
    shirtSearch.click();
    GenericUtility.mouseOverOnElement(mouseOverOnMen);
    GenericUtility.waitUntilElementToBeClick(mouseOverOnMen);
}

public void scrollByElement(){
    GenericUtility.scrollByElement(scrollDropDn);

}
public void dropDown(){
    dropDown.click();
}
public void checkBoxSelect() {
        checkBox.click();

}

public void scrollByCategory(){
    GenericUtility.scrollByElement(dropDown);
}
}