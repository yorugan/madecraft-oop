package exercises;

public class Smurf {

    private static String name;

    public static Smurf createSmurf(String name) {
        if (Smurf.name != name) {
            System.out.println("Creating " + name + " Smurf");
        }
        return new Smurf(name);
    }

    public Smurf(String name) {
        if (Smurf.name != name) {
            System.out.println("Creating " + name + " Smurf");
            this.name = name;
        }
    }

//    private Smurf(String name) {
//        this.name = name;
//    }

    public void printName() {
        System.out.println("My name is " + name + " Smurf.");
    }

    public void eat() {
        System.out.println(name + " Smurf is eating Smurfberries.");
    }

}
