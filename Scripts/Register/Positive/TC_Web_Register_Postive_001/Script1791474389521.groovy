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

// Pertama, Buka browser n Navigasi ke halaman Register
WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Object Repository/Page_Header/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Register Now'))

// Kedua, membuat User ID unik yang dinamis agar tidak duplikat
String uniqueUserID = 'user_' + System.currentTimeMillis()

// Ketiga, mengisi form user information
WebUI.setText(findTestObject('Page_Register/input_User ID'), uniqueUserID)

WebUI.setText(findTestObject('Page_Register/input_New password_password'), 'Mine12!!')

WebUI.setText(findTestObject('Page_Register/input_Repeat password'), 'Mine12!!')

// Keempat, mengisi form account information
WebUI.setText(findTestObject('Page_Register/input_First name_account.firstName'), 'Black')

WebUI.setText(findTestObject('Page_Register/input_Last name_account.lastName'), 'White')

WebUI.setText(findTestObject('Page_Register/input_Email_account.email'), 'blackwhite1@gmail.com')

WebUI.setText(findTestObject('Page_Register/input_Phone_account.phone'), '081234567892')

WebUI.setText(findTestObject('Page_Register/input_Address 1_account.address1'), 'Jl. Sudirman No. 1')

WebUI.setText(findTestObject('Page_Register/input_Address 2_account.address2'), 'Menjangan Barat')

WebUI.setText(findTestObject('Page_Register/input_City_account.city'), 'Jakarta')

WebUI.setText(findTestObject('Page_Register/input_State_account.state'), 'DKI Jakarta')

WebUI.setText(findTestObject('Page_Register/input_Zip_account.zip'), '12345')

WebUI.setText(findTestObject('Page_Register/input_Country_account.country'), 'Indonesia')

// Kelima, melakukan submit form
WebUI.click(findTestObject('Page_Register/btn_saveAcc'))

WebUI.closeBrowser()

