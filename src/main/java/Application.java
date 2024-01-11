import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Барсик", "Мяу", 15, 4.0);

        Kotik kotik2 = new Kotik();
        kotik2.setName("Мурзик");
        kotik2.setVoice("Мур");
        kotik2.setSatiety(3);
        kotik2.setWeight(3.7);

        String[] catActivities = kotik2.liveAnotherDay();
        for (String activity : catActivities) {
            System.out.println(activity);
        }

        System.out.printf("%s, %s\n", kotik1.getName(), kotik1.getWeight());
        System.out.println(Kotik.compareVoice(kotik1, kotik2));
        System.out.println(Kotik.getCount());
    }
}
