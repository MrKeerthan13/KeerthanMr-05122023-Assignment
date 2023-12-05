package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabletsAddToCartPage {

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsbutton;
	@FindBy(xpath ="//a[text() = 'Samsung Galaxy Tab 10.1']")
	private WebElement tabletitem;
	@FindBy(xpath ="//span[text() = 'Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successmessage;
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement itemsFromCart;
	@FindBy(xpath = "//strong[text()='Sub-Total']")
	private WebElement subTotalText;
	@FindBy(xpath = "//strong[text()='Eco Tax (-2.00)']")
	private WebElement ecoTaxText;
	@FindBy(xpath = "//strong[text()='VAT (20%)']")
	private WebElement vatText;
	@FindBy(xpath = "//strong[text()='Total']")
	private WebElement totalText;
	@FindBy(xpath = "(//td[text()='$241.99'])[2]")
	private WebElement totalPrice;
	@FindBy (xpath = "(//i[@class = 'fa fa-share'])[2]")
	private WebElement checkoutitembutton;
	@FindBy (css =".alert-danger")
	private WebElement notInStockTxt;
	@FindBy (xpath = "//i[@class ='fa fa-times-circle']")
	private WebElement removeitembutton;
	@FindBy (xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement shoppingCartIsEmpty;
	public TabletsAddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickTabletsButton() {
		tabletsbutton.click();
	}
	public boolean Assertitem() {
	return tabletitem.isDisplayed();
	}
	public String AssertItemName() {
		return tabletitem.getText();
	
	
	//String item = tabletitem.getText();
	//System.out.println("Product Name =  " + item);
}
	public void AddToCartButton() {
		addToCartButton.click();
	}
	public boolean AssertSuccessmessage() {
		return successmessage.isDisplayed();
	}
	public String successmessagetxt() {
		return successmessage.getText();
		
		
		//String Success = successmessage.getText();
		//System.out.println(Success +" is displayed");
	
		
	}
	public void ItemsFromCart() {
		itemsFromCart.click();
	}
	public boolean AssertSubTotal() {
		return subTotalText.isDisplayed();
	}
	public String AssertSubTotalTxt() {
		return subTotalText.getText();
		//String subtotal = subTotalText.getText();
		//System.out.println(subtotal +"    ");
	}
	public boolean AssertEcotax() {
		return ecoTaxText.isDisplayed();
	}
	public String AssertEcoTxt() {
		return ecoTaxText.getText();
		//String ecotax = ecoTaxText.getText();
		//System.out.println(ecotax + "    ");
	}
	
	public boolean AssertVat() {
		return vatText.isDisplayed();
	}
	public String AssertVatTxt() {
		return vatText.getText();
		//String vattax = vatText.getText();
		//System.out.println(vattax + "    ");
	}
	public boolean AssertTotalTxt() {
		return totalText.isDisplayed();
	}
	public String AssertTotalText() {
		return 	totalText.getText();
		//String totaltaxprice = totalText.getText();
		//System.out.print(totaltaxprice + "    ");
	}
	public boolean AssertTotalPrice() {
		return totalPrice.isDisplayed();
	}
	public String AssertTotalPriceDigit() {
		return totalPrice.getText();
		
		
		//String totalamount = totalPrice.getText();
		//System.out.println(totalamount + "    ---price should be same $241.99");
	}
	
	public void CheckoutItem() {
		checkoutitembutton.click();
	}
	
	public boolean AssertNotInStock() {
		return notInStockTxt.isDisplayed();
	}
	
	public String AssertNoStockTxt() {
		return notInStockTxt.getText();
		//String NotInStock = notInStockTxt.getText();
		//System.out.println(NotInStock +"  -------  warning is displayed");
	}
	public void RemoveItemButton() {
		removeitembutton.click();
	}
	public boolean AssertYourCartIsEmpty() {
		return shoppingCartIsEmpty.isDisplayed();
	}
	public String AssertCartIsEmptyText() {
		return shoppingCartIsEmpty.getText();
		
		
		//String emptymessage = shoppingCartIsEmpty.getText();
		//System.out.println(emptymessage  +"    ---------- empty popup is displayed");
	}
}
