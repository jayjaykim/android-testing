package com.jayjaylab.android;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jjkim on 2016. 2. 15..
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityTestRule  activityTestRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testHelloWorldTextViewExistence() {
        // is there hellow world textview in MainActivity
        onView(withText("Hello world!")).check(matches(isDisplayed()));
    }
}
