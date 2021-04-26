 package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartscreen {
	
	
	
	@FindBy(id="com.kfc.egypt:id/cl_instruction_container")
	WebElement CartAddinstructions;
	
	@FindBy(id="com.kfc.egypt:id/tv_explore")
	WebElement CartExploreMenu;
	
	@FindBy(id="com.kfc.egypt:id/tv_apply")
	WebElement CartApplycoupon;
	
	
	@FindBy(id="com.kfc.egypt:id/tv_coupon_code")
	WebElement CartCouponcode;
	
	@FindBy(id="com.kfc.egypt:id/tv_offer_apply")
	WebElement CartCouponcodeApplyC1;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.kfc.egypt:id/tv_price']")
	WebElement Cartwidgetpricedisplayed;


	@FindBy(id="com.kfc.egypt:id/btn_positive")
	WebElement CartInvalidCouponcodeProceed;
	
	@FindBy(id="com.kfc.egypt:id/btn_negative")
	WebElement CartInvalidCouponcodeReviewCart;
	
	@FindBy(id="com.kfc.egypt:id/tv_dialog_header")
	WebElement CartInvalidCouponcodeHeading;

	@FindBy(id="com.kfc.egypt:id/tv_dialog_msg")
	WebElement CartInvalidCouponcodeMessages;
	
	
	


	
	
	

	
	

}
