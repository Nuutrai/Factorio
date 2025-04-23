package com.nuutrai.factorio

import org.bukkit.plugin.java.JavaPlugin

class Factorio : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic

        instance = this

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    companion object {
        lateinit var instance: Factorio
    }

}
