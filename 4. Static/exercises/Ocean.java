package exercises;

public class Ocean {
    public static void main(String[] args) {
        SeaCreature spongeBob = new SeaCreature("Spongebob");
        spongeBob.eat();
        spongeBob.laugh();

        SeaCreature patrick = new SeaCreature("Patrick");
        SeaCreature squidward = new SeaCreature("Squidward");

        System.out.println(patrick.getName());
        patrick.laugh();

        System.out.println(squidward.getName());
        squidward.laugh();

    }
}
