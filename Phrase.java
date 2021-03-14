package beer;

public class Phrase {

    public static void main(String[] args) {
        String[] first = {"flexible", "super","top-tier","advanced","classic"};
        String[] second = {"funky","lazy","crazy","haunted","strange"};
        String[] third = {"cat","dude","car","carrot","store"};

        int firstRand = (int) (Math.random() * first.length);
        int secondRand = (int) (Math.random() * second.length);
        int thirdRand = (int) (Math.random() * third.length);

        String phrase = first[firstRand] + " " + second[secondRand] + " " + third[thirdRand];
        System.out.println("What we need is a " +phrase);
    }
}
