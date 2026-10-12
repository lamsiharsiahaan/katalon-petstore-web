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

// Pertama, buka Browser & Navigasi ke URL utama
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

// Kedua, cek navigasi ke Kategori Fish -> Pilih Produk Angelfish
WebUI.click(findTestObject('Page_Catalog/Fish/lbl_Fish'))

WebUI.verifyElementPresent(findTestObject('Page_Catalog/Fish/h2_Fish'), 0)

WebUI.click(findTestObject('Page_Catalog/Fish/a_FI-SW-01'))

// Ketiga, klik Tombol Add to Cart
WebUI.click(findTestObject('Page_Catalog/Fish/a_Add to Cart'))

// Ke-empat validasi apakah halaman Shopping Cart terbuka dan item masuk
WebUI.verifyElementPresent(findTestObject('Page_Catalog/Fish/h2_Shopping Cart'), 10)

// Kelima, tutup Browser
WebUI.closeBrowser()

