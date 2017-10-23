package com.cloudskol.jfxskol.binding;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * @author tham
 */

public class DirectionalBinding {
    private IntegerProperty x = new SimpleIntegerProperty(10);
    private IntegerProperty y = new SimpleIntegerProperty(20);

    public void testDirectional() {
        NumberBinding z = x.add(y);
        System.out.println("Value of z = " + z.getValue());

        x.set(20);
        System.out.println("New value of z = " + z.getValue());
    }
}
