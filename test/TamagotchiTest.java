import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TamagotchiTest {

    @Test
    public void whenTamagotchiPlaysHesTired(){
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.play();
        String mood = tamagotchi.play();

        assertThat(mood, equalTo("(-_-)"));
    }

}
