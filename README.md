# Selenuim_Automation

## Page Object Model using selenium Webdrive and Implementation
 - Company use this method to store locators and methods in seperate java class file and use same class in different test scripts. 
 - it is just a design pattern not a framework
 - there are multiple design pattern available for java like Singleton design pattern, Structural design pattern and so on.

### Why Page Object Model using Selenium WebDriver
 - design pattern which helps to maintain the code and avoid code duplication
 - can store locators and respective methods in seperate class and call them within the test in
 - can create a layer between your test scripts and application page, 

### Implementation of Page Object model (POM) using Selenium Webdriver
 There are two ways of implementing POM:
 1. Page Object Model without PageFactory
 2. Page Object Model with PageFactory

#### Page Object Model without PageFactory
lets, think practically, if application have a login page where username, password and login button is present. User will create a seperate POM_without_Pagefactory 
java class and will store three locators, and we will create methods to access them. User need to design a test case so that they can use the login class, which is created
and call the methods accordingly. If any changes happen in DOM then user need not to change the whole test cases but have to update only login class.

Example of POM without PageFactory:

[link for library] (https://github.com/devrajadhikari333/Selenuim_Automation/blob/main/src/gmail_login_page/POM_without_Pagefactory.java)

[link for test Script] (https://github.com/devrajadhikari333/Selenuim_Automation/blob/main/src/gmail_testScripts/verify_gmail_login.java)

#### Page Object Model with PageFactory
PageFactory is the built-in class in Selenium. It has a seperate method to initialize web element of page object
is initElement. One of the important feature of Page Factory is Cache feature that will store all frequently used
WebElement in cache. 

Example of POM without PageFactory:

[link for library] (https://github.com/devrajadhikari333/Selenuim_Automation/blob/main/src/gmail_login_page/POM_with_PageFactory.java)

[link for browserFactory class file] (https://github.com/devrajadhikari333/Selenuim_Automation/blob/main/src/browserFactory/browserFactory.java)

[link for test Script] (https://github.com/devrajadhikari333/Selenuim_Automation/blob/main/src/gmail_testScripts/testScript_with_Pagefactory.java)
