package dev.q4niel.natural_hungering

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object NaturalHungering: ModInitializer {
	const val MOD_ID: String = "natural_hungering";

	fun print(value: String): Unit = _logger.info(value);
    private val _logger: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		print("Hello Fabric world!")
	}
}