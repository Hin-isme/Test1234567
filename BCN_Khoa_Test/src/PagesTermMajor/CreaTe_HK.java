package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreaTe_HK {
	// Tạo hàm và chuyền vào tham số driver
	public void create(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"tblTerm_wrapper\"]/div[1]/div[2]/div/div[2]/button")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("888");
		// Chọn giá trị từ dropdown menu về năm bắt đầu thúc học kỳ
		WebElement dropdown = driver.findElement(By.id("start_year"));
		Select select = new Select(dropdown);
		select.selectByValue("2020");
		// Chọn giá trị từ dropdown menu về năm kết thúc học kỳ
		WebElement dropdown2 = driver.findElement(By.id("end_year"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("2025");
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
		driver.findElement(By.xpath("//*[@id=\"start_week\"]")).clear();
		// Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"start_week\"]")).sendKeys("1");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[5]/input[2]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[5]")).click();
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
		driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).clear();
		// Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).sendKeys("5");
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
		driver.findElement(By.xpath("//*[@id=\"max_class\"]")).clear();
		// Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"max_class\"]")).sendKeys("3");
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
		// tử đó
		driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]")).click();
		// Dừng thực thi của chương trình trong 1 giây
		Thread.sleep(1000);
		try {
			// Tìm phần tử theo xpath
			WebElement element = driver
					.findElement(By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']"));

			// Lấy giá trị của thuộc tính class
			String classAttributeValue = element.getAttribute("class");

			// Kiểm tra xem classAttributeValue có chứa chuỗi "toast toast-success" hay
			// không
			if (classAttributeValue.contains("toast toast-success")) {
				System.out.println("Lưu thành công.");
			}
		} catch (Exception e) {
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("//button[@id='btnClose']")).click();
			System.out.println("Học kỳ này đã được tạo trong hệ thống.");
		}
	}
}
