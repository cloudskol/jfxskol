package com.cloudskol.jfxskol.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.beans.PropertyChangeEvent;

/**
 * @author tham
 */

public class BindingEntry {
    public void testBind() {
        final Person person = new Person("Tham", 2000);
        person.addPropertyChangeListener(BindingEntry::handlePropertyChangeEvent);

        person.setSalary(3000);

        person.setSalary(4000);

        final SimpleStringProperty stringProperty = new SimpleStringProperty(this, "Tham", "Arasu");
        System.out.println(stringProperty.getBean().getClass().getName());
        System.out.println(stringProperty.get());
        System.out.println(stringProperty.getName());

        stringProperty.addListener(
                (observable, oldValue, newValue) -> System.out.println("Changed with new value: " + newValue));

        stringProperty.set("Hello");
        System.out.println("Here " + stringProperty.get());
    }

    public static void handlePropertyChangeEvent(PropertyChangeEvent pe) {
        System.out.println(pe.getPropertyName());

        System.out.println(pe.getOldValue() + " and " + pe.getNewValue());
    }
}
