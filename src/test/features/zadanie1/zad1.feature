Feature: Registration on Coders Guru website and Creating new profile

  Scenario: Users can register on Coders Guru website like private user without text message confirmation

    Given an open browser with https://men-men-s-01.codersguru.pl/
    When user clicks "Załóż konto"
    And user enter E-mail "cc@gmail.com"
    And user enter Imię "Janusz"
    And user enter Nazwisko "Kowalski"
    And user enter Hasło "password"
    And user enter Powtórz hasło "password"
    And user enter Miasto "Radom"
    And user enter Kod pocztowy "41-200"
    And user enter Ulica "Warszawska"
    And user enter Numer domu/lokalu "15"
    And user enter Zapoznałem się z regulaminem
    And user clicks button Zarejestruj
    Then user is successfully register
