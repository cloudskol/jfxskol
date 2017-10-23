package com.cloudskol.jfxskol.binding;

import javafx.beans.property.SimpleStringProperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author tham
 */

public class Person {
    private String name;
    private double salary;

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        double oldSalary = this.salary;
        this.salary = salary;

        pcs.firePropertyChange("Salary", oldSalary, salary);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
