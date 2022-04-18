package org.quangphan.java.workshop.errorhandling.technique3;

public class ClassB {

    private static final ClassC classC = new ClassC();

    public String functionB() {
        return classC.functionC();
    }

}
