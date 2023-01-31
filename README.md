# spring-boot-discord-starter
Simple way to add discord JDA to any spring boot project.

# Download

Using gradle:
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
  
dependencies {
    implementation 'com.github.metropants:spring-boot-discord-starter:VERSION'
}
```

Using maven:
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.metropants</groupId>
  <artifactId>spring-boot-discord-starter</artifactId>
  <version>VERSION</version>
</dependency>
```

# Usage
Usage without a custom JDA configuration:
```java
@Configuration
@EnableDiscord
public class DiscordConfig {

}
```

Usage with a custom JDA configuratio:
```java
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
```
