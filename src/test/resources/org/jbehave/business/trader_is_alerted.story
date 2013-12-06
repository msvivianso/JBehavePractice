Scenario:  trader should be not alerted below receiver and should be alerted above receiver
 
Given a feedback of symbol <symbol> and a receiver of <receiver>
When the feedback is traded at <price>
Then the alert status should be <status>

Examples:
|symbol|receiver|price|status|
|STK1|5|4|OFF|
|STK1|5|14|ON|
