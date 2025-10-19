package dev.q4niel

import com.moandjiezana.toml.Toml
import java.io.File

data class ModConfigFile (
    val exhaustionDivider: Double = 100.0,
    val passiveExhaustion: Double = .001
)

object ModConfig {
    var _config: ModConfigFile = ModConfigFile();
    val _cfgFile: File = File("config/${NaturalHungering.modID_}.toml");

    fun get(): ModConfigFile = _config;

    public fun init() {
        if (!_cfgFile.exists()) return;

        val toml = Toml().read(_cfgFile);
        _config = ModConfigFile (
            toml.getDouble("exhaustion_divider", _config.exhaustionDivider),
            toml.getDouble("passive_exhaustion", _config.passiveExhaustion)
        )
    }
}