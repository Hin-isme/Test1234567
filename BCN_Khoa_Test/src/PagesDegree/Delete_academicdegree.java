package PagesDegree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_academicdegree {
	public void performActions(WebDriver driver) throws InterruptedException {
        // Click vào nút "Xóa"
        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[2]/i[1]")).click(); // Click vào một phần tử
        Thread.sleep(2000); // Dừng 2 giây

        // Click vào nút "Xoá"
        driver.findElement(By.xpath("//button[contains(text(),'Xoá')]")).click(); // Click vào một phần tử
        Thread.sleep(2000); // Dừng 2 giây
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
     			System.out.println("Xóa thành công.");
     		} else {
     			System.out.println("Xóa không thành công.");
     		}
    }
}
