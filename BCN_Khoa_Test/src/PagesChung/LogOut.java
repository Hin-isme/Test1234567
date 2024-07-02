package PagesChung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	// Tạo hàm và chuyền vào tham số driver
	public void logout(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul/li[2]/a/span/img")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul/li[2]/div/a[2]")).click();
	}
}
