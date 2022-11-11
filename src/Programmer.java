public class Programmer extends Person{
    private String companyName;
    private String coding;


    public Programmer(String name, String designation, String learn, int walk, String eat, String companyName, String coding) {
        super(name, designation, learn, walk, eat);
        this.companyName=companyName;
        this.coding=coding;
    }
    public String companyName(){
        return companyName;
    }
    public String coding(){
        return coding;
    }



}
