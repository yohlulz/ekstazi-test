package com.tora;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassB {
    protected final String field;

    public ClassB(String field) {this.field = field;}

    public String getField() {
        return field;
    }

    public boolean isModified(Path path) throws IOException {
        return Files.lines(path).anyMatch(line -> line.equalsIgnoreCase("value=modify"));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + field;
    }

}
