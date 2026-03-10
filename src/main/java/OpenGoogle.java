//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    public static void main(String[] args) {
        //***************open browser using System.setProperty():**********
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasan\\Downloads\\Driver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //**********open browser using WebDriverManager**********
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //open browser using SeleniumManager

    }
}
