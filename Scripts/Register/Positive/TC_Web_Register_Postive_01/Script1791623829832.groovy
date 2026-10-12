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

// Pertama, buka Browser dan navigasi ke halaman Register
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Page_Header/a_Sign In'))

WebUI.click(findTestObject('Page_Register/a_Register Now'))

// Kedua, isi form informasi user
WebUI.setText(findTestObject('Page_Register/input_User ID'), userID)

WebUI.setText(findTestObject('Page_Register/input_New password_password'), new_password)

WebUI.setText(findTestObject('Page_Register/input_Repeat password'), repeat_password)

// Ketiga, isi form informasi akun 
WebUI.setText(findTestObject('Page_Register/input_First name_account.firstName'), first_name)

WebUI.setText(findTestObject('Page_Register/input_Last name_account.lastName'), last_name)

WebUI.setText(findTestObject('Page_Register/input_Email_account.email'), email)

WebUI.setText(findTestObject('Page_Register/input_Phone_account.phone'), phone)

WebUI.setText(findTestObject('Page_Register/input_Address 1_account.address1'), address1)

WebUI.setText(findTestObject('Page_Register/input_Address 2_account.address2'), address2)

WebUI.setText(findTestObject('Page_Register/input_City_account.city'), city)

WebUI.setText(findTestObject('Page_Register/input_State_account.state'), state)

WebUI.setText(findTestObject('Page_Register/input_Zip_account.zip'), zip)

WebUI.setText(findTestObject('Page_Register/input_Country_account.country'), country)

// Ke-empat, submit Form
WebUI.click(findTestObject('Page_Register/btn_saveAcc'))

WebUI.closeBrowser()

