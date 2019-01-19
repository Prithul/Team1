package pages;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends HomePage {

    //    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div[1]/div/div[1]/button[2]")
//    public static WebElement searchPageSearchButton;
    @FindBy(how = How.CLASS_NAME, using = "cnn-search__input")
    public  WebElement searchPageSearchTextBox;
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/div/div[1]/div/div[1]/button[2]")
    public  WebElement searchPageSubmitButton;
    @FindBy(how = How.CLASS_NAME, using = "cnn-search__clear")
    public WebElement clearButton;

    public void searchFor(String value) {
        getSearchInputField().sendKeys(value);
    }
    public void searchForAndEnter(String value) {
        getSearchInputField().sendKeys(value, Keys.ENTER);
    }
    public void submitSearchButton() {
        searchPageSubmitButton.click();
    }

    public void clearInput() {
        //driver.findElement(By.className("cnn-search__clear")).click();
        clearButton.click();
    }
    public WebElement getSearchInputField() {
        return searchTextBox;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchTextBox = searchInputField;
    }
    public void homeSearchItemsAndSubmitButton() throws IOException, InterruptedException {
        searchButton.click();
        List<String> list = getItemValue();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            searchSubmitButton.submit();
            sleepFor(5);
            goCnn();

        }
    }
    public void searchPageSearchItemsAndSubmitButton() throws IOException, InterruptedException {
        List<String> list = getItemValue();
        searchButton.click();
        searchFor(list.get(0));
        submitSearchButton();
        clearInput();
        for (int i = 1; i < list.size(); i++) {
            searchPageSearchTextBox.sendKeys(list.get(i));
            submitSearchButton();
            sleepFor(5);
            clearInput();
        }
    }
    public void homeSearchItemsAndEnter() throws InterruptedException {
        searchButton.click();
        List<String> list = getItemValue();
        for (int i = 0; i < list.size(); i++) {
            searchForAndEnter(list.get(i));
            sleepFor(5);
            goCnn();
        }
    }

    public void searchPageSearchItemsAndEnter() throws InterruptedException {
        List<String> list = getItemValue();
        searchButton.click();
        searchForAndEnter(list.get(0));
        clearInput();
        for (int i = 1; i < list.size(); i++) {
            searchPageSearchTextBox.sendKeys(list.get(i), Keys.ENTER);
            //submitSearchButton();
            sleepFor(5);
            clearInput();
        }
    }
        public List<String> getItemValue()
        {
            List<String> itemsList = new ArrayList<String>();
            itemsList.add("US");
            itemsList.add("Politics");
            itemsList.add("World");
            itemsList.add("Tech");
            itemsList.add("Entertainment");
            itemsList.add("Business");
            itemsList.add("Travel");
            itemsList.add("Style");
            return itemsList;
        }
    }

