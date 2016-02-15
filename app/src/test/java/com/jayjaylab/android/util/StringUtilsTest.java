package com.jayjaylab.android.util;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by jjkim on 2016. 2. 15..
 */
public class StringUtilsTest {
    @Test
    public void appendPlusInTail_hello_world() {
        assertThat(StringUtils.appendPlusInTail("hello world"), equalTo("hello world+"));
    }

    @Test
    public void appendPlusInTail_jongjoo() {
        assertThat(StringUtils.appendPlusInTail("jongjoo"), equalTo("jongjoo+"));
    }
}
