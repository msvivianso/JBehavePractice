package org.jbehave.business;

public class Feedback {

    private String giver;
	private String receiver;
	private String feedback;
	
	public Feedback(String giver, String receiver, String feedback) {
		this.giver = giver;
        this.receiver = receiver;
        this.feedback = feedback;
	}

    public String getReceiver() {
        return receiver;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getGiver() {
        return giver;
    }
}
