package com.jarnoharno.library;

import junit.framework.TestCase;

public class ConstantsTest extends TestCase {
    public void testPi() {
        assertEquals(3.14, Constants.pi(), 0.01);
    }
}
