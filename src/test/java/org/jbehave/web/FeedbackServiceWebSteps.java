package org.jbehave.web;

import org.jbehave.business.Steps;
import org.jbehave.core.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@Steps
public class FeedbackServiceWebSteps {

	@Autowired
	@Qualifier("submitFeedbackPage")
	private SubmitFeedbackPage submitFeedbackPage;
	@Autowired
	@Qualifier("showFeedbackPage")
	private ShowFeedbackPage showFeedbackPage;

    @BeforeScenario
    public void setup() {
        submitFeedbackPage.open();
    }

    @AfterScenario
    public void tearDown() {
        showFeedbackPage.close();
    }

	@When("$giver submits a feedback to $receiver with feedback, '$feedback'")
	public void newFeedbackIsProvided(@Named("giver") String giver, @Named("receiver") String receiver, @Named("feedback") String feedback) {
		submitFeedbackPage.fillForm(giver, receiver, feedback);
		submitFeedbackPage.submitForm();
	}
	@Then("I should see '$feedback'")
	public void feedbackIsDisplayed(@Named("feedback") String feedback) {
		//assertThat(showFeedbackPage.getFeedback(), is(feedback));
        assertTrue(showFeedbackPage.getFeedback().contains(feedback));
	}

    @Then("I should see $receiver as the receiver")
    public void recevierNameIsDisplayed(@Named("receiver") String receiver) {
        //assertThat(showFeedbackPage.getReceiverName(), is(receiver));
        assertTrue(showFeedbackPage.getReceiverName().contains(receiver));
    }

    @Then("I should see $giver as the giver")
    public void giverNameIsDisplayed(@Named("giver") String giver) {
        assertTrue(showFeedbackPage.getGiverName().contains(giver));
    }
}
