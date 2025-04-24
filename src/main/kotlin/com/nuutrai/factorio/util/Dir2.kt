package com.nuutrai.factorio.util

import org.bukkit.util.Vector

enum class Dir2(vector: Vector) {

    NORTH(Vector(0,0,-1)),
    EAST(Vector(1,0,0)),
    SOUTH(Vector(0,0,1)),
    WEST(Vector(-1,0,0))

}