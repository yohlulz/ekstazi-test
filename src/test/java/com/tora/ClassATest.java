package com.tora;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassATest {
    @Test
    public void testA() throws InterruptedException {
        Thread.sleep(3000);
        assertThat(new ClassA("fieldA").toString(), is("fieldA"));
    }

}
