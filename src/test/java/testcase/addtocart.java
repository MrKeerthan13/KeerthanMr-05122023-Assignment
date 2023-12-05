package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseloaddoc;

public class addtocart extends baseloaddoc{
  @Test
	public void VerifyUserIsAbleToAddToCart(){
	  driver.findElement(By.name("search")).sendKeys("imac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	  driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//h2[text()= 'What would you like to do next?']")).isDisplayed());
	 System.out.println("What would you like to do next");
		
	}
}
