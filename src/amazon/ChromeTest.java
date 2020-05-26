package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest {

    public static void main(String[] args) throws InterruptedException {

        //Open Edge Browser
        System.setProperty("webdriver.chrome.driver","BrowserDriver\\windows\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get("https://www.amazon.com/");

        //wait 5seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);

        //get title
        String title=driver.getTitle();
        System.out.println(title);


        //finding elements with cssSelector
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        Thread.sleep(5000);


        //Click Appliances
        driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(4) > a")).click();
        Thread.sleep(5000);


        //Click Freezers
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[3]/a")).click();
        Thread.sleep(5000);


        //Click Chest Freezers
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/ul/li[1]/a")).click();
        Thread.sleep(5000);



        //close webBrowser
        driver.close();





    }



}
