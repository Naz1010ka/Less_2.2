public class Comedy extends Movies{

    private  String filmDirector;
    private  int yearOfIssue;


    public Comedy(String name, String filmDirector, int yearOfIssue) {
        super(name);
        this.filmDirector = filmDirector;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void print() {
        System.out.println(" Режисер фильма: " + filmDirector +
        "\n Год выпуска: " + yearOfIssue);

    }
}
