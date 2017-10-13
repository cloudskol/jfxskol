package com.cloudskol.jfxskol.binding;

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
    }

    public static void handlePropertyChangeEvent(PropertyChangeEvent pe) {
        System.out.println(pe.getPropertyName());

        System.out.println(pe.getOldValue() + " and " + pe.getNewValue());
    }
}
