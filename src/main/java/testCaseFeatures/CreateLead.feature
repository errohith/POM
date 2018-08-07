Feature: TestCases for Create,Delete,Edit,Duplicate and Merge Lead Functionality

#Background: 
#	Given Launch the browser 
#	And   Load the URL 
#	And   set implicitwait 
#	And   maximize the page 

Background:

Given enter the username as DemoSalesManager  

And enter the Password as crmsfa 

And click on Login Button 

And verify the Login Successfully

And Click on CRFlink

Scenario Outline: Create Lead Functionality 

Given click on Create Lead Button

And enter the companyName as <cname>
 
And enter the FirstName as <fname> 

And enter the LastName as <lname>

And enter the phonenumber as <pno>

When Click on submit button

Then Verify the first Name as <verify> 

Examples:
|cname|fname|lname|pno|verify|
|Renault|Rohithkumar|Muthusamy|9629616766|Rohithkumar|


Scenario Outline: Edit lead Functionality

Given Click on Leadstab 

And Click on FindLead link

And Enter the FirstName as <fname>

And Click on Find Lead Button

And Click on first Link

And Click on Edit Button
 
And Enter the localFirstName as <loname>

When Click on Update button 

Then Verify the Local FirstName as <loname1>

Examples: 
|fname|loname|loname1|
|Rohithkumar|vijay|vijay|

Scenario Outline: Delete Functionality

Given Click on Leadstab 

And Click on FindLead link

And Enter the FirstName as <fname>

And Click on Find Lead Button

When Click on first Link

Then Click on Delete Button

Examples:
|fname|
|Rohithkumar|


Scenario Outline: Duplicate Lead


Given Click on Leadstab 

And Click on FindLead link

And Enter the FirstName as <fname>

And Click on Find Lead Button

And Click on first Link

When Click on Duplicate Button

Then Enter the First Name as <fname1> 

And Click on Update Button

And Verify the duplicate First Name as <name> 

Examples:

|fname|fname1|name|
|Rohithkumar|Kumar|Kumar|




