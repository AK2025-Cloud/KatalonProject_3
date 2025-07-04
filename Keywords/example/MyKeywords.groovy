package example

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {

	@Keyword
	def AppLogin() {
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

		WebUI.click(findTestObject('Page_CURA Healthcare Service_2/btnMake Appointment'))

		WebUI.setText(findTestObject('Page_CURA Healthcare Service_2/txtUsername'), 'John Doe')

		WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service_2/txt_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

		WebUI.click(findTestObject('Page_CURA Healthcare Service_2/btnLogin'))
	}

	@Keyword
	def Congrats (String User) {
		println('Congrats,'+User +"! You have complted this course")
	}
}
