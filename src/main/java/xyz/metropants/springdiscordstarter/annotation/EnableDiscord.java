package xyz.metropants.springdiscordstarter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import xyz.metropants.springdiscordstarter.JDAConfiguration;
import xyz.metropants.springdiscordstarter.JDAConfigurationProvider;

import java.lang.annotation.*;

/**
 * Enables the {@link JDAConfigurationProvider} for creation of the JDA bean using {@link JDAConfiguration} interface.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan("xyz.metropants.springdiscordstarter")
@Import(JDAConfigurationProvider.class)
@Documented
public @interface EnableDiscord {

}
