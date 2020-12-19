package com.examples.sagas

import kotlin.test.Test
import kotlin.test.assertEquals

class OrdersServiceMainTest {
    @Test fun testOrdersServiceMainHasAGreeting() {
        val classUnderTest = OrdersServiceMain()
        assertEquals("Hello OrdersService!", classUnderTest.main(emptyArray()))
    }
}
