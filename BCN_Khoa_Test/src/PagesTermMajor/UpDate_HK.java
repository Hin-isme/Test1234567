package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UpDate_HK {
	// Tạo hàm và chuyền vào tham số driver
	public void update(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[9]/a[1]")).click();
		Thread.sleep(2000);
		// Chọn giá trị từ dropdown menu về năm bắt đầu thúc học kỳ
		WebElement dropdown = driver.findElement(By.id("start_year"));
		Select select = new Select(dropdown);
		select.selectByValue("2021");
		// Chọn giá trị từ dropdown menu về năm kết thúc học kỳ
		WebElement dropdown2 = driver.findElement(By.id("end_year"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("2026");
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
		driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).clear();
		// Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).sendKeys("10");
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
		driver.findElement(By.xpath("//*[@id=\"max_class\"]")).clear();
		// Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"max_class\"]")).sendKeys("2");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]")).click();
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
			System.out.println("cập nhật thành công.");
		} else {
			System.out.println("cập nhật không thành công.");
		}
	}
}
