package org.jbehave.web;

import org.springframework.beans.factory.annotation.Autowired;


public class ShowFeedbackPage {

    private static final String FEEDBACK = "result";
    private static final String GIVER = "result";
    private static final String RECEIVER = "result";
    @Autowired
	private PageUtils pageUtils;
	
	public String getFeedback() {
		return pageUtils.getElementText(FEEDBACK);
	}

    public String getGiverName() {
        return pageUtils.getElementText(GIVER);
    }

    public String getReceiverName() {
        return pageUtils.getElementText(RECEIVER);
    }

    public void close() {
        pageUtils.close();
    }
}
