package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TvPage;
import reporting.TestLogger;

public class TvPageTest extends TvPage {
    TvPage tvpage;

    @BeforeTest
            public void initPage() {
         driver.get("https://www.cnn.com/tv");
         tvpage = new PageFactory().initElements(driver, TvPage.class);
   }
    @Test
    public void testTvPageUrl()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url =getTvPageUrl();
        Assert.assertEquals(url ,"https://www.cnn.com/tv");
    }
    @Test
    public void testTvPageTitle()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String pageTitle = getTvPageTitle();
        Assert.assertEquals(pageTitle,"CNN TV - CNN");
    }
    @Test
    public void testNoOfIFrame()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getNoOfIframe(),14);
    }
    @Test
    public void testNoOfLinks()
{
    TestLogger.log("Browser is launched");
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    Assert.assertEquals(getNoOfLinks(),325);
}
    @Test
    public void testFirstIframe() throws InterruptedException{
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFirstIframe();
    }
    @Test
    public void testFirstIframeUrls() throws InterruptedException
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String url = getFirstIframeUrls();
        System.out.println(url);
    }
    @Test
    public void testTvHeading()throws InterruptedException
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        Assert.assertEquals(tvpage.getHeaderTV(),"TV");
    }
    @Test
    public void testDontMissOnCnn()throws InterruptedException
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        Assert.assertEquals(tvpage.getDontMissOnCnn(),"Don't miss on CNN ");
    }
    @Test
    public void testClickOnFirstTab()
    {
    TestLogger.log("Browser is launched");
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    driver.get("https://www.cnn.com/tv");
    TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
    tvpage.clickOnFirstTab();
    }
    @Test
    public void testFirstTabUrl()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        Assert.assertEquals(tvpage.getFirstTabUrl(),"https://explorepartsunknown.com/");
    }
    @Test
    public void testClickOnSecondTab()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        tvpage.clickOnSecondTab();
    }
    @Test
    public void testSecondTabUrl()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        Assert.assertEquals(tvpage.getSecondTabUrl(),"https://www.cnn.com/shows/this-is-life-with-lisa-ling");
    }
    @Test
    public void testClickOnThirdTab()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        tvpage.clickOnThirdTab();
    }
    @Test
    public void testThirdTabUrl()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        Assert.assertEquals(tvpage.getThirdTabUrl(),"https://www.cnn.com/shows/cuomo-prime-time");
    }
    @Test
    public void testGoCnnTitle()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        String goCnnText = tvpage.goCnnTitle();
        Assert.assertEquals("Watch CNN on demand with CNNgo ",goCnnText);
    }
   @Test
    public void testClickOnGoCnnImage()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        tvpage.clickOnGoCnnImage();
    }
    @Test
    public void testGoCnnImageUrl()
    {
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.cnn.com/tv");
        TvPage tvpage = PageFactory.initElements(driver, TvPage.class);
        String url = tvpage.goCnnImageUrl();
        Assert.assertEquals(url,"https://go.cnn.com/?stream=cnn");
    }
 //   @Test
//    public void SwitchToframe(){
//        TestLogger.log("Browser is launched");
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        driver.get("https://www.cnn.com/tv");
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(size);
//        for(int i=0; i<=size; i++){
//	    driver.switchTo().frame(i);
//	    //int total= driver.findElements(By.cssSelector("#google_ads_iframe_/8663477/CNN/tv/landing_0")).size();
//		driver.switchTo().defaultContent(); //switching back from the iframe
//	 }
 //   }
}
