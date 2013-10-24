Scenario: multiply x by y
Given a calculator
Given a variable x with value 2
Given a variable y with value 4
When I multiply x by y with calculator
Then result should equal 8

Scenario: add x to y
Given a calculator
Given a variable x with value 10
Given a variable y with value 5
When I add x to y with calculator
Then result should equal 15