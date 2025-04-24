package com.nuutrai.factorio.components

import com.nuutrai.factorio.util.Dir2

interface Connectable {

    var facing: Dir2

    fun connect()

}