import net.joeclark.proceduralgeneration.MarkovTextGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Examples of random text using MarkovTextGenerator");
        MarkovTextGenerator markov;


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



    }

}
