@UITesting
Feature: homepage validation

Scenario: Home page testing
 Given opening chrome and store
 When open the website
 Then validate title
 
 Scenario: Book Store applicaton
 Given open Book Store application
 When  Book Store application
 Then validate and check git pocket guide
 
 Scenario: accessing element option
 Given open element option
 When  left click on element option
 Then validate to element and dropdown appears
 
  Scenario: what is inside text box
 Given open text box
 When  left click on text box
 Then validate to text box option
 
 
 
   Scenario: what is inside check box
 Given open check box
 When  left click on check box
 Then validate to check box option
 
     Scenario: check Logo
 Given click on logo
 When  navigate to homepage
 Then validate homepage
 
  #Scenario: what is inside button
 #Given open button
 #When  left click on button
 #Then validate to button page
 #
     #Scenario: what is inside forms
 #Given open forms page
 #When  left click on form option
 #Then validate to page inside form
 
     #Scenario: alter,frame and windows
 #Given open alter
 #When  left click on alter
 #Then validate to 
 
    #Scenario: what is inside widgets
 #Given open widgets
 #When  left click on widgets
 #Then validate to widgets page
 
     #Scenario: selecting interaction option 
 #Given open interactions
 #When  left click on interactions
 #Then validate to interactions