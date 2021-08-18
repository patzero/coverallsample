package com.example.coverallsample

import org.junit.Assert.assertEquals
import org.junit.Test


class ModelTest {

    @Test
    fun test_model() {
        val model = Model()
        assertEquals("hello", model.data)
    }

    @Test
    fun get_text() {
        val model = Model()
        assertEquals("hello World!!", model.getText())
    }
}