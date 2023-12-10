public class Melodrama extends Movies {

    private int episodesNumb;

    private String achievements;


    public Melodrama(String name, int episodesNumb, String achievements) {
        super(name);
        this.episodesNumb = episodesNumb;
        this.achievements = achievements;
    }

    @Override
    public void print() {
        System.out.println(" Серий в фильме: " + episodesNumb +
                "\n Достижения фильма: " + achievements);

    }
}
