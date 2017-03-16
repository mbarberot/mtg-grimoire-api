package org.github.mbarberot.mtg.grimoire.api.services.impl

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.provider
import org.github.mbarberot.mtg.grimoire.api.json.JsonEngine
import org.github.mbarberot.mtg.grimoire.api.services.Service

class JsonEngineService : Service {
    override fun init() {
    }

    override fun registerModule(): Kodein.Module {
        return Kodein.Module {
            bind<JsonEngine>() with provider { JsonEngine() }
        }
    }
}