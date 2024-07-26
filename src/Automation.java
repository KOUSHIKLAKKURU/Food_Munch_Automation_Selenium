import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Navigate to Login Page
        driver.get("http://127.0.0.1:8000/LoginRegister");
        //Perform Login
        driver.findElement(By.id("email-id")).sendKeys("vardhan123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("vardhan");
        driver.findElement(By.id("submit-btn")).submit();

        //Wait for new URL to load
        Thread.sleep(5000);

        //Navigate to new URL after login
        driver.get("http://127.0.0.1:8000/checkuserlogin");
        System.out.println(driver.getTitle());


    }
}
