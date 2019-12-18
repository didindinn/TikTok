package com.p.tiktok

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestMainActivity {

    @get:Rule var activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test fun testAddFunctionality() {
        onView(withId(R.id.num1)).perform(typeText("10"))
        onView(withId(R.id.num2)).perform(typeText("20"))
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.calculate)).perform(click())
        onView(withText("30")).check(matches(isDisplayed()))
    }

    @Test fun testSubFunctionality() {
        onView(withId(R.id.num1)).perform(typeText("20"))
        onView(withId(R.id.num2)).perform(typeText("10"))
        onView(withId(R.id.subtract)).perform(click())
        onView(withId(R.id.calculate)).perform(click())
        onView(withText("10")).check(matches(isDisplayed()))
    }
}