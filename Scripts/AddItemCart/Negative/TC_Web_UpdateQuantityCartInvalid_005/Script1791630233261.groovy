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

// Kedua, tambahkan Item ke Keranjang (Cat -> Persian -> Add to Cart)
WebUI.click(findTestObject('Page_Catalog/Cat/lbl_cat'))

WebUI.verifyElementPresent(findTestObject('Page_Catalog/Cat/h2_Cats'), 0)

WebUI.click(findTestObject('Page_Catalog/Cat/a_CatPersian'))

WebUI.verifyElementPresent(findTestObject('Page_Catalog/Cat/h2_Persian'), 0)

WebUI.click(findTestObject('Page_Catalog/Cat/a_Add to Cart'))

// Ketiga, masukkan Quantity yang Tidak Valid (Misalnya: 0 atau teks angka minus "-1")
WebUI.setText(findTestObject('Page_Catalog/Cat/input_quantities'), quantityInvalid)

// Ke-empat klik Tombol Update Cart
WebUI.click(findTestObject('Page_Catalog/Cat/btn_updateCartQuantities'))

// Kelima, validasi Negative Case:
// Saat quantity diisi 0/invalid, item terhapus/kuantitas kembali disesuaikan/berada tetap di halaman cart
WebUI.verifyElementPresent(findTestObject('Page_Catalog/Cat/b_Your cart is empty'), 10)

// Ke-enam tutup Browser
WebUI.closeBrowser()

