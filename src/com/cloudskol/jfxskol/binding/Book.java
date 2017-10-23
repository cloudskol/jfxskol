package com.cloudskol.jfxskol.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author tham
 */

public class Book {
    private StringProperty title = new SimpleStringProperty(this,
            "title", "Unknown");
}
