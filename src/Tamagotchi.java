public class Tamagotchi {

    private int hunger = 4;
    private int energy = 4;
    private int mood = 4;


    public String play() {
        energy -= 1;
        if (energy < 3) {
            return "(-_-)";
        }
        return ":-|";
    }
}
