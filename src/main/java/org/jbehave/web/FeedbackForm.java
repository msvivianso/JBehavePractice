package org.jbehave.web;

public class FeedbackForm {

	private String giver;
	private String receiver;
	private String feedback;

	public String getGiver() {
		return giver;
	}

	public void setGiver(String giver) {
		this.giver = giver;
	}

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getReceiver() {
		return receiver;
	}

	public String getFeedback() {
		return feedback;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((giver == null) ? 0 : giver.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeedbackForm other = (FeedbackForm) obj;
		if (giver == null) {
			if (other.giver != null)
				return false;
		} else if (!giver.equals(other.giver))
			return false;
		return true;
	}
	
}
