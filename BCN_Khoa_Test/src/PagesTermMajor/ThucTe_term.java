package PagesTermMajor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThucTe_term {
	// Tạo hàm và chuyền vào tham số driver
	public void thucte1(WebDriver driver) throws InterruptedException {
		// lấy xpath lỗi
		WebElement Loi = driver.findElement(By.xpath("//*[@id=\"id-error\"]"));
		String mongdoi = "Vui lòng nhập đúng 3 kí tự!"; // Chuỗi kỳ vọng thông báo lỗi
		System.out.println("Kết quả mong đợi: " + mongdoi); // In ra kết quả mong đợi của thông báo lỗi
		System.out.println("Kết quả thực tế: " + Loi.getText()); // In ra kết quả thực tế của thông báo lỗi
	}

	public void thucte2(WebDriver driver) throws InterruptedException {
		// lấy xpath lỗi
		WebElement Loi = driver.findElement(By.xpath("//*[@id=\"id-error\"]"));
		String mongdoi = "Vui lòng nhập đúng 3 kí tự!"; // Chuỗi kỳ vọng thông báo lỗi
		System.out.println("Kết quả mong đợi: " + mongdoi); // In ra kết quả mong đợi của thông báo lỗi
		System.out.println("Kết quả thực tế: " + Loi.getText()); // In ra kết quả thực tế của thông báo lỗi
	}

	public void thucte3(WebDriver driver) throws InterruptedException {
		// lấy xpath lỗi
		WebElement Loi = driver.findElement(By.xpath("//*[@id=\"id-error\"]"));
		String mongdoi = "Vui lòng nhập đúng 3 kí số không được nhập kí tự đặc biệt!"; // Chuỗi kỳ vọng thông báo lỗi
		System.out.println("Kết quả mong đợi: " + mongdoi); // In ra kết quả mong đợi của thông báo lỗi
		System.out.println("Kết quả thực tế: " + Loi.getText()); // In ra kết quả thực tế của thông báo lỗi
	}

	public void thucte4(WebDriver driver) throws InterruptedException {
		// lấy xpath lỗi
		WebElement Loi = driver.findElement(By.xpath("//*[@id=\"id-error\"]"));
		String mongdoi = "Bạn chưa nhập học kỳ"; // Chuỗi kỳ vọng thông báo lỗi
		System.out.println("Kết quả mong đợi: " + mongdoi); // In ra kết quả mong đợi của thông báo lỗi
		System.out.println("Kết quả thực tế: " + Loi.getText()); // In ra kết quả thực tế của thông báo lỗi
	}
}
