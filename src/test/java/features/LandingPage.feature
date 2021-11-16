Feature: Landing Page Text Control And Skip Button

  Scenario: Landing Pages Get Title and Description
    Given Landing Page Start
    And First Page Get Title "Rahatlayın"
    And First Page Get Description "Birbirinden harika resim koleksiyonumuzdan dilediğinizi seçin ve boyayarak rahatlayın."
    When First Page Skip Button
    Then Go To Second Page Get Title "Yaratıcı Olun"
    And Second Page Get Description "Yaratıcılığınızı konuşturun! Tasarlayacağınız resimleri arkadaşlarınızla paylaşın ve beğeni toplayın."
    When Second Page Skip Button
    Then Go To Third Page Get Title "Muhteşem Paletler"
    And Third Page Get Description "Birbirinden harika renk paletlerini keşfedin. Artık hazırsınız."
    When Third Page Skip Button
    And Close Advertising
    Then Go To Home Page




