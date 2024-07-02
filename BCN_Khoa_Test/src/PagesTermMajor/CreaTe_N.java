package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreaTe_N {
	// Tạo hàm và chuyền vào tham số driver
		public void create(WebDriver driver) throws InterruptedException {
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("//body/div[2]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("//body/div[2]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần
			// tử đó
			driver.findElement(By.xpath("//input[@id='id']")).sendKeys("7480201");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần
			// tử đó
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("CÔNG NGHỆ THÔNG TIN");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần
			// tử đó
			driver.findElement(By.xpath("//input[@id='abbreviation']")).sendKeys("CNTT");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("//span[@id='select2-program_type-container']")).click();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[1]")).click();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
			// tử đó
			driver.findElement(By.xpath("//button[contains(text(),'Lưu')]")).click();
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
