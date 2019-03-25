package com.example.demo.Test;

import static org.junit.Assert.assertEquals;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Stepdefs {
    private int var1;
    private int var2;
    private int actualAnswer;

    @Given("^I have variable a$")
    public void today_var1() {
        this.var1 = 10;
    }
    
    @And("^I have variable b$")
    public void today_var2() {
        this.var2 = 20;
    }

    @When("^I multiplication a and b$")
    public void i_ask_whether_it_s_Friday_yet() {
       this.actualAnswer = this.var1 * this.var2;
    }

    @Then("^I display the Result$")
    public void i_should_be_told() {
       assertEquals(this.actualAnswer, 200);
    }
}