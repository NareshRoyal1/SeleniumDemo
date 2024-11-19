package StepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Base.TestBase;
import Pages.ConduitLoginPage;
import Pages.newArticlePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class conduitStepDef {
	WebDriver driver;
	ConduitLoginPage loginpage;
	newArticlePage newpage;
public conduitStepDef() {
	 driver=TestBase.getDriver();
	loginpage=new ConduitLoginPage(driver);
	newpage=new newArticlePage(driver); 
	
}

	@Given("user is on login page")
	public void iser_is_on_login_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
	}
	@When("user provide {string} and {string}")
	public void user_provide_and(String struser, String strpass) {
		
		loginpage.validLogin(struser, strpass);
		
		
	}
	@Then("user should be on homepage")
	public void user_should_be_on_homepage() {
		loginpage.HomepageCheck();
	    
	}
	@Given("Article detail page must be displayed")
	public void article_detail_page_must_be_displayed() {
	    
	}
	@When("user update article detail")
	public void user_update_article_detail() {
	   
	}
	@Then("Article detail must be updated")
	public void article_detail_must_be_updated() {
	    
	}
	@Given("user should be on Gobal feed page")
	public void user_should_be_on_gobal_feed_page() {
	    
	}
	@When("user select an article\"Artcle title\"")
	public void user_select_an_article_artcle_title() {
	    
	}
	@Then("Aricle must be displayed")
	public void aricle_must_be_displayed() {
	    
	}
	@When("user delete article")
	public void user_delete_article() {
	   
	}
	@Then("Article must be deleted")
	public void article_must_be_deleted() {
	    
	}
	@Given("user should be on new article page")
	public void user_should_be_on_new_article_page() throws InterruptedException {
		newpage.newarticlePage();
	}
	@When("user enters article details")
	public void user_enters_article_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> data=dataTable.asMaps();
		String title=data.get(0).get("title");
		String desc=data.get(0).get("Description");
		String body=data.get(0).get("body");
		String tags=data.get(0).get("tags");
		newpage.CreateNewArticle(title, desc, body, tags);
	    
	}
	@Then("Article must be created")
	public void article_must_be_created() throws InterruptedException {
		newpage.articleCreated();
	   
	}
	
}
