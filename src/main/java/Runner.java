public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Balu", 25, 99.1, 'f');
        String name = bear.getName();
        System.out.println(name);

        bear.setName("Baloo");
        name = bear.getName();
        System.out.println(name);
    }
}
