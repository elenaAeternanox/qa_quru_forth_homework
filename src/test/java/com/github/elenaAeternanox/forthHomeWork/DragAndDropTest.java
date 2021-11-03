package com.github.elenaAeternanox.forthHomeWork;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class DragAndDropTest {

    @Test
    void dragAndDropElementA() {
        // Open https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Move the rectangle A to place of the rectangle B
        $("#column-a").dragAndDropTo($("#column-b"));
        //Check: A and B have they swapped places
        $("#column-a").shouldHave(text("B"));
    }
}
