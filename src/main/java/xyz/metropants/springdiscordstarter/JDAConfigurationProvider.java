package xyz.metropants.springdiscordstarter;

import net.dv8tion.jda.api.JDA;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Provides the JDA bean using the {@link JDAConfiguration} interface.
 */
@AutoConfiguration
public class JDAConfigurationProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(JDAConfigurationProvider.class);

    private final JDAConfiguration configuration;

    public JDAConfigurationProvider(@NotNull JDAConfiguration configuration) {
        this.configuration = configuration;
    }

    @Bean
    public JDA jda(@Value("${discord.bot.token}") String token) throws InterruptedException {
        final String configurationName = this.configuration.getClass().getSimpleName();
        LOGGER.info("Loaded JDA with {} configuration.", configurationName);

        return this.configuration.configure(token);
    }

}
