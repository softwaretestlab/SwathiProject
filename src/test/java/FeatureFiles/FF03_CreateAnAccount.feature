Feature: Create an account
  Scenario Outline: Creating an account with valid data or called as happypath
    Given user navigates to Create an account screen
    Then Enter valis "<FirstName>","<lastName>","<EmailAddress>"
    Examples:
    |FirstName|lastName|EmailAddress|
    |FirstName01|LastName01|test01@gmail.com|
    |FirstName02|LastName02|test02@gmail.com|