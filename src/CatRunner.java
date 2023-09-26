public class CatRunner {
    public static void main(String[] args)  {
        Cat cat1 = new Cat("Dora", 3,13.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Golf", 5,18.7);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
