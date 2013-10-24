/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agile.seminar.agileseminarexamples;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LoginStepdefs {
	private final Login system = new Login();
	private String systemStatus = "";

	@Given("^I have a login app with creaditians:$")
	public void I_have_a_login_app_with_creaditians(List<CreaditianRow> items) throws Throwable {
		for (CreaditianRow item : items) {
			system.addCredential(item.name, item.password);
		}
	}

	@When("^I try to login with name (.*) and password (.*)$")
	public void I_try_to_login_with_name_Bartek_and_password_superpass(String name, String password) {
		systemStatus = system.checkCredential(name, password);
	}

	@Then("^System should log me in (.*)$")
	public void System_should_log_me_in_correctly(String status) {
		assertEquals(systemStatus, status);
	}

	public static class CreaditianRow {
		private String name;
		private String password;
	}
	
}
