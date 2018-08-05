Feature: Login into Leaf tabs

Scenario: Postive Login Leaf tabs

Given Launch the Browser
And Maximizi the Browser 
And Load the URL
And Set the TimeOut 
And Enter the userName as DemoSalesManager
And Enter the Password as crmsfa
And Click on Login Button
And Verify the Login Successfully
And Click CRF/SFA
And Click on CreateLead
And Enter Company Name as Renault
And Enter FirstName as Rohith
And Enter LastName as M
When Click on Create Lead
Then Verify the First Name
And Close the Browser 


