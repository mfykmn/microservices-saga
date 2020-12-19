package com.examples.sagas

import com.examples.sagas.OrdersServiceMain
import kotlin.test.Test
import kotlin.test.assertEquals

class OrdersServiceMainTest {
    @Test fun testOrdersServiceMainHasAGreeting() {
        val classUnderTest = OrdersServiceMain()
        assertEquals("Hello OrdersService!", classUnderTest.main(emptyArray()))
    }
}
