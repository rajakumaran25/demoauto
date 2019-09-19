Feature: Register the account in demo automation testing

  Scenario Outline: Enter the user details
    Given user is in demo automation testing site
    When user enter the details"<fname>","<lname>","<adrs>","<mail>","<phone>","<pass>","<cpass>"
    Then Register successfully or not

    Examples: 
      | fname  | lname   | adrs    | mail              | phone      | pass     | cpass    |
      | raja   | kumaran | chennai | raja@gmail.com    | 7402458544 | 12345678 | 12345678 |
      | shyam  | balaji  | chennai | shyam@gmail.com   | 9864237515 | 12345678 | 12345678 |
      | hazeeb | mhd     | chennai | mhd.hzb@gmail.com | 9967342845 | 12345678 | 12345678 |
