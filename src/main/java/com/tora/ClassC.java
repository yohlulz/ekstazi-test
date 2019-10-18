package com.tora;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassC extends ClassB {

    public void get() {

    }

    @Override
    public boolean isModified(Path path) throws IOException {
        return super.isModified(path);
    }

    public ClassC(String field) {super(field);}
}
