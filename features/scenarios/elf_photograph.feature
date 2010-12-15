Feature: As photographer I want to take a picture of the elves lined up and
  ordered by height

  Scenario: Elves lined up side by side
    Given I am in the forest
    And the elves are not lined up
    When I call the following elves to line up:
    | elf    | height |
    | Kadra  | 6' 20" |
    | Kaslin | 6' 35" |
    | Savah  | 5' 15" |
    Then they line up in the following order:
    | Kaslin |
    | Kadra  |
    | Savah  |
