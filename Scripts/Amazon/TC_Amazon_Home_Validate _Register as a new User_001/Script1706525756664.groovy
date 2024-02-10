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

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Registration/input_customerName'), 
    'DEEPAK KUMAR')

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Registration/input_email'), 
    'anujraaj9472@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Registration/input_password'), 
    'NeRV5R5vumQAh3ll5BJijQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Registration/input_passwordCheck'), 
    'NeRV5R5vumQAh3ll5BJijQ==')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Amazon Registration/inputcontinue'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_code'), 
    '487725')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/span_US 1'))

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/a_India 91'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_cvf_phone_num'), 
    '9905496045')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_cvf_action'))

WebUI.setText(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_code_1'), 
    '257498')

WebUI.click(findTestObject('Object Repository/Amazon_Pages_Register new User_OR/Page_Authentication required/input_cvf_action'))

WebUI.closeBrowser()

