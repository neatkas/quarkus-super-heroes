package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ConfigUtils;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

@ApplicationScoped
public class VillainApplicationLifeCycle {
    private static final Logger LOG = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOG.info(" __     ___ _ _       _             _    ____ ___ ");
        LOG.info(" \\ \\   / (_) | | __ _(_)_ __       / \\  |  _ \\_ _|");
        LOG.info("  \\ \\ / /| | | |/ _` | | '_ \\     / _ \\ | |_) | | ");
        LOG.info("   \\ V / | | | | (_| | | | | |   / ___ \\|  __/| | ");
        LOG.info("    \\_/  |_|_|_|\\__,_|_|_| |_|  /_/   \\_\\_|  |___|");
        LOG.info("The application VILLAIN is starting with profile " + ConfigUtils.getProfiles());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOG.info("The application VILLAIN is stopping...");
    }
}
