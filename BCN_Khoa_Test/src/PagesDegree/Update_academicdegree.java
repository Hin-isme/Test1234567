package PagesDegree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Update_academicdegree {
	public void performActions(WebDriver driver) throws InterruptedException {
       
       // Click vào nút "Thêm mới"
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/a[1]")).click();
       Thread.sleep(2000);
       
       
      
       // Xóa hết ký tự đang tồn tại trong trường nhập liệu
       driver.findElement(By.id("name")).clear();
       // Nhập tên ngành
       driver.findElement(By.id("name")).sendKeys("Test name 01");
       Thread.sleep(2000);
       
       
     //button[contains(text(),'Lưu')]
       driver.findElement(By.xpath("//button[contains(text(),'Lưu')]")).click();
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
