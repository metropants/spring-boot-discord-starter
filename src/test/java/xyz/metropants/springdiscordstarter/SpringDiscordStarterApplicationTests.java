package xyz.metropants.springdiscordstarter;

import net.dv8tion.jda.api.JDA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {DiscordConfig.class})
class SpringDiscordStarterApplicationTests {

    @Autowired
    private JDA jda;

    @Test
    void testJDABeanCreated() {
        assertNotNull(this.jda);
    }

    @Test
    void testCustomJDAConfiguration() {
        String name = Objects.requireNonNull(this.jda.getPresence().getActivity()).getName();
        assertEquals(DiscordConfig.ACTIVITY_NAME, name);
    }

}
