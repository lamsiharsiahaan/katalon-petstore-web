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

// Pertama, buka Browser dan Navigasi ke URL utama
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

// Kedua, klik Sign In
WebUI.click(findTestObject('Page_Header/a_Sign In'))

// Ketiga, masukkan Kredensial Salah (yang akan diambil dari variables)
WebUI.setText(findTestObject('Page_Login/input_username'), variable1)

WebUI.setText(findTestObject('Page_Login/input_password'), variable2)

// Ke-empat, klik Tombol Login
WebUI.click(findTestObject('Page_Login/btn_login'))

// Kelima, validasi apakah Pesan error muncul (menandakan login gagal)
WebUI.verifyElementPresent(findTestObject('Page_Login/lb_messagefailed'), 10)

// Ke-enam tutup Browser
WebUI.closeBrowser()

