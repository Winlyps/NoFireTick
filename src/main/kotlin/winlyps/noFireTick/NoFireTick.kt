package winlyps.noFireTick

import org.bukkit.plugin.java.JavaPlugin

class NoFireTick : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doFireTick", "false")
        }
        logger.info("NoFireTick plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoFireTick plugin has been disabled.")
    }
}