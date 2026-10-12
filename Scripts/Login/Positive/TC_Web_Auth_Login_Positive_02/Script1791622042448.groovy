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

// Pertama, buka Browser dan navigasi ke URL utama
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

// Kedua, klik Sign In
WebUI.click(findTestObject('Page_Header/a_Sign In'))

// Ketiga, masukkan Kredensial dari Global Variables
WebUI.setText(findTestObject('Page_Login/input_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Page_Login/input_password'), GlobalVariable.password)

// Ke-empat, klik tombol Login
WebUI.click(findTestObject('Page_Login/btn_login'))

// Kelima, validasi Login Berhasil (Memastikan elemen Welcome muncul)
WebUI.verifyElementPresent(findTestObject('Page_Register/div_Welcome Black'), 10)

// Ke-enam tutup Browser
WebUI.closeBrowser()

