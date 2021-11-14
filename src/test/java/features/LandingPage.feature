Feature: Landing Page Text Control And Skip Button

  Scenario: Landing Pages Get Title and Description
    Given Landing Page Start
    And First Page Get Title
    And First Page Get Description
    When First Page Skip Button
    Then Go To Second Page Get Title
    And Second Page Get Description
    When Second Page Skip Button
    Then Go To Third Page Get Title
    And Third Page Get Description
    When Third Page Skip Button
    And Close Advertising
    Then Go To Home Page



