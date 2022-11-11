public class Dancer extends Person{
    private String groupName;
    private String dancing;


    public Dancer(String name, String designation, String learn, int walk, String eat, String groupName, String dancing) {
        super(name, designation, learn, walk, eat);
        this.groupName=groupName;
        this.dancing=dancing;
    }

    public String groupName(){
        return groupName;
    }
    public  String dancing(){
        return dancing;
    }
}
