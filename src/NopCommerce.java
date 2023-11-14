import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerce {

    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current url.
        System.out.println("The current Url : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the Page source : " + driver.getPageSource());

        // 6. Navigate to Url.
        String navigat = "https://demo.nopcommerce.com/login?returnUrl%2F";
        driver.navigate().to(navigat);
        Thread.sleep(1000);

        //7. Print the current url.
        System.out.println("Get the current URl : " + driver.getCurrentUrl());

        // 8. Navigate back to the home page.
        driver.navigate().back();
        System.out.println();

            //9. Navigate to the login page.
        String loginurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginurl);

        //10. Print the current url.
        System.out.println("Get the Current Url:" + driver.getCurrentUrl());

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email to email field.
            WebElement emaiID = driver.findElement(By.id("Email"));
        emaiID.sendKeys("John123@gmail.com");

        //13. Enter the password to password field.
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("John123");
        Thread.sleep(3000);

        //14. Click on Login Button.
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //15. Close the browser.
        driver.quit();



        //8. Navigate back to the login page.

    }
}
