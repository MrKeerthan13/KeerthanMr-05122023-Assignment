package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseloaddoc;

public class searchitem extends baseloaddoc{
	@Test
public void verifyTheUserSearch() {
	driver.findElement(By.name("search")).sendKeys("Dell");
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Products meeting the search criteria']")).isDisplayed());
	System.out.println("Products meeting the search criteria");
}
}
