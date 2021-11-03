package com.github.elenaAeternanox.forthHomeWork;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FindJunit5SoftAssertionsExampleTest {

    @Test
    void shouldFindJUnit5SoftAssertionsExample() {
        // Open Selenide page in Github
        open("https://github.com/selenide/selenide");
        // Go to project's section Wiki
        $("#wiki-tab").$(byText("Wiki")).click();
        // Check: there's the SoftAssertions page in the list of pages
        $("#wiki-pages-filter").setValue("Soft assertions");
        var softAssertionsFound = $(byText("Soft assertions")).shouldBe(visible);
        // Open the SoftAssertions page
        softAssertionsFound.click();
        // Check: there's an example of code for JUnit5
        $$("div ol").findBy(text("Using JUnit5 extend test class:")).closest("div")
                .$("pre").shouldBe(visible);
    }
}
