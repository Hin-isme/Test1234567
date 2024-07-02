package PagesChung;

import org.openqa.selenium.WebDriver;

public class TearDown {
	// Tạo hàm và chuyền vào tham số driver
	public void teardown(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 5 giây
		Thread.sleep(5000);
		// Đóng trình duyệt và kết thúc phiên làm việc
		driver.quit();
	}
}
