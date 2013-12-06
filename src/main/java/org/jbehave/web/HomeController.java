package org.jbehave.web;

import org.jbehave.business.Feedback;
import org.jbehave.business.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	@Autowired
	private FeedbackService feedbackService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("feedbackInfo", new FeedbackForm());
		return "newFeedback";
	}
	
	/**
	 * Simply gets a new stock and shows current status.
	 * @return view.
	 */
	@RequestMapping(value="/", method=RequestMethod.POST )
	public ModelAndView submitForm(@ModelAttribute("feedbackInfo")FeedbackForm feedbackForm) {

		Feedback feedback = new Feedback(feedbackForm.getGiver(), feedbackForm.getReceiver(), feedbackForm.getFeedback());
        feedbackService.add(feedback);
		return  new ModelAndView("showFeedback", "listOfFeedback", feedbackService.getAllFeedback());
	}
	
}

