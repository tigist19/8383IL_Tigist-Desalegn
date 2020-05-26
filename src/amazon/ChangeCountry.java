package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class ChangeCountry {

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


        //Find Elements With Class/click
        driver.findElement(By.className("icp-nav-link-inner")).click();
        Thread.sleep(5000);

        //Find Elements With Xpath/Click Español
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/span")).click();
        Thread.sleep(5000);


        //Click Save Changes
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(5000);



        //close webBrowser
        driver.close();







    }




}
