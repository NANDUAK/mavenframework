package maven.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import pom.posibolt_common_scenario;
import utils.browser_management;



public class Stock_demo {
	static String url="http://testclt70.posibolt.org/d/posi";
	static String password="bom1234";
	@Test
	public void f() throws InterruptedException {
		WebDriver d=browser_management.getdriver("FIREFOX",url);	
		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
		obj.setpincodefield(password);
		Thread.sleep(3000);
		obj.setpin();
		Thread.sleep(4000);
		d.findElement(By.id("mainMenuItem4")).click();
		Thread.sleep(4000);
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
		d.quit();}}
//
//	public static void f2() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem110")).click();
//		Thread.sleep(6000);
//
//		d.findElement(By.xpath("//body/form[@id='StockSearch']/div[@id='content']/div[@id='contentContainer']/div[2]/button[1]")).click();
//		Thread.sleep(2000);
//		Select list1=new Select(d.findElement(By.id("group1")));
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("group2")));
//		list2.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list3=new Select(d.findElement(By.id("commodityCode")));
//		list3.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.id("serialNo")).sendKeys("2");
//		Thread.sleep(2000);
//		d.findElement(By.id("lotNo")).sendKeys("2");
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("expDateRange")));
//		list4.selectByIndex(0);
//		Thread.sleep(2000);
//		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
//		//		list5.selectByIndex(1);
//		//		Thread.sleep(2000);
//		d.findElement(By.id("show_1")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check10")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check11")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("okBtn")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("refreshBtn")).click();
//		Thread.sleep(2000);
//		String url=d.getCurrentUrl();
//		System.out.println(url);
//		String actual="http://testclt70.posibolt.org/GetAttributeStockAction.do";
//		Assert.assertEquals(url, actual);  
//		Thread.sleep(5000);
//		d.quit();
//	}
//	@Test
//	public static void f3() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem04")).click();
//		Thread.sleep(8000);
//
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys("test");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
//		Thread.sleep(5000);
//		Alert a=d.switchTo().alert();
//		a.accept();
//		Thread.sleep(4000);
//		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[5]/div[1]")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[4]/div[3]/button[2]/div[1]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")).click();
//		Thread.sleep(4000);
//		d.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]/option[2]")).click();
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
//		Thread.sleep(6000);
//		d.quit();
//	}
//	@Test
//	public static void f4() throws InterruptedException {
//
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem10")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/form[@id='stockMovement']/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/div[1]/button[1]/i[1]")).click();
//		Thread.sleep(2000);
//		Select list1=new Select(d.findElement(By.id("group1")));
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("group2")));
//		list2.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list3=new Select(d.findElement(By.id("commodityCode")));
//		list3.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.id("serialNo")).sendKeys("2");
//		Thread.sleep(2000);
//		d.findElement(By.id("lotNo")).sendKeys("2");
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("expDateRange")));
//		list4.selectByIndex(0);
//		Thread.sleep(2000);
//		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
//		//		list5.selectByIndex(1);
//		//		Thread.sleep(2000);
//		d.findElement(By.id("show_1")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check10")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check11")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/form[@id='stockMovement']/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/div[1]/div[16]/div[1]/div[1]/div[3]/button[1]/span[1]")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("refreshBtn")).click();
//		Thread.sleep(2000);
//		String url=d.getCurrentUrl();
//		System.out.println(url);
//		String actual="http://testclt70.posibolt.org/CustomStockMovementReportAction.do";
//		Assert.assertEquals(url, actual);  
//		Thread.sleep(5000);
//		d.quit();
//	}
//	@Test
//	public static void f5() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem10")).click();
//		Thread.sleep(2000);
//		Select list1=new Select(d.findElement(By.id("filterByList")));
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("groupById")));
//		list2.selectByIndex(1);
//		Thread.sleep(2000);
//		Select list3=new Select(d.findElement(By.id("movementType")));
//		list3.selectByIndex(1);
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("orgId")));
//		list4.selectByIndex(1);
//		Thread.sleep(2000);
//		Select list6=new Select(d.findElement(By.id("locatorId")));
//		list6.selectByIndex(0);
//		Thread.sleep(2000);	
//		Select list7=new Select(d.findElement(By.id("uomCriteria")));
//		list7.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list8=new Select(d.findElement(By.id("dateRange")));
//		list8.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list9=new Select(d.findElement(By.id("productCategoryId")));
//		list9.selectByIndex(1);
//		Thread.sleep(2000);
//		//		WebElement r=d.findElement(By.xpath("//select[@id='timePeriod']"));
//		//		r.sendKeys("a");
//		//		Thread.sleep(2000);
//		//		r.sendKeys(Keys.ENTER);
//		//		Thread.sleep(2000);
//		WebElement r=d.findElement(By.id("warehouseQuery"));
//		r.sendKeys("o");
//		Thread.sleep(2000);
//		r.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.id("barcodeArray")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.id("viewCost")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("refreshBtn")).click();
//		Thread.sleep(3000);
//		String url=d.getCurrentUrl();
//		System.out.println(url);
//		String actual="http://testclt70.posibolt.org/CustomStockMovementReportAction.do";
//		Assert.assertEquals(url, actual);  
//		Thread.sleep(5000);
//		d.quit();
//	}
//	@Test
//	public static void f6() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem115")).click();
//		Thread.sleep(6000);
//
//		Select list1=new Select(d.findElement(By.id("filterByList"))); 
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("orgId")));
//		list2.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list3=new Select(d.findElement(By.id("productCategoryId")));
//		list3.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("warehouseId")));
//		list4.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list5=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/div[@id='shoppingCart']/form[@id='stockReportForm']/div[4]/select[1]")));
//		list5.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list6=new Select(d.findElement(By.id("salesPriceListId")));
//		list6.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list7=new Select(d.findElement(By.id("purchasePriceListId")));
//		list7.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.id("barcodeArray")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.id("refreshBtn")).click();
//		Thread.sleep(5000);
//		d.quit();
//	}
//	@Test
//	public static void f7() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem04")).click();
//		Thread.sleep(6000);
//
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys("test");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
//		Thread.sleep(7000);
//		d.quit();
//	}
//	@Test
//	public static void f8() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem00")).click();
//		Thread.sleep(6000);
//
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		WebElement q=d.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
//		q.sendKeys("10");
//		q.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("741");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		WebElement e=d.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
//		e.sendKeys("10");
//		e.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[2]/div[4]/div[2]/button[1]/div[1]")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//div[contains(text(),'Create New')]")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//body/div[2]/div[4]/div[3]/button[1]")).click();
//		Thread.sleep(2000);
//		Select list1= new Select(d.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")));
//		list1.selectByIndex(1);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//div[contains(text(),'Clear All')]")).click();
//		Thread.sleep(2000);
//		Alert a=d.switchTo().alert();
//		a.accept();
//		Thread.sleep(5000);
//		d.quit();
//	}
//
//	@Test
//	public static void f9() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem11")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/button[1]/i[1]")).click();
//		Thread.sleep(2000);
//		Select list1=new Select(d.findElement(By.id("group1")));
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("group2")));
//		list2.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list3=new Select(d.findElement(By.id("commodityCode")));
//		list3.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.id("serialNo")).sendKeys("2");
//		Thread.sleep(2000);
//		d.findElement(By.id("lotNo")).sendKeys("2");
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("expDateRange")));
//		list4.selectByIndex(0);
//		Thread.sleep(2000);
//		//		Select list5= new Select(d.findElement(By.xpath("//select[@id='prodClassification']")));
//		//		list5.selectByIndex(1);
//		//		Thread.sleep(2000);
//		d.findElement(By.id("show_1")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check10")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("check11")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("okBtn")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[20]/button[1]/span[1]")).click();
//		Thread.sleep(2000);
//		String url=d.getCurrentUrl();
//		System.out.println(url);
//		String actual="http://testclt70.posibolt.org/GetStockAction.do";
//		Assert.assertEquals(url, actual);  
//		Thread.sleep(5000);
//		d.quit();
//
//	}
//	@Test
//	public static void f10() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem11")).click();
//		Thread.sleep(3000);
//		Select list1=new Select(d.findElement(By.id("filterByList")));
//		list1.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list2=new Select(d.findElement(By.id("groupById")));
//		list2.selectByIndex(1);
//		Thread.sleep(2000);
//		Select list4=new Select(d.findElement(By.id("purchasePriceListId")));
//		list4.selectByIndex(1);
//		Thread.sleep(2000);
//		Select list5=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[6]/select[1]")));
//		list5.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list6=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[7]/select[1]")));
//		list6.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[8]/div[1]/button[1]/span[1]")).click();
//		Thread.sleep(3000);
//		WebElement y=d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]"));
//		y.sendKeys("o");
//		Thread.sleep(2000);
//		y.sendKeys(Keys.ENTER); 
//		Thread.sleep(2000);
//		Select list8=new Select(d.findElement(By.id("locatorId")));
//		list8.selectByIndex(0);
//		Thread.sleep(2000);	
//		Select list7=new Select(d.findElement(By.id("uomCriteria")));
//		list7.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[14]/div[1]/button[1]/span[1]")).click();
//		WebElement u=d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[14]/div[1]/div[1]/div[1]/input[1]"));
//		u.sendKeys("hp");
//		Thread.sleep(2000);
//		u.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		Select list11=new Select(d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[15]/select[1]")));
//		list11.selectByIndex(0);
//		Thread.sleep(2000);
//		Select list12=new Select(d.findElement(By.id("qtyFilter")));
//		list12.selectByIndex(0);
//		Thread.sleep(2000);
//		d.findElement(By.id("barcodeArray")).sendKeys("963");
//		Thread.sleep(2000);
//		d.findElement(By.id("valId")).sendKeys("13/05/2021");
//		Thread.sleep(2000);
//		d.findElement(By.id("stockedDate")).sendKeys("13/05/2021");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[4]/div[1]/button[1]/span[1]")).click();
//
//		WebElement r=d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]"));
//		r.sendKeys("*");
//		Thread.sleep(2000);
//		r.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		d.findElement(By.id("quickValuation")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("viewCost")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//body/div[@id='content']/div[@id='contentContainer']/form[@id='StockSearch']/div[1]/div[20]/button[1]")).click();
//		Thread.sleep(5000);
//		String url=d.getCurrentUrl();
//		System.out.println(url);
//		String actual="http://testclt70.posibolt.org/GetStockAction.do";
//		Assert.assertEquals(url, actual);
//		Thread.sleep(5000);
//		d.quit();
//	}
//
//	@Test
//	public static void f11() throws InterruptedException {
//		WebDriver d=browser_management.getdriver("FIREFOX",url);	
//		posibolt_common_scenario obj=PageFactory.initElements(d, posibolt_common_scenario.class);
//		obj.setpincodefield(password);
//		Thread.sleep(3000);
//		obj.setpin();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem4")).click();
//		Thread.sleep(4000);
//		d.findElement(By.id("mainMenuItem05")).click();
//		Thread.sleep(8000);
//		Select list1=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]")));
//		list1.selectByIndex(1);
//		Thread.sleep(3000);
//		Select list2=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
//		list2.selectByIndex(1);
//		Thread.sleep(3000);
//		Select list3=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/select[1]")));
//		list3.selectByIndex(0);
//		Thread.sleep(3000);
//		Select list4=new Select(d.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/select[1]")));
//		list4.selectByIndex(0);
//		Thread.sleep(3000);
//
//		d.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")).click();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//tbody/tr[2]/td[6]/input[1]")).sendKeys("1");
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//div[contains(text(),'Complete')]")).click();
//		Thread.sleep(6000);
//		d.quit();}}
