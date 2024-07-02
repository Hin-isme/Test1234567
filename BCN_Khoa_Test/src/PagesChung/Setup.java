package PagesChung;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	// tạo hàm và trả về dữ liệu driver
    public ChromeDriver setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // Lấy chromeProfilePath từ ổ đĩa của máy tính
        String chromeProfilePath = "C:\\Users\\Asus\\AppData\\Local\\Google\\Chrome\\User Data";
        // mở trình duyệt chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + chromeProfilePath);
        
        // Khởi tạo một đối tượng ChromeDriver với các tùy chọn
        ChromeDriver driver = new ChromeDriver(options);
        // vào web với đường đẫn bên dưới
        driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/");
        
        // Phóng to cửa sổ trình duyệt lên kích thước tối đa
        driver.manage().window().maximize();
        Thread.sleep(2000); // Dừng 2 giây
        return driver;
    }
}
