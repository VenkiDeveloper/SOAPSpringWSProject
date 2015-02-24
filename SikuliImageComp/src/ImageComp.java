import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Finder;
import org.testng.annotations.Test;

public class ImageComp {

	@Test(enabled=false)
	public void testImages() throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://scripting.jdpoweronline.com/mrIWeb/mrIWeb.dll?I.Project=RESPONSIVE");
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Venky\\JDP\\actual-test-screens\\"
				+ f.getName()));

		// System.out.println(f.getAbsolutePath());

	}

	@Test
	public void compareImagesSikuli() throws IOException{
		
		String expectedImagePath = "C:\\Venky\\JDP\\expected-test-screens\\2.png";
		String actualImagePath = "C:\\Venky\\JDP\\actual-test-screens\\1.png";
		
		Finder f = new Finder(actualImagePath);
		f.find(expectedImagePath);
		if(f.hasNext()){
			
			System.out.println("Both Images are Similar");
		}
		else{
			System.out.println("Both Images are Not Similar");
		}
	}

}
