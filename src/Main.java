public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Manas", "IOS devoloper", "IOS programming",
                12351, "fast food", "Google", "every day");
        System.out.println(programmer);
        Dancer dancer = new Dancer("Malika", "kyrgyz dancer", "another dance", 59874,
                "vecetables food", "Ala-Too kyzdary", "every single day");
        System.out.println(dancer);
        Singer singer = new Singer("Maks", "Rep singer", "vocal", 12345, "Healthy food",
                "Solo", "Rep", "He in love with play gitar");
        System.out.println(singer);

    }
}