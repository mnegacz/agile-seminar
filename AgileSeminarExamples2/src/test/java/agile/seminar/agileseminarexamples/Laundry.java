/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile.seminar.agileseminarexamples;


import java.util.Date;
import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Bartosz Skuza
 */
public class Laundry {

    private Date now;
    private int days_ago;

   @Given("^today is (.+)$")
    public void today_is(@Format("dd-MM-yyyy")Date date) {
        now=date;
    }

    @Given("^I did laundry (\\d+) days ago$")
    public void I_did_laundry_days_ago(int days) {
        days_ago=days;
    }

    @Then("^my laundry day must have been (.+)$")
    public void my_laundry_day_must_have_been(@Format("dd-MM-yyyy")Date date) {
        Date before=new Date(now.getTime() - days_ago * 24 * 3600 * 1000 );
        assertEquals(date, before);
    }
}
