import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    @Test
    public void proveThatTheInitialPunctuationIs4(){
        Tamagotchi tamagotchi = new Tamagotchi();
        Assert.assertEquals(4,tamagotchi.hunger(4));
    }

}
