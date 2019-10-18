package com.tora;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassABTest {

    @Test
    public void testA_bothAB() {
        assertThat(new ClassA("fieldA").toString(), is("fieldA"));
    }

    @Test
    public void testB_bothAB() throws InterruptedException {
        Thread.sleep(3000);
        assertThat(new ClassB("fieldB").toString(), containsString("fieldB"));
    }
}
