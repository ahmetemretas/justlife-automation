Feature: Home Cleaning Services

  Background: Navigate the website
    Given User navigates the website
    And User logins with valid cridentials

  @aet
  Scenario Outline: Create a booking
    When User selects frequency "<frequency>"
    And User selects duration "<duration>"
    And User selects number of cleaners "<numofcleaners>"
    And User selects materials "<materials>"
    And User indicates specific instructions "<specificInstructions>"
    And User selects cleaner "<cleaner>"
    And User selects date "<date>" and time "<time>"
    And User selects payment method "<payment>"
    And User verifies location "<location>"
    Then User confirm booking

    Examples:
      | frequency | duration | numofcleaners | materials | specificInstructions | cleaner          | date     | time   | payment | location     |
      | One-time  | 2 hours  | 1             | Yes       | ironing              | suggestedCleaner | ASAP     | ASAP   | cash    | Dubai Marina |
      | Weekly    | 2 hours  | 2             | No        | window cleaning      | autoCleaner      | tomorrow | nineAM | cash    | Dubai Marina |
