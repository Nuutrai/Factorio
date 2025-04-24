package com.nuutrai.factorio.components

import com.nuutrai.factorio.util.Dir2

interface Transfers : Connectable {

    val inputs: MutableList<Dir2>
    val outputs: MutableList<Dir2>

    fun hasInput(): Boolean
    fun hasOutput(): Boolean

    fun inputs(): Array<Dir2> {
        throw UnsupportedOperationException("Connecting an input is not supported")
    }

    fun outputs(): Array<Dir2> {
        throw UnsupportedOperationException("Connecting an output is not supported")
    }

    fun connectInput() {
        throw UnsupportedOperationException("Connecting an input is not supported")
    }

    fun connectOutput() {
        throw UnsupportedOperationException("Connecting an output is not supported")
    }

}