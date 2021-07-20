Feature: To validate Login Application

Background:
Given Login page


#Scenario: To Test login with valid credentials

#Given Login page
##When Enter valid name "Admin"
#And Enter valid pwd "admin123"
#And click on submit button
#Then I should see the username as "Welcome Nishanth"

Scenario Outline: To test login with different test data
When Enter valid name "<name>"
And Enter valid pwd "<pwd>"
And click on submit button
Then I should see the username as "<loginname>"

#this will be like data driven test
Examples:
|name |pwd     |loginname|
|Admin|admin123|Welcome Nishanth|
|Admin|admin123|Welcome Paul|


Scenario: To test login with invalid credentials 
When Enter invalid name "rashmi"
And Enter invalid pwd "rashmi"
And click on submit button
Then I should see the invalidusername as "Invalid credentials"