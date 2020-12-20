package com.example.sagas

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertEquals("Hello OrderService!", classUnderTest.main(emptyArray()))
    }
}
