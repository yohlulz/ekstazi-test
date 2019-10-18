package com.tora;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author Ovidiu Maja <ovidiu.maja@tora.com>
 * @version Oct 18, 2019
 */
public class ClassCTest {
    @Test
    public void testC() {
        assertThat(new ClassC("fieldC").field, is("fieldC"));
    }

    @Test
    public void testPath_Test() throws IOException {
        assertThat(Files.lines(Paths.get(ResourceUtils.getURI("file_test.txt"))).count(), not(0));
    }

    @Test
    public void testPath_Code() throws IOException {
        assertThat(Files.lines(Paths.get(ResourceUtils.getURI("file.txt"))).count(), not(0));
    }
}

