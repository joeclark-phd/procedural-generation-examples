import net.joeclark.proceduralgeneration.DoubleTextGenerator;
import net.joeclark.proceduralgeneration.MarkovTextGenerator;
import net.joeclark.proceduralgeneration.RandomDrawGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main (String[] args) {

        MarkovTextGenerator markov;
        DoubleTextGenerator doubler;
        RandomDrawGenerator randomdraw;


        System.out.println("Examples of random text using MarkovTextGenerator");
        System.out.println();

        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/romans.txt"))) {
            markov = new MarkovTextGenerator(stream);
            System.out.println("ROMAN NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/romans.txt"))) {
            markov = new MarkovTextGenerator(stream);
            System.out.println("ROMAN NAMES ENDING IN -ia:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne(4,12,null,"ia"));
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/vikings_male.txt"))) {
            markov = new MarkovTextGenerator(stream);
            System.out.println("VIKING MALE NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/vikings_female.txt"))) {
            markov = new MarkovTextGenerator(stream);
            System.out.println("VIKING FEMALE NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Examples of random text using RandomDrawGenerator");
        System.out.println();


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/uk.txt"))) {
            randomdraw = new RandomDrawGenerator(stream);
            System.out.println("RANDOM DRAW UK SURNAMES");
            for(int i=0;i<10;i++) {
                System.out.println(randomdraw.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Examples of random text using DoubleTextGenerator");
        System.out.println();

        try(Stream<String> firstStream = Files.lines(Paths.get("src/main/resources/vikings_male.txt"));
            Stream<String> secondStream = Files.lines(Paths.get("src/main/resources/romans.txt"))) {

            doubler = new DoubleTextGenerator(new MarkovTextGenerator(firstStream),new MarkovTextGenerator(secondStream),null);
            System.out.println("VIKING MALE MARKOV TEXT + ROMAN MARKOV TEXT:");
            for(int i=0;i<10;i++) {
                System.out.println(doubler.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Stream<String> firstStream = Files.lines(Paths.get("src/main/resources/vikings_female.txt"));
            Stream<String> secondStream = Files.lines(Paths.get("src/main/resources/uk.txt"))) {

            doubler = new DoubleTextGenerator(new MarkovTextGenerator(firstStream),new RandomDrawGenerator(secondStream),null);
            System.out.println("VIKING FEMALE MARKOV TEXT + RANDOM DRAW UK SURNAME:");
            for(int i=0;i<10;i++) {
                System.out.println(doubler.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
