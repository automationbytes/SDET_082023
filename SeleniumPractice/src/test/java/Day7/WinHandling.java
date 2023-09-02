package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WinHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
        driver.findElement(By.xpath("//a[text()='Meta Store']")).click();
        driver.findElement(By.xpath("//a[text()='Meta Quest']")).click();
        driver.findElement(By.xpath("//a[text()='Instagram']")).click();

        String parentWindow = driver.getWindowHandle(); // first window (facebook)
        Set<String> allWindows = driver.getWindowHandles(); // all open windows includes facebook as well

        System.out.println(allWindows.size());//5

        System.out.println(parentWindow); //pid
        System.out.println(allWindows);//pid of facebook also included along wit other 4

        for(String a : allWindows){
            if (!a.equals(parentWindow)){
                driver.switchTo().window(a);
                Thread.sleep(10000);
                System.out.println("Title is "+driver.getTitle());
                System.out.println("URL is "+driver.getCurrentUrl());

                if (driver.getCurrentUrl().contains("instagram")){
                    driver.findElement(By.name("username")).sendKeys("Tom");
                }

                else {
                    driver.close();
                }


            }
        }



    }
}
