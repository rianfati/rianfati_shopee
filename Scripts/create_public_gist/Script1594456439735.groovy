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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//login terlebih dahulu
WebUI.openBrowser('https://gist.github.com/')

WebUI.click(findTestObject('Object Repository/rian/sign_in_button'))

WebUI.setText(findTestObject('Object Repository/rian/username'), 'demo33471@gmail.com')
WebUI.setText(findTestObject('Object Repository/rian/password'), 'Asalaja123!')
WebUI.click(findTestObject('Object Repository/rian/submit_sign_in'))
WebUI.click(findTestObject('Object Repository/rian/plus_button'))

WebUI.click(findTestObject('Object Repository/rian/gist_desc'))
String gist_desc = 'public rian 1'
WebUI.setText(findTestObject('Object Repository/rian/gist_desc'), gist_desc)


String gist_textfield = 'just for fun'
WebUI.setText(findTestObject('Object Repository/rian/gist_textfield'), gist_textfield)

WebUI.click(findTestObject('Object Repository/rian/create_submit_button'))

WebUI.click(findTestObject('Object Repository/rian/edit_button'))

gist_textfield = 'just for fun 2'
WebUI.setText(findTestObject('Object Repository/rian/gist_textfield'), gist_textfield)

WebUI.click(findTestObject('Object Repository/rian/update_button'))
WebUI.click(findTestObject('Object Repository/rian/delete_button'))

WebUI.acceptAlert()





