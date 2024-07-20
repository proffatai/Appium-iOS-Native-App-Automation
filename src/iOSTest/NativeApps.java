package iOSTest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class NativeApps extends BaseClass {
	
	@Test
	public void sampleTest() throws InterruptedException  {
		
//		settingApp();
		photosApp();
		
		
	}
	
	
	public void settingApp() throws InterruptedException {
		Map<String, String>params=new HashMap<String, String>();
		params.put("bundleId","com.apple.Preferences");
		driver.executeScript("mobile:launchApp",params);
		driver.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
		scroll("down");
		driver.findElement(AppiumBy.accessibilityId("Passwords")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell[`name == \"PasswordOptionsCell\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
		Thread.sleep(2000);
	}

	public void photosApp() throws InterruptedException{
		Map<String, String>params=new HashMap<String, String>();
		params.put("bundleId","com.apple.mobileslideshow");
		driver.executeScript("mobile:launchApp",params);
		driver.findElement(AppiumBy.accessibilityId("Photo, 09 October 2009, 10:09 PM")).click();
		swipe("left");
		Thread.sleep(1000);
		swipe("left");
		Thread.sleep(1000);
		swipe("left");
		
		Thread.sleep(1000);
		swipe("left");
		Thread.sleep(2000);
	}
	
	public void acceptPermissions() {
		
	}
	
}
