package com.nuutrai.factorio.components.impl

import com.nuutrai.factorio.util.Dir2
import com.nuutrai.factorio.components.Transfers

class Conveyor(override var facing: Dir2) : Transfers {

    override val inputs: MutableList<Dir2> = mutableListOf()
    override val outputs: MutableList<Dir2> = mutableListOf()

    init {
        if
    }

    override fun hasInput() = true

    override fun hasOutput() = true

    override fun connect() {
        TODO("Not yet implemented")
    }

    override fun connectInput() {
        super.connectInput()
    }

    override fun connectOutput() {
        super.connectOutput()
    }

    override fun inputs(): Array<Dir2> {
        return arrayOf(facing)
    }

    override fun outputs(): Array<Dir2> {
        return arrayOf(*Dir2.values().filter { it != facing }.toTypedArray())
    }

}