package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final String surname = null;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
}
