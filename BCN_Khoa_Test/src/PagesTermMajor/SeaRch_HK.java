package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeaRch_HK {
	// Tạo hàm và chuyền vào tham số driver
	public void search(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"tblTerm_filter\"]/label/input")).sendKeys("888");
	}
}
