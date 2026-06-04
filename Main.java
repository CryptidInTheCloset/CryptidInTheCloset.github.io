// Write JavaScript here
import java.util.Random;
import java.lang.System;
import java.util.HashMap;

public class Main {

    static Random rand = new Random();
    static HashMap<String, String[]> nameMap = new HashMap<String, String[]>();

    //arrays that apply to all characters
    static String[] genders = {"Male", "Female", "Enby"};
    static String[] pelts = {"ginger", "grey", "black"};
    static String[] rank = {"warrior", "warrior", "warrior", "warrior", "warrior", "medcat", "apprentice", "leader", "kit"};
    static String[] clan = {"thunder", "river", "shadow", "wind"};

    //class-specific arrays
    static String[] gingerNames = {"Fire", "Flame", "Lion", "Red", "Blaze"};
    static String[] greyNames = {"Grey", "Cloudy", "Fog", "Rock", "Stone"};
    static String[] blackNames = {"Night", "Raven", "Crow", "Dark", "Shade"};
    static String[] suffix = {"claw", "fur", "foot", "tail"};
    
    //randomly choose an element of an array
    public static String randomize(String[] randomArray) {
        return randomArray[rand.nextInt(randomArray.length)];
    }

    //capitalize first letter of string
    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    //choose a prefix
    public static String givePrefix(String pelt) {
        String prefixList = pelt + "Prefixes";
        if (pelt == "ginger") {
            return randomize(nameMap.get(nameList));
        }
        else if (pelt == "grey") {
            return randomize(nameMap.get(nameList));
        }
        else (pelt == "black") {
            return randomize(nameMap.get(nameList));
        }
    }

     //choose a suffix
    public static String giveSuffix(String rank) {
        String suffixList = rank + "Suffix";
        if (rank == "kit") {
            return (nameMap.get(nameList));
        }
        else if (rank == "leader") {
            return (nameMap.get(nameList));
         }
        else if (rank == "apprentice") {
            return (nameMap.get(nameList));
             }
        else if (rank == "medcat") {
            return randomize(nameMap.get(nameList));
        }
        else (rank == "warrior") {
            return randomize(nameMap.get(nameList));
        }
    }

    public static void main(String[] args) {

        nameMap.put("gingerPrefixes", new String[] {"Fire", "Ginger", "Flame", "Blaze", "Red"});
        nameMap.put("greyPrefixes", new String[] {"Grey", "Cloudy", "Fog", "Rock", "Stone"});
        nameMap.put("blackPrefixes", new String[] {"Night", "Raven", "Crow", "Dark", "Shade"});

        nameMap.put("warriorSuffix", new String[] {"heart", "claw", "foot", "tail", "pelt"});
        nameMap.put("medcatSuffix", new String[] {"berry", "leaf", "root"});
        nameMap.put("leaderSuffix", new String[] {"star"});
        nameMap.put("apprenticeSuffix", new String[] {"paw"});
        nameMap.put("kitSuffix", new String[] {"kit"});

        String gender = randomize(genders);
        String pelt = randomize(pelt);
        String rank= randomize(rank);
        String prefix = givePrefix(race, gender);   
        String suffix = giveSuffix(rank);
        String clan = randomize(clan);

        System.out.println(prefix + suffix "is a " + pelts + " " + gender + " " + rank + "of " + clan);
    }

}
