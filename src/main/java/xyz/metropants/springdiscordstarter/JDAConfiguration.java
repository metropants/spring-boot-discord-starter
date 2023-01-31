package xyz.metropants.springdiscordstarter;

import net.dv8tion.jda.api.JDA;
import org.jetbrains.annotations.NotNull;

public interface JDAConfiguration {

    /**
     * @param token The provided bot token from application configuration file.
     * @return A JDA instance.
     */
    JDA configure(@NotNull String token) throws InterruptedException;

}
