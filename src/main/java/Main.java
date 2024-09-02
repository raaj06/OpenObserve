import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://openfabric.dev/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().refresh();
        driver.quit();
        



    }
}
