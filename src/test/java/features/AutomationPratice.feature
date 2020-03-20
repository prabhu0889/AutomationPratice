Feature: Login to automationpratice application 

Background:

Given Launch the browser
And Load the URL
And Maximise the Browser
And Set the Timeouts

Scenario Outline: TC001_Verfiy the Ordered T-shirts in Order History
And click on Sign in Button on the top rightside corner
And Enter Emailaddress as <EmailAddress>
And Enter Password as <Password>
And Click on SignIn button
Then verify the title of the page is displayed
And click on T-Shirts
And click on the item product is displayed
And click on Add to cart
Then verify switch to childwindow
And click on proceed to checkout
And click on proceed to checkout under the address tab
And click on terms and services checkbox
And click on proceed to checkout under the shipping tab
And click on the Pay by bank wire under the payment tab
And click on confirm my order
And click on Back to order
Then verify the ordered T-shirts in order History
Then close the browser

Examples:
|EmailAddress|Password|
|prabhu0889@gmail.com|Password234|

Scenario Outline:TC002_Update the Personnel information(firstnmae) in my account
And click on Sign in Button on the top rightside corner
And Enter Emailaddress as <EmailAddress>
And Enter Password as <Password>
And Click on SignIn button
And user click on personnel information button
Then user modify the firstname as <firstname>
Then user enter currentpassword as <ctpassword>
Then user enter newpassword as <newpassword>
Then user enter confirmation as <confirmation>
And user click on save button
Then verify the sucess message is displayed
Then close the browser

Examples:
|EmailAddress|Password|firstname|ctpassword|newpassword|confirmation|
|prabhu0889@gmail.com|Password234|Prabhu|Password123|Password123|Password123|

