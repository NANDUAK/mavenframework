package maven.demo;
import org.testng.annotations.Test;
import pom.posibolt_common_scenario;
import utils.browser_management;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Stock {
	public String url="http://testclt70.posibolt.org/d/posi";
	public 	String password="bom1234";
	public String pinn="555";
	@Test
	public void f326() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem110")).click();
		Thread.sleep(6000);
		Select list1=new Select(d.findElement(By.id("filterByList"))); 
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("orgId")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("productCategoryId")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("warehouseId")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		Select list5=new Select(d.findElement(By.id("groupById")));
		list5.selectByIndex(0);
		Thread.sleep(2000);
		Select list6=new Select(d.findElement(By.id("attributeId")));
		list6.selectByIndex(0);
		Thread.sleep(2000);
		Select list7=new Select(d.findElement(By.id("attribute2Id")));
		list7.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("barcode")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.id("showWarehouse")).click();
		Thread.sleep(2000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(5000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			d.quit();}}
	@Test
	public void f328() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem110")).click();
		Thread.sleep(6000);
		d.findElement(By.xpath("//body/form[@id='StockSearch']/div[@id='content']/div[@id='contentContainer']/div[2]/button[1]")).click();
		Thread.sleep(2000);
		Select list1=new Select(d.findElement(By.id("group1")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("group2")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("commodityCode")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("serialNo")).sendKeys("2");
		Thread.sleep(2000);
		d.findElement(By.id("lotNo")).sendKeys("2");
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("expDateRange")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
		//		list5.selectByIndex(1);
		//		Thread.sleep(2000);
		d.findElement(By.id("show_1")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check10")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check11")).click();
		Thread.sleep(2000);
		d.findElement(By.id("okBtn")).click();
		Thread.sleep(2000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(2000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String CurrentUrl=d.getCurrentUrl();
			System.out.println(CurrentUrl);
			String actual="http://testclt70.posibolt.org/GetAttributeStockAction.do";
			Assert.assertEquals(CurrentUrl, actual);  
			Thread.sleep(5000);
			d.quit();}}
	@Test
	public void f334() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem15")).click();
		Thread.sleep(6000);
		Select list1=new Select(d.findElement(By.id("searchBy")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("timePeriod")));
		list2.selectByIndex(1);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("chargeId")));
		list3.selectByIndex(1);
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("orgId")));
		list4.selectByIndex(1);
		Thread.sleep(2000);
		Select list6=new Select(d.findElement(By.id("warehouseId")));
		list6.selectByIndex(0);
		Thread.sleep(2000);	
		Select list7=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/form[1]/div[8]/select[1]")));
		list7.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("productQuery")).sendKeys("963");
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/form[1]/div[10]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/form[1]/div[11]/button[1]/span[1]")).click();
		Thread.sleep(5000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String actual= d.getCurrentUrl();
			Thread.sleep(3000);
			System.out.println(actual);
			String expected="http://testclt70.posibolt.org/StockAdjustmentHistoryAction.do";
			Thread.sleep(3000);
			Assert.assertEquals(actual, expected);
			d.quit();}}
	@Test
	public void f324() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem04")).click();
		Thread.sleep(8000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys("manakav");
		Thread.sleep(2000);
		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
		Thread.sleep(5000);
		Alert a=d.switchTo().alert();
		a.accept();
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[5]/div[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[3]/button[2]/div[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")).click();
		d.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]/option[2]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
		Thread.sleep(6000);
		d.quit();}
	@Test
	public void f144() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem10")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/form[@id='stockMovement']/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/div[1]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		Select list1=new Select(d.findElement(By.id("group1")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("group2")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("commodityCode")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("serialNo")).sendKeys("2");
		Thread.sleep(2000);
		d.findElement(By.id("lotNo")).sendKeys("2");
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("expDateRange")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
		//		list5.selectByIndex(1);
		//		Thread.sleep(2000);
		d.findElement(By.id("show_1")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check10")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check11")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/form[@id='stockMovement']/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/div[1]/div[16]/div[1]/div[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(2000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String CurrentUrl=d.getCurrentUrl();
			System.out.println(CurrentUrl);
			String actual="http://testclt70.posibolt.org/CustomStockMovementReportAction.do";
			Assert.assertEquals(CurrentUrl, actual);  
			d.quit();}}
	@Test
	public void f156() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem10")).click();
		Thread.sleep(2000);
		Select list1=new Select(d.findElement(By.id("filterByList")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("groupById")));
		list2.selectByIndex(1);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("movementType")));
		list3.selectByIndex(1);
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("orgId")));
		list4.selectByIndex(1);
		Thread.sleep(2000);
		Select list6=new Select(d.findElement(By.id("locatorId")));
		list6.selectByIndex(0);
		Thread.sleep(2000);	
		Select list7=new Select(d.findElement(By.id("uomCriteria")));
		list7.selectByIndex(0);
		Thread.sleep(2000);
		Select list8=new Select(d.findElement(By.id("dateRange")));
		list8.selectByIndex(0);
		Thread.sleep(2000);
		Select list9=new Select(d.findElement(By.id("productCategoryId")));
		list9.selectByIndex(1);
		Thread.sleep(2000);
		//			WebElement r=d.findElement(By.xpath("//select[@id='timePeriod']"));
		//			r.sendKeys("a");
		//			Thread.sleep(2000);
		//			r.sendKeys(Keys.ENTER);
		//			Thread.sleep(2000);
		WebElement r=d.findElement(By.id("warehouseQuery"));
		r.sendKeys("o");
		Thread.sleep(2000);
		r.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.id("barcodeArray")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.id("viewCost")).click();
		Thread.sleep(2000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(3000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String CurrentUrl=d.getCurrentUrl();
			System.out.println(CurrentUrl);
			String actual="http://testclt70.posibolt.org/CustomStockMovementReportAction.do";
			Assert.assertEquals(CurrentUrl, actual);  
			Thread.sleep(2000);
			d.quit();}}
	@Test
	public void f327() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem115")).click();
		Thread.sleep(6000);
		Select list1=new Select(d.findElement(By.id("filterByList"))); 
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("orgId")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("productCategoryId")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("warehouseId")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		Select list5=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='stockReportForm']/div[4]/select[1]")));
		list5.selectByIndex(0);
		Thread.sleep(2000);
		Select list6=new Select(d.findElement(By.id("salesPriceListId")));
		list6.selectByIndex(0);
		Thread.sleep(2000);
		Select list7=new Select(d.findElement(By.id("purchasePriceListId")));
		list7.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("barcodeArray")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(5000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			d.quit();}}
	@Test
	public void f331() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem03")).click();
		Thread.sleep(6000);
		WebElement e=d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		e.sendKeys("963");
		Thread.sleep(3000);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select list1 =new Select (d.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]")));
		list1.selectByIndex(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("789456");
		Thread.sleep(3000);
		WebElement r=d.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[2]/input[1]"));
		r.sendKeys("1");
		Thread.sleep(3000);
		r.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[2]")).click();
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f332() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem03")).click();
		Thread.sleep(6000);
		WebElement e=d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		e.sendKeys("963");
		Thread.sleep(3000);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select list1 =new Select (d.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]")));
		list1.selectByIndex(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("789456");
		Thread.sleep(3000);
		WebElement r=d.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[2]/input[1]"));
		r.sendKeys("1");
		Thread.sleep(3000);
		r.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
		d.findElement(By.xpath("//div[contains(text(),'Create New')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[3]/button[1]/div[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/table/tbody/tr[1]/td[2]/select/option[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f337() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin();
		d.findElement(By.id("mainMenuItem4")).click();
		Thread.sleep(2000);
		d.findElement(By.id("mainMenuItem17")).click();
		Thread.sleep(6000);
		Select list1=new Select (d.findElement(By.id("searchBy")));
		list1.selectByIndex(0);
		Thread.sleep(3000);
		Select list2=new Select (d.findElement(By.id("timePeriod")));
		list2.selectByIndex(0);
		Thread.sleep(3000);
		Select list3=new Select (d.findElement(By.id("orgId")));
		list3.selectByIndex(0);
		Thread.sleep(3000);
		Select list4=new Select (d.findElement(By.id("terminalId")));
		list4.selectByIndex(0);
		Thread.sleep(3000);
		Select list5=new Select (d.findElement(By.id("deliveryStatus")));
		list5.selectByIndex(0);
		Thread.sleep(3000);
		Select list6=new Select (d.findElement(By.id("routeId")));
		list6.selectByIndex(0);
		Thread.sleep(3000);
		Select list7=new Select (d.findElement(By.id("shipperId")));
		list7.selectByIndex(0);
		Thread.sleep(3000);
		Select list8=new Select (d.findElement(By.id("uomFilter")));
		list8.selectByIndex(0);
		Thread.sleep(3000);
		Select list9=new Select (d.findElement(By.id("shipmentStatus")));
		list9.selectByIndex(0);
		Thread.sleep(3000);
		Select list10=new Select (d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[15]/select[1]")));
		list10.selectByIndex(0);
		Thread.sleep(3000);
		Select list12=new Select (d.findElement(By.id("regionId")));
		list12.selectByIndex(0);
		Thread.sleep(3000);
		WebElement t=d.findElement(By.id("customerQuery"));
		t.sendKeys("hp");
		Thread.sleep(2000);
		t.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//				WebElement u=d.findElement(By.id("warehouseQuery"));
		//				u.sendKeys("organisation");
		//		
		//				u.sendKeys(Keys.ENTER);
		//				Thread.sleep(3000);
		WebElement p=d.findElement(By.id("productQuery"));
		p.sendKeys("axe");
		Thread.sleep(2000);
		p.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[16]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		WebElement y=d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[16]/div[1]/div[1]/div[1]/input[1]"));
		y.sendKeys("calicut");
		y.sendKeys(Keys.ENTER);	
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[19]/button[1]/span[1]")).click();
		Thread.sleep(8000);
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String CurrentUrl=d.getCurrentUrl();
			System.out.println(CurrentUrl);
			String actual=("http://testclt70.posibolt.org/ShipmentReportAction.do");
			Assert.assertEquals(CurrentUrl, actual);
			Thread.sleep(2000);
			d.quit();}}
	@Test
	public void f338() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		Thread.sleep(2000);
		d.findElement(By.id("mainMenuItem17")).click();
		Thread.sleep(6000);
		Select list1=new Select (d.findElement(By.id("searchBy")));
		list1.selectByIndex(2);
		Thread.sleep(2000);
		Select list2=new Select (d.findElement(By.id("timePeriod")));
		list2.selectByIndex(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[19]/button[1]/span[1]")).click();
		Thread.sleep(8000);
		String CurrentUrl=d.getCurrentUrl();
		System.out.println(CurrentUrl);
		String actual=("http://testclt70.posibolt.org/ShipmentReportAction.do");
		Assert.assertEquals(CurrentUrl, actual);
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f339() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		Thread.sleep(2000);
		d.findElement(By.id("mainMenuItem17")).click();
		Thread.sleep(6000);
		Select list1=new Select (d.findElement(By.id("searchBy")));
		list1.selectByIndex(1);
		Thread.sleep(2000);
		Select list2=new Select (d.findElement(By.id("timePeriod")));
		list2.selectByIndex(0);
		Thread.sleep(3000);
		Select list3=new Select(d.findElement(By.id("deliveryStatus")));
		list3.selectByIndex(5);		
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[19]/button[1]/span[1]")).click();
		Thread.sleep(8000);
		d.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[16]/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(text(),'Print Invoices')]")).click();
		Thread.sleep(2000);
		Alert a1=d.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'Delivery Note Print')]")).click();
		Thread.sleep(2000);
		Alert a2=d.switchTo().alert();
		a2.accept();
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f340() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		Thread.sleep(2000);
		d.findElement(By.id("mainMenuItem17")).click();
		Thread.sleep(6000);
		Select list1=new Select (d.findElement(By.id("searchBy")));
		list1.selectByIndex(1);
		Thread.sleep(2000);
		Select list2=new Select (d.findElement(By.id("timePeriod")));
		list2.selectByIndex(0);
		Thread.sleep(3000);
		Select list3=new Select(d.findElement(By.id("deliveryStatus")));
		list3.selectByIndex(1);		
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='ShipmentReportForm']/div[19]/button[1]/span[1]")).click();
		Thread.sleep(8000);
		d.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[16]/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(text(),'Picklist Print')]")).click();
		Thread.sleep(2000);
		Alert a1=d.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[contains(text(),'Change Details')]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//body/div[@id='deliverySettingsPanel']/div[@id='deliverySettings']/div[1]/div[2]/form[1]/div[1]/div[9]/button[1]/span[1]")).click();
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f323() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem04")).click();
		Thread.sleep(6000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys("test");
		Thread.sleep(2000);
		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
		Thread.sleep(7000);
		d.quit();}
	@Test
	public void f329() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem00")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement q=d.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[2]/input[1]"));
		q.sendKeys("10");
		q.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("741");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement e=d.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[2]/input[1]"));
		e.sendKeys("10");
		e.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[contains(text(),'Create New')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[3]/button[1]")).click();
		Thread.sleep(2000);
		Select list1= new Select(d.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")));
		list1.selectByIndex(1);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(text(),'Clear All')]")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f333() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem16")).click();
		Thread.sleep(6000);
		Select list1=new Select(d.findElement(By.id("searchBy")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("timePeriod")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("warehouseFromId")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("warehouseToId")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		Select list6=new Select(d.findElement(By.id("orgId")));
		list6.selectByIndex(0);
		Thread.sleep(2000);	
		Select list7=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='movementHistoryFilter']/div[8]/select[1]")));
		list7.selectByIndex(0);
		Thread.sleep(2000);
		Select list8=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='movementHistoryFilter']/div[8]/select[1]")));
		list8.selectByIndex(0);
		Thread.sleep(2000);
		Select list9=new Select(d.findElement(By.id("groupBy")));
		list9.selectByIndex(0);
		Thread.sleep(3000);
		d.findElement(By.id("productQuery")).sendKeys("axe");
		Thread.sleep(3000);
		d.findElement(By.id("refreshBtn")).click();
		Thread.sleep(5000);	
		String actual=d.findElement(By.xpath("//span[contains(text(),'Stock Transfer History')]")).getText();
		Thread.sleep(3000);
		System.out.println(actual);
		String expected="STOCK TRANSFER HISTORY";
		Thread.sleep(3000);
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);
		d.quit();}
	@Test
	public void f330() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem00")).click();
		Thread.sleep(6000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[5]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("741");
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[5]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.id("mainMenuItem01")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//thead/tr[1]/th[9]/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(text(),'Merge')]")).click();
		d.findElement(By.id("searchButton")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//thead/tr[1]/th[9]/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(text(),'Stock Clear')]")).click();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//tbody/tr[10]/td[1]/button[1]/span[1]")).click();
		//Thread.sleep(4000);
		//d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='stockUpdateForm']/div[3]/input[2]")).click();
		//Thread.sleep(5000);
		d.quit();}
	@Test
	public void f146() throws Exception {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem11")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		Select list1=new Select(d.findElement(By.id("group1")));
		list1.selectByIndex(0);
		Thread.sleep(2000);
		Select list2=new Select(d.findElement(By.id("group2")));
		list2.selectByIndex(0);
		Thread.sleep(2000);
		Select list3=new Select(d.findElement(By.id("commodityCode")));
		list3.selectByIndex(0);
		Thread.sleep(2000);
		d.findElement(By.id("serialNo")).sendKeys("2");
		Thread.sleep(2000);
		d.findElement(By.id("lotNo")).sendKeys("2");
		Thread.sleep(2000);
		Select list4=new Select(d.findElement(By.id("expDateRange")));
		list4.selectByIndex(0);
		Thread.sleep(2000);
		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
		//		list5.selectByIndex(1);
		//		Thread.sleep(2000);
		d.findElement(By.id("show_1")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check10")).click();
		Thread.sleep(2000);
		d.findElement(By.id("check11")).click();
		Thread.sleep(2000);
		d.findElement(By.id("okBtn")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[21]/button[1]/span[1]")).click();
		Thread.sleep(2000);   
		if (!d.findElements(By.id("Errorbox")).isEmpty())
		{
			String demo=d.findElement(By.id("Errorbox")).getText();
			System.out.println(demo);
			throw new Exception();
		}
		else
		{
			Assert.assertTrue(d.findElements(By.id("Errorbox")).isEmpty());
			System.out.println("assertpass");
			String CurrentUrl=d.getCurrentUrl();
			System.out.println(CurrentUrl);
			String actual="http://testclt70.posibolt.org/GetStockAction.do";
			Assert.assertEquals(CurrentUrl, actual);  
			Thread.sleep(2000);
			d.quit();}}
	@Test
	public void f325() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin(); 
		d.findElement(By.id("mainMenuItem4")).click();
		d.findElement(By.id("mainMenuItem05")).click();
		Thread.sleep(8000);
		Select list1=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]")));
		list1.selectByIndex(1);
		Thread.sleep(3000);
		Select list2=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		list2.selectByIndex(1);
		Thread.sleep(3000);
		Select list3=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/select[1]")));
		list3.selectByIndex(0);
		Thread.sleep(3000);
		Select list4=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/select[1]")));
		list4.selectByIndex(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//tbody/tr[2]/td[6]/input[1]")).sendKeys("1");
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
		Thread.sleep(6000);
		d.quit();}
}
