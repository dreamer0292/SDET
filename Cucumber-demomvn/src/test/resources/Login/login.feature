Feature: To validate Login Application

Scenario: To Test login with valid credentials

Given Login page
When Enter valid name "Admin"
And Enter valid pwd "admin123"
And click on submit button
Then I should see the username as "Welcome Nishanth"