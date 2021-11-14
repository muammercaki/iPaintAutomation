@OtherPage
Feature: Other Page

  Scenario: Other Page Get Title
    Given Go To Other Page
    Then Other Page Get Title

  Scenario: Contact Us
    Given Go To Other Page
    And Click Contact Us Button
    Then Open Contact Us Page
    And Click Write To Us Button
    And Name Field is Filled
    And Email Field is Filled
    And Topic is Selected
    And Write To Message
    And Screen Down Swipe
    And Click Submit Button
    Then Send Message Successfully

  Scenario: Change Language
    Given Go To Other Page
    And Click App Language Button
    And Select English
    Then Change App Language English
    And Second Click App Language Button
    And List Vertical Swipe
    And Select Turkish
    Then Change App Language Turkish





