package PagesDegree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_academicdegree {
	public void performActions(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000); // Dừng 2 giây
        // Nhập ID
        driver.findElement(By.xpath("//body/div[2]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("252"); // Nhập dữ liệu
        Thread.sleep(2000); // Dừng 2 giây
    }
}
