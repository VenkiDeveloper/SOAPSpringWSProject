import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.im4java.core.ImageCommand;
import org.im4java.process.StandardStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginPage {

	@Test(enabled = false)
	public void gmailLogin() throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://scripting.jdpoweronline.com/mrIWeb/mrIWeb.dll?I.Project=RESPONSIVE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Venky\\JDP\\actual-test-screens\\"
				+ f.getName() + ".png"));

		/*
		 * String actualTitle = driver.getTitle();
		 * 
		 * Assert.assertEquals(actualTitle, "Gmail");
		 * 
		 * WebElement email = driver.findElement(By.id("Email")); email.clear();
		 * email.sendKeys("vamshi@atmecs.com");
		 * 
		 * WebElement pwd = driver.findElement(By.name("Passwd")); pwd.clear();
		 * pwd.sendKeys("asdhasbdjas");
		 * 
		 * WebElement signInBtn =
		 * driver.findElement(By.xpath("//input[@type='submit']"));
		 * signInBtn.click();
		 * 
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 * 
		 * WebElement errorMsg = driver.findElement(By.id("errormsg_0_Passwd"));
		 * String actualErrorMsg = errorMsg.getText();
		 * 
		 * //Assert.assertEquals(actualErrorMsg,
		 * "The email or password you entered is incorrect. ?");
		 * Assert.assertTrue(actualErrorMsg.contains("incorrect"));
		 */
		driver.quit();
	}

	@Test
	public void imageComparison() {

		String actualFileName = "C:\\Venky\\JDP\\screen1.png";
		String expectedFileName = "C:\\Venky\\JDP\\screen2.png";
		String differenceFileName = "C:\\Venky\\JDP\\screen3.png";
		
	System.out.println("$$$$$$$$"+compareImages(actualFileName, expectedFileName, differenceFileName));

		
	}

	/*public boolean compareImage(File fileA, File fileB) throws IOException{

		try {
			// take buffer data from botm image files //
			BufferedImage biA = ImageIO.read(fileA);
			DataBuffer dbA = biA.getData().getDataBuffer();
			int sizeA = dbA.getSize();
			System.out.println("Size A"+sizeA);
			BufferedImage biB = ImageIO.read(fileB);
			DataBuffer dbB = biB.getData().getDataBuffer();
			int sizeB = dbB.getSize();
			System.out.println("size B"+sizeB);
			// compare data-buffer objects //
			if (sizeA == sizeB) {
				for (int i = 0; i < sizeA; i++) {
					if (dbA.getElem(i) != dbB.getElem(i)) {
						return false;
					}
				}
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Failed to compare image files ...");
			return false;
		}
	}*/
	
	
	boolean compareImages (String exp, String cur, String diff) {
		// create command
		ConvertCmd cmd = new ConvertCmd();

		// create the operation, add images and operators/options
		IMOperation op = new IMOperation();
		op.addImage(exp); // source file
		
	//	op.addImage(cur); // destination file file

		try {
			System.out.println("try");
			cmd.run(op);
			return true;
		} catch (IOException | InterruptedException | IM4JavaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		}

}
