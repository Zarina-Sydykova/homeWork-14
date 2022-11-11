public class Singer extends Person {
    private String bandName;
    private String singging;
    private String playGitar;


    public Singer(String name, String designation, String learn, int walk, String eat, String bandName, String singging, String playGitar) {
        super(name, designation, learn, walk, eat);
        this.bandName = bandName;
        this.singging = singging;
        this.playGitar = playGitar;
    }

    public String bandName(){
        return bandName;
    }
    public String singging(){
        return singging;
    }
    public String playGitar(){
        return playGitar;
    }
}


