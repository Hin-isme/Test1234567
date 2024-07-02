package PagesTermMajor;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckCreate_HK {
	// Tạo hàm và chuyền vào tham số dong cot driver
	public void checkcreate_hk(int dong, int cot, WebDriver driver) throws IOException, InterruptedException {
		// Mở file Excel và lấy dữ liệu từ sheet đầu tiên
		FileInputStream fis = new FileInputStream("E:\\Auto tester\\BCNK_Automation_Testing\\BCN_Khoa_Test\\resoures\\drivers\\term.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		// Lấy dữ liệu dòng và cột trong file Excel
		XSSFRow row = sheet.getRow(dong);
		String HK = row.getCell(cot).getStringCellValue();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a")).click();
		Thread.sleep(2000);

		// Click vào nút để thêm học kỳ
		driver.findElement(By.xpath("//*[@id=\"tblTerm_wrapper\"]/div[1]/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);

		// Nhập dữ liệu học kỳ
		driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys(HK);
		Thread.sleep(2000);
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
}

}
