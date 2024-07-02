package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnLock_HK {
	// Tạo hàm và chuyền vào tham số driver
	public void unlock(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 5 giây
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[8]/div/input")).click();
		// Dừng thực thi của chương trình trong 1 giây
		Thread.sleep(1000);
		// Lấy xpath thông báo thành công
		WebElement element = driver
				.findElement(By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']"));

		// Lấy giá trị của thuộc tính class
		String classAttributeValue = element.getAttribute("class");

		// Kiểm tra xem classAttributeValue có chứa chuỗi "toast toast-success" hay
		// không
		if (classAttributeValue.contains("toast toast-success")) {
			System.out.println("cập nhật trạng thái thành công.");
		} else {
			System.out.println("cập nhật trạng thái không thành công.");
		}
	}
}
