Feature: I as a user want to log in to see my balance

  Scenario: Login to the Eribank application
    When I login with username and password
      | username | password |
      | company  | company  |
    Then you can see your balance