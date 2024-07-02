package PagesChung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	// Tạo hàm và chuyền vào tham số driver
	public void login(WebDriver driver) throws InterruptedException {
		// Lấy id Phần tử và nhấn vào phần tử đó
		driver.findElement(By.id("OpenIdConnect")).click();
	}
}
