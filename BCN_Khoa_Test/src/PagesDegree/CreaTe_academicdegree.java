package PagesDegree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreaTe_academicdegree {
	public void performActions(WebDriver driver) throws InterruptedException {
       driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
       Thread.sleep(2000);
       
       // Click vào tab "Học hàm,học vị"
       driver.findElement(By.xpath("//span[contains(text(),'Học hàm, học vị')]")).click();
       Thread.sleep(2000);
       
       // Click vào nút "Thêm mới"
       driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();
       Thread.sleep(2000);
       
       // Nhập ID
       driver.findElement(By.id("id")).sendKeys("252");
       Thread.sleep(2000);
       
       // Nhập tên ngành
       driver.findElement(By.id("name")).sendKeys("Test name");
       Thread.sleep(2000);
       
       
     //Bấm vào lưu
       driver.findElement(By.xpath("//button[contains(text(),'Lưu')]")).click();
       Thread.sleep(2000);
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
