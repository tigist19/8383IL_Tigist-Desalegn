package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class DropDownMenu {

    public static void main(String[] args) throws InterruptedException {


        //Open Edge Browser
        System.setProperty("webdriver.edge.driver","BrowserDriver\\windows\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();

        //Navigate to URL
        driver.get("https://www.amazon.com/");

        //wait 5seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);

        //get title
        String title=driver.getTitle();
        System.out.println(title);

        //finding elements with XPath/Click DropDownMenu
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(5000);


        //Click PrimeVideo
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/i")).click();
        Thread.sleep(5000);

        //Click Included With Prime
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")).click();
        Thread.sleep(5000);


        //close webBrowser
        driver.close();








    }


}
