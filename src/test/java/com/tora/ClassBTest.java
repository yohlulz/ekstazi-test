package com.tora;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassBTest {
    
    @Test
    public void testB() {
        assertThat(new ClassB("fieldB").toString(), containsString("fieldB"));
    }

    @Test
    public void testB_isModified() throws IOException {
        assertThat(new ClassB("fieldB").isModified(Paths.get(ResourceUtils.getURI("file_test.txt"))), is(true));
    }
}
