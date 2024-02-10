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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon Sign-In/input_email'), 'anujraaj9472@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon Sign-In/input_password'), 
    'NeRV5R5vumQAh3ll5BJijQ==')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=electronics-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'laptop')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com. Spend less. Smile more/span_gaming'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com  gaming laptop/img_s-image'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com Bmax Laptop 15.6, 16GB DDR4_ae0c02/i_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Adding to Cart_OR/Page_Amazon.com Bmax Laptop 15.6, 16GB DDR4_ae0c02/input_submit.addToCart'))

WebUI.closeBrowser()

