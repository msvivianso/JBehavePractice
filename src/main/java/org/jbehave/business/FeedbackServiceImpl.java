package org.jbehave.business;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedbackServiceImpl implements FeedbackService {

    List<Feedback> allFeedback = new ArrayList<Feedback>();

    @Override
    public void add(Feedback feedback) {
        allFeedback.add(feedback);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return allFeedback;
    }

}
