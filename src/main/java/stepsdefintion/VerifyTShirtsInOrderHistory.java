package stepsdefintion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyTShirtsInOrderHistory {
	
	public ChromeDriver driver;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Load the URL")
	public void load_the_URL() {
	    driver.get("http://automationpractice.com");
	}

	@And("Maximise the Browser")
	public void maximise_the_Browser() {
	    driver.manage().window().maximize();
	}

	@And("Set the Timeouts")
	public void set_the_Timeouts() {
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("click on Sign in Button on the top rightside corner")
	public void click_on_Sign_in_Button_on_the_top_rightside_corner() {
		driver.findElement(By.linkText("Sign in")).click();
	   
	}

	@And("Enter Emailaddress as (.*)")
	public void enter_Emailaddress_as(String EmailAddress) {
        driver.findElement(By.id("email")).sendKeys(EmailAddress);
	}

	@And("Enter Password as (.*)")
	public void enter_Password_as(String Password) {
	    driver.findElement(By.id("passwd")).sendKeys(Password);
	}

	@And("Click on SignIn button")
	public void click_on_SignIn_button() {
	  driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

	@Then("verify the title of the page is displayed")
	public void verify_the_title_of_the_page_is_displayed() {
	   String title = driver.getTitle();
	   System.out.println("Title of the Page after login...............");
	   System.out.println("Title of the MyAccount : " +title);
	}

	@And("click on T-Shirts")
	public void click_on_T_Shirts() {
	   driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]")).click();
	}

	@And("click on the item product is displayed")
	public void click_on_the_item_product_is_displayed() {
	   driver.findElement(By.xpath("//a[@class='product-name'][1]")).click();
	  
	}

	@And("click on Add to cart")
	public void click_on_Add_to_cart() {
	  
	  driver.findElement(By.xpath("//button[@class='exclusive']")).click();		    
	}

	@And("verify switch to childwindow")
	public void verify_switch_to_childwindow() {
		
		Set<String> childwindow = driver.getWindowHandles();
		List<String> listofwindows = new ArrayList<String>();
		listofwindows.addAll(childwindow);
		driver.switchTo().window(listofwindows.get(listofwindows.size()-1));
	   
	}
      
	
	@And("click on proceed to checkout")
	public void click_on_proceed_to_checkout() {
	   driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	   
		
	}

	@And("click on proceed to checkout under the address tab")
	public void click_on_proceed_to_checkout_under_the_address_tab() {
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']/span[text()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	}

	@And("click on terms and services checkbox")
	public void click_on_terms_and_services_checkbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@And("click on proceed to checkout under the shipping tab")
	public void click_on_proceed_to_checkout_under_the_shipping_tab() {
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	}

	@And("click on the Pay by bank wire under the payment tab")
	public void click_on_the_Pay_by_bank_wire_under_the_payment_tab() {
	   driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	}

	@And("click on confirm my order")
	public void click_on_confirm_my_order() {
		
	  driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	}

	@Then("click on Back to order")
	public void click_on_Back_to_order() {
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
	   
	}
    
	@Then("verify the ordered T-shirts in order History")
	public void verify_the_ordered_T_shirts_in_order_History() {
		
		WebElement table = driver.findElement(By.id("order-list"));
		/*
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
            for (WebElement allrowsvalues : allrows) {
			
			List<WebElement> allcolums = allrowsvalues.findElements(By.tagName("td"));*/
			
		   for (int i = 1; i <=1; i++) {
			   for (int j = 1; j <=1 ; j++) {
				driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[1]/td["+j+"]")).click();
			}
		}
			
			//driver.findElement(By.xpath("//a[@class='color-myaccount'][1]")).click();
			
			String Expectedtext = driver.findElement(By.xpath("//p[@class='dark']/Strong")).getText();
			
			if(Expectedtext.contains(Expectedtext)) {
				System.out.println("Order History is verified : " +  Expectedtext);
			}else {
				System.out.println("Order History is not verifed : " + Expectedtext);
			}
            }
		
	  
	
            @Then("close the browser")
        	public void close_the_browser() {
        		driver.close();
 
	
}

        	@And("user click on personnel information button")
        	public void user_click_on_personnel_information_button() throws InterruptedException {
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//a[@title='Information']")).click();

        	}

        	@Then("user modify the firstname as (.*)")
        	public void user_modify_the_firstname_as_Prabhu(String firstname) {
        	    driver.findElement(By.id("firstname")).sendKeys(firstname);
        	}

        	@Then("user enter currentpassword as (.*)")
        	public void user_enter_currentpassword_as_Password(String ctpassword) {
        		 driver.findElement(By.id("old_passwd")).sendKeys(ctpassword);
        	}

        	@Then("user enter newpassword as (.*)")
        	public void user_enter_newpassword_as_Password(String newpassword) {
        		driver.findElement(By.id("passwd")).sendKeys(newpassword);
        	}

        	@Then("user enter confirmation as (.*)")
        	public void user_enter_confirmation_as_Password(String confirmation) {
        		driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        	}

        	@Then("user click on save button")
        	public void user_click_on_save_button() {
        	    driver.findElement(By.xpath("//span[text()='Save']")).click();
        	}

        	@Then("verify the sucess message is displayed")
        	public void verify_the_sucess_message_is_displayed() {
        	   WebElement sucessmessage = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
        	   System.out.println("Sucess Message is  : " +sucessmessage.getText() );
        	}

}
