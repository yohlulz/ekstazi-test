package com.tora;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassABCTest {
    @Test
    public void testA_bothABC() {
        assertThat(new ClassA("fieldA").toString(), is("fieldA"));
    }

    @Test
    public void testB_bothABC() {
        assertThat(new ClassB("fieldB").toString(), containsString("fieldB"));
    }

    @Test
    public void testC_bothABC() throws InterruptedException {
        assertThat(new ClassC("fieldC").toString(), containsString("fieldC"));
    }
}
