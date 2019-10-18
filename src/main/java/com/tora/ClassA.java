package com.tora;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassA {
    private final String field;

    public ClassA(String field) {this.field = field;}

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return field;
    }
}
