import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click 'Signup / Login' button
//5. Fill all details in Signup and create account
//6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//7. Verify ' Logged in as username' at top
//8. Add products to cart
//9. Click 'Cart' button
//10. Verify that cart page is displayed
//11. Click Proceed To Checkout
//12. Verify Address Details and Review Your Order
//13. Enter description in comment text area and click 'Place Order'
//14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//15. Click 'Pay and Confirm Order' button
//16. Verify success message 'Your order has been placed successfully!'
//17. Click 'Delete Account' button
//18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
