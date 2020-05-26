package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {


    public static void main(String[] args) throws InterruptedException {

        //Open Edge Browser
        System.setProperty("webdriver.edge.driver","BrowserDriver\\windows\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get("https://www.amazon.com/");

        //wait 5seconds
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);

        //get title
        String title=driver.getTitle();
        System.out.println(title);

        //finding elements with cssSelector
        //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Hand Sanitizer");

        //finding elements with XPath/Enter Keyword
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Hand Sanitizer");
        Thread.sleep(5000);


        //Click Search Button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(5000);


        //Click Item
        driver.findElement(By.xpath("//*[contains(text(),'Natural Concepts Hand Sanitizer Gel, 6-Pack,')]")).click();
        Thread.sleep(5000);

        //Add To Cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000);

        //Check Out
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        Thread.sleep(5000);


        //close webBrowser
        driver.close();


    }



}
