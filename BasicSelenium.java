package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BasicSelenium{
		

			WebDriver driver;

			public void createLead() throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("LALITHA");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LA");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("TESTER");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lalitha.a5@gmail.com");

				// driver.findElement(By.name("primaryEmail")).sendKeys("lalitha.a5@gmail.com");
				// driver.findElement(By.id("Country"));
				Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
				drpCountry.selectByVisibleText("India");
				Thread.sleep(3000);
				Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				drpState.selectByVisibleText("kARNATAKA");
				// Create Lead
				driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
				Thread.sleep(3000);
				String title = driver.getTitle();

				if (title.contains("View Lead | opentaps CRM")) {
					System.out.println("Lead is succesfully created");
				}

				else {
					System.out.println("Lead is not succesfully created");
				}

			}
			
			public void editLead() throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("LALITHA");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LA");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("TESTER");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lalitha.a5@gmail.com");

				// driver.findElement(By.name("primaryEmail")).sendKeys("lalitha.a5@gmail.com");
				// driver.findElement(By.id("Country"));
				Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
				drpCountry.selectByVisibleText("Australia");
				Thread.sleep(3000);
				Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				drpState.selectByVisibleText("Victoria");
				
				// Create Lead
				driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
			
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Edit']")).click();	
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_description")).sendKeys("Analyst");
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("AnyText");
				driver.findElement(By.xpath("//*[@value='Update']")).click();
				String title = driver.getTitle();

				if (title.contains("View Lead | opentaps CRM")) {
					System.out.println("Lead is succesfully Updated");
				}

				else {
					System.out.println("Lead is not succesfully Updated");
				}
				
				

				
			}
			
			public void DuplicateLead() throws InterruptedException {
				
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("LALITHA");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LA");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("TESTER");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lalitha.a5@gmail.com");

				// driver.findElement(By.name("primaryEmail")).sendKeys("lalitha.a5@gmail.com");
				// driver.findElement(By.id("Country"));
				Select drpCountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
				drpCountry.selectByVisibleText("Australia");
				Thread.sleep(3000);
				Select drpState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				drpState.selectByVisibleText("Victoria");
				// Create Lead
				driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
			
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[text()='Duplicate Lead']")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GOOGLE");
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("R");
				
				driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
				String title = driver.getTitle();
				if (title.contains("View Lead | opentaps CRM")) {
					System.out.println("Lead is succesfully Updated");
				}

				else {
					System.out.println("Lead is not succesfully Updated");
				}
				
			}

			public static void main(String[] args) throws InterruptedException {
				
				BasicSelenium b = new BasicSelenium();
				b.createLead();
				b.editLead();
				b.DuplicateLead();
				
				

			}

		}


