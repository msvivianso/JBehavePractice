package org.jbehave.business;


import java.util.List;

public interface FeedbackService {

    void add(Feedback feedback);

    List<Feedback> getAllFeedback();
}
