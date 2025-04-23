@file:OptIn(ExperimentalTime::class)

package com.nuutrai.factorio.listeners

import com.nuutrai.factorio.Factorio.Companion.instance
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import java.time.Instant

class Events : Listener {

    @EventHandler
    fun onPlace(e: PlayerInteractEvent) {

        handlePlaceComponent(e)

    }

    private companion object {
        val cooldowns = mutableMapOf<Player?, Instant?>()
        const val TIME_TO_WAIT = 100
        const val TIME_TO_PURGE = 1000

        fun handlePlaceCooldown(p: Player) {

            val cooldown = cooldowns[p] ?: Instant.now().minusMillis(TIME_TO_WAIT.toLong()).also { cooldowns[p] = it}

            /**
             * Checks
             */
            if (cooldown > Instant.now())
                return
            if ((cooldowns[p]?: return).isAfter(Instant.now()))
                return

            Bukkit.getScheduler().runTaskLater(instance, Runnable {
                if ((cooldown).isAfter(Instant.now().minusMillis(TIME_TO_PURGE.toLong()))) return@Runnable
                cooldowns.remove(p)
            }, TIME_TO_PURGE.toLong())


        }
    }

    private fun handlePlaceComponent(e: PlayerInteractEvent) {

        val p = e.player

        if (!verifyWorld(p)) return

        handlePlaceCooldown(p)

    }

    private fun verifyWorld(p: Player): Boolean {
        return true
    }



}