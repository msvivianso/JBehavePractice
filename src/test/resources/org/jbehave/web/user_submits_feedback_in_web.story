Scenario: User can submit feedback

When Vivian submits a feedback to Chelsea with feedback, 'You are awesome'
Then I should see 'You are awesome'
And I should see Chelsea as the receiver
And I should see Vivian as the giver
