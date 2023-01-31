package xyz.metropants.springdiscordstarter;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.metropants.springdiscordstarter.annotation.EnableDiscord;

@Configuration
@EnableDiscord
public class DiscordConfig {

    public static final String ACTIVITY_NAME = "with Spring Discord Starter!";

    @Bean
    public JDAConfiguration configuration() {
        return (token) -> JDABuilder.createDefault(token)
                .setActivity(Activity.playing(ACTIVITY_NAME))
                .build();
    }

}
