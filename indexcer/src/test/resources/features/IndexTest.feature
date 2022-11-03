Feature: Index
    Scenario Outline: Whenever Rental is FileUploaded, Indexed
        Given FileUploaded ( ) is published and  ( ) is present
        When 
        Then Indexed ( ) should publish

        Examples:
            |
            |      |   |    |


