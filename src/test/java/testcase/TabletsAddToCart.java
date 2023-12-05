package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.baseloaddoc;

public class TabletsAddToCart extends baseloaddoc {
	private TabletsAddToCartPage tabletsAddToCartPage;
	@Test
	public void tabletsToCart(){
		SoftAssert softAssert = new SoftAssert();
		tabletsAddToCartPage = new TabletsAddToCartPage(driver);
		
		tabletsAddToCartPage.ClickTabletsButton();
		
		softAssert.assertTrue(tabletsAddToCartPage.Assertitem());
		System.out.println("Product Name ----- " + tabletsAddToCartPage.AssertItemName());
		
		tabletsAddToCartPage.AddToCartButton();
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertSuccessmessage());
		System.out.println("Sucess message  ----- " + tabletsAddToCartPage.successmessagetxt());
		
		tabletsAddToCartPage.ItemsFromCart();
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertSubTotal());
		System.out.println(tabletsAddToCartPage.AssertSubTotalTxt());
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertEcotax());
		System.out.println(tabletsAddToCartPage.AssertEcoTxt());
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertVat());
		System.out.println(tabletsAddToCartPage.AssertVatTxt());
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertTotalTxt());
		System.out.print(tabletsAddToCartPage.AssertTotalText());
				
		softAssert.assertTrue(tabletsAddToCartPage.AssertTotalPrice());
		System.out.println("     " + tabletsAddToCartPage.AssertTotalPriceDigit());		
	
		tabletsAddToCartPage.CheckoutItem();
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertNotInStock());
		System.out.println(tabletsAddToCartPage.AssertNoStockTxt());	
		
		tabletsAddToCartPage.RemoveItemButton();
		
		softAssert.assertTrue(tabletsAddToCartPage.AssertYourCartIsEmpty());
		System.out.println(tabletsAddToCartPage.AssertCartIsEmptyText());
		
	}
	
}
