package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeRm {
	// Tạo hàm và chuyền vào tham số driver
	public void term(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/span")).click();
	}
}
