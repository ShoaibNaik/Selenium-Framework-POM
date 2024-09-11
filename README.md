
# Selenium Framework POM

### Test Execution Steps:

- For this project, I used Eclipse IDE in which I created a Maven project
- I added Maven dependencies for Selenium-Java, test-ng, webdriver manager, and bonigarcia for extent reports by aventstack
- Create packages in src/main/java folder. Packages include: base, pageEvents, pageObjects and Utils
- Create qa.tests package for writing Test cases in src/test/java folder
- Create BaseTest class in base package
- Create all the files according to the project requirements
- After writing Testcases, convert the qa.tests package to Testng which will generate a suite
- That's it..!! Run the test scenarios

### Assumptions:

- For checking the Login functionality, I assumed differnt combinations for testing the functionality like 
  - checking the condition with valid and invalid credentials 
  - writing nothing and checking the software behaviour
  - entering different patterns including '*', '@', etc.

### Additional informtion:

- While creating test scenarios in login functionality, after entering emailID in inappropriate format, it should generate an error message as 'Enter valid email id'
- However, while testing the application it gave the popup after clicking on the login button
