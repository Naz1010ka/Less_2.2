public class Main {
    public static void main(String[] args) {

        Movies[] movies = new Movies[3];
        movies[0] = creatObject("Comedy");
        movies[1] = creatObject("Melodrama");
        movies[2] = creatObject("Fantastic");

        Printable[] printables = {movies[0], movies[1], movies[2]};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();

        }

    }

    private static Movies creatObject(String className){
        Movies obj = null;
        switch (className){
            case "Comedy":
                obj = new Comedy("«SuperПерцы»", " Грега Моттола", 2007);
                break;
            case "Melodrama":
                obj = new Melodrama("Зимородок",36,"best series of 2023");
                break;
            case "Fantastic":
                obj = new Fantastic("Avatar", "action","Oscar nomination");
                break;
        }
        return obj;
    }
}