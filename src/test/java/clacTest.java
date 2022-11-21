import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class clacTest {
    @Test
    void testone() throws Exception {

        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        //the connection between the calction to the server
        Thread.sleep(2000);
        driver.findElement(By.id("num8Button")).click();
        driver.findElement(By.id("num7Button")).click();
        driver.findElement(By.id("minusButton")).click();
        driver.findElement(By.id("num2Button")).click();
        driver.findElement(By.id("num2Button")).click();
        driver.findElement(By.id("equalButton")).click();
        System.out.println(driver.findElement(By.id("CalculatorResults")).getAttribute("Name"));
//        int sum = 87-32;
//        System.out.println("CalculatorResults"+":"+sum);
    }
}
