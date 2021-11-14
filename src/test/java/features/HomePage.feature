@HomePage
Feature: Home Page

  Scenario: Home Page Slider Detail Page and Picture Detail
    Given Home Page Start
    And Slider Image Click
    Then Slider Detail Page
    And Click Picture
    And Color Picture Detail
    And Back To Categories Page
    Then Back To Home Page

  Scenario: Home Page Picture Detail
    Given Home Page Start
    And Home Page Vertical Swipe
    And Tap On Coordinates
    Then Open Picture Detail
    And Back To Categories Page




