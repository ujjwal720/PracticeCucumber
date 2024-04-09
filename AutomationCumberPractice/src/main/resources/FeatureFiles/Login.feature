Feature: Testing login functionalities with valid data

  Scenario Outline: Testing login feature with valid username and password
    When the user enters the <username> and <passowrd> in the login area
    Then the user should be redirected to the login page

    Examples: 
      | username | password |
      | Aman     | Patel    |
      | Narish   | patel    |
