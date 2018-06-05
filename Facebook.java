import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static WebDriver driver = new ChromeDriver();


    public static void main(String [] args){
        System.out.println("this is check");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        facebook();
        driver.close();

    }

    public static String facebook() {
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        String a = driver.getCurrentUrl();
        String b = driver.getPageSource();

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement Button = driver.findElement(By.id("u_0_2"));
        email.sendKeys("0918767761");
        password.sendKeys("beky@198802");
        Button.click();

        WebElement notification = driver.findElement(By.id("notificationsCountValue"));
        String notification_holder = notification.getAttribute("innerHTML");
        System.out.println(notification_holder);
        return notification_holder;
    }
}
