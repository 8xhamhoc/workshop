package org.quangphan.java.workshop.errorhandling.technique3;

public class ClassA {

    private static final ClassB classB = new ClassB();

    public String functionA() {
        return classB.functionB();
    }

}
