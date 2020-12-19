package com.examples.sagas

import kotlin.test.Test
import kotlin.test.assertEquals

class OrderServiceMainTest {
    @Test fun testOrderServiceMainHasAGreeting() {
        val classUnderTest = OrderServiceMain()
        assertEquals("Hello OrderService!", classUnderTest.main(emptyArray()))
    }
}
