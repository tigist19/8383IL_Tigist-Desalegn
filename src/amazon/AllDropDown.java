package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class AllDropDown {

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


        //Find Element with Class/Click All
        driver.findElement(By.id("searchDropdownBox")).click();
        Thread.sleep(5000);


        //
        driver.findElement(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div/div/span")).sendKeys("Books");
        Thread.sleep(5000);


        //close webBrowser
        driver.close();










    }



}
