package org.jbehave.business;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class TradingServiceSteps {

	@Autowired
	private FeedbackService feedbackService = null;
	
	private Feedback feedback;

//	@Given("a feedback of symbol <symbol> and a threshold of <threshold>")
//	public void aStock(@Named("symbol")String symbol, @Named("threshold")double threshold) {
//		feedback = feedbackService.addNewStock(threshold);
//	}
//
//	@When("the feedback is traded at <price>")
//	public void theStockIsTradedAt(@Named("price")double price) {
//		feedback.setTradeAt(price);
//	}
//
//	@Then("the alert status should be <status>")
//	public void theAlertStatusShouldBe(@Named("status")StockAlertStatus status) {
//		assertThat(feedback.getStatus(), equalTo(status));
//	}
	
}
