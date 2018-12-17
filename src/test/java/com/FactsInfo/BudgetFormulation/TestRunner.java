package com.FactsInfo.BudgetFormulation;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		plugin = {"pretty"},
        features = "src/test/resources/features"
//        ,glue="/budget-formulation-test-automation/src/test/java/com/FactsInfo/BudgetFormulation/pages/stepdefs"
        ,dryRun = false
        ,monochrome = false
        ,tags = { "@cbj-narrative-approval"
        		,"@test-1"
        		, "~@manual"
        		, "~@unreliable" }
)

public class TestRunner {

}

