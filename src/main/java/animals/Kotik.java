package animals;

public class Kotik {

    private final static int METHODS = 5;

    private static int count = 0;
    private String name;
    private String voice;
    private int satiety;
    private double weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.voice.equals(kotik2.voice);
    }

    public String[] liveAnotherDay() {
        String[] activities = new String[24];

        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1: {
                    if(play()) {
                        activities[i] = i + " - играл";
                    } else {
                        activities[i] = i + " - ел";
                        eat();
                    }
                    break;
                }
                case 2:
                    if(sleep()) {
                        activities[i] = i + " - спал";
                    } else {
                        activities[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 3:
                    if(wash()) {
                        activities[i] = i + " - умывался";
                    } else {
                        activities[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 4:
                    if(walk()) {
                        activities[i] = i + " - гулял";
                    } else {
                        activities[i] = i + " - ел";
                        eat();
                    }
                    break;
                case 5:
                    if(hunt()) {
                        activities[i] = i + " - охотился";
                    } else {
                        activities[i] = i + " - ел";
                        eat();
                    }
            }
        }

        return activities;
    }

    public void eat() {
        eat(10, "еда");
    }

    public void eat(int satiety) {
        this.satiety += satiety;
    }

    public void eat(int satiety, String name) {
        this.satiety += satiety;
    }

    // ===================================================================================================================
    // = Implementation
    // ===================================================================================================================

    private boolean play() {
        return action(name, "играет");
    }

    private boolean sleep() {
        return action(name, "спит");
    }

    private boolean wash() {
        return action(name, "моется");
    }

    private boolean walk() {
        return action(name, "гуляет");
    }

    private boolean hunt() {
        return action(name, "охотится");
    }

    private boolean action(String name, String action) {
        if (satiety > 0) {
            System.out.printf("%s %s\n", name, action);
            satiety--;
            return true;
        } else {
            System.out.printf("%s хочет кушать\n", name);
            return false;
        }
    }
}
