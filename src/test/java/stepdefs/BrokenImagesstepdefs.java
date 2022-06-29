package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BrokenImages;

public class BrokenImagesstepdefs {

	BrokenImages brokenimages = new BrokenImages();
	@When("^User clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_link(String brokenimage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    brokenimages.userclicksonlink(brokenimage);
	}

	@Then("^verify the broken images$")
	public void verify_the_broken_images() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    brokenimages.getallbrokenimages();
	}


}
