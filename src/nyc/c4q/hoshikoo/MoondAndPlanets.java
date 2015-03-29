package nyc.c4q.ac21;


import java.util.HashMap;

/**
 * Created by Hoshiko on 3/29/15.
 */
public class MoondAndPlanets {

    public static void main(String[] args){

        System.out.println(getNumberOfMoons());
        System.out.println(isPlanet("Earth"));
        System.out.println(getNumberOfMoons("Earth"));
    }
    public static HashMap<String, Integer> getNumberOfMoons(){
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();

        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);

        return  numberOfMoons;

    }

    public static int getNumberOfMoons(String planet) {

        return getNumberOfMoons().get(planet);
    }

    public static boolean isPlanet(String name) {
        if(getNumberOfMoons().get(name)==null){
            return false;
        }
            return true;

    }
}
