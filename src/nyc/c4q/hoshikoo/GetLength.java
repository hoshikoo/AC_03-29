package nyc.c4q.ac21;

/**
 * Created by Hoshiko on 3/29/15.
 */

import java.util.ArrayList;
import java.util.HashMap;


public class GetLength {

    public static HashMap<String, Integer> getLengths(ArrayList<String> words) {

        HashMap<String, Integer> lengths = new HashMap<String, Integer>();
        //ArrayList<String> words = new ArrayList<String>();

        int wordsLength = 0;

        for (int i : words.size()) {
            wordsLength = words(i).length;
            lengths.put(words(i), wordsLength);
        }

        return lengths;

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("banana");
        words.add("pineapple");
        words.add("cantaloupe");

        HashMap<String, Integer> lengths = getLengths(words);
        System.out.println(lengths.get("banana"));      // should print 6
        System.out.println(lengths.get("cantaloupe"));  // should print 10
        System.out.println(lengths.get("broccoli"));    // should print null

    }

}