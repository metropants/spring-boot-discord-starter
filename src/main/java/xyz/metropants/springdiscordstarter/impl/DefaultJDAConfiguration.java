package xyz.metropants.springdiscordstarter.impl;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import xyz.metropants.springdiscordstarter.JDAConfiguration;

/**
 * Default JDA configuration if a custom configuration isn't provided.
 */
@Component
public class DefaultJDAConfiguration implements JDAConfiguration {

    @Override
    public JDA configure(@NotNull String token) throws InterruptedException {
        return JDABuilder.createDefault(token)
                .build()
                .awaitReady();
    }

}
