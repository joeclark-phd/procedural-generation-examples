import net.joeclark.proceduralgeneration.DoubleTextGenerator;
import net.joeclark.proceduralgeneration.MarkovTextCasePreservingGenerator;
import net.joeclark.proceduralgeneration.MarkovTextGenerator;
import net.joeclark.proceduralgeneration.RandomDrawGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main (String[] args) {

        logger.info("Beginning to run examples of random text generation");

        MarkovTextGenerator markov;
        DoubleTextGenerator doubler;
        RandomDrawGenerator randomdraw;


        System.out.println("Examples of random text using MarkovTextGenerator");
        System.out.println();

        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/romans.txt"))) {
            markov = new MarkovTextGenerator().train(stream);
            System.out.println("ROMAN NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/romans.txt"))) {
            markov = new MarkovTextGenerator().withEndFilter("ia").train(stream);
            System.out.println("ROMAN NAMES ENDING IN -ia:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/vikings_male.txt"))) {
            markov = new MarkovTextGenerator().train(stream);
            System.out.println("VIKING MALE NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/vikings_female.txt"))) {
            markov = new MarkovTextGenerator().train(stream);
            System.out.println("VIKING FEMALE NAMES:");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Examples of random text using MarkovTextCasePreservingGenerator");
        System.out.println();

        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/uk_surnames.txt"))) {
            markov = new MarkovTextCasePreservingGenerator().train(stream);
            System.out.println("UK SURNAMES (case preserved):");
            for(int i=0;i<10;i++) {
                System.out.println(markov.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Examples of random text using RandomDrawGenerator");
        System.out.println();


        try(Stream<String> stream = Files.lines(Paths.get("src/main/resources/uk_surnames.txt"))) {
            randomdraw = new RandomDrawGenerator().train(stream);
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

            doubler = new DoubleTextGenerator(new MarkovTextGenerator().train(firstStream),new MarkovTextGenerator().train(secondStream),null);
            System.out.println("VIKING MALE MARKOV TEXT + ROMAN MARKOV TEXT:");
            for(int i=0;i<10;i++) {
                System.out.println(doubler.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Stream<String> firstStream = Files.lines(Paths.get("src/main/resources/vikings_female.txt"));
            Stream<String> secondStream = Files.lines(Paths.get("src/main/resources/uk_surnames.txt"))) {

            doubler = new DoubleTextGenerator(new MarkovTextGenerator().train(firstStream),new RandomDrawGenerator().train(secondStream),null);
            System.out.println("VIKING FEMALE MARKOV TEXT + RANDOM DRAW UK SURNAME:");
            for(int i=0;i<10;i++) {
                System.out.println(doubler.generateOne());
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("Finished running examples of random text generation.");

    }

}
