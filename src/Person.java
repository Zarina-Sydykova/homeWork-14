public class Person {
    private String name;
    private String designation;
    private String learn;
    private int walk;
    private String eat;

    public Person(String name, String designation, String learn, int walk, String eat) {
        this.name = name;
        this.designation = designation;
        this.learn = learn;
        this.walk = walk;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public int getWalk() {
        return walk;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", learn='" + learn + '\'' +
                ", walk=" + walk +
                ", eat='" + eat + '\'' +
                '}';
    }
}
