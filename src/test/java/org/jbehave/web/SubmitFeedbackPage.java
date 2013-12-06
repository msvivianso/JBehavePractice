package org.jbehave.web;

import org.springframework.beans.factory.annotation.Autowired;

public class SubmitFeedbackPage {

	private static final String GIVER = "giver";
	private static final String RECEIVER = "receiver";
	private static final String FEEDBACK = "feedback";
	private static final String SUBMIT_FORM_ID = "submit";
	
	private String stockUrl;
	@Autowired
	private PageUtils pageUtils;
	
	public void open() {
		pageUtils.open(this.stockUrl);
	}
	
	public void fillForm(String giver, String receiver, String feedback) {
		pageUtils.fillFormField(GIVER, giver);
		pageUtils.fillFormField(RECEIVER, receiver);
		pageUtils.fillFormField(FEEDBACK, feedback);
	}
	
	public void submitForm() {
		pageUtils.submitForm(SUBMIT_FORM_ID);		
	}
	
	public void setStockUrl(String url) {
		this.stockUrl = url;
	}
	
}
