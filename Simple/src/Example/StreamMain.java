package Example;
import java.util.*;

public class StreamMain {
    static List<String> places = new ArrayList<>();

    public static List<String> getPlaces() {
        places.add("TamilNadu,Chennai");
        places.add("TamilNadu,Coimbatore");
        places.add("TamilNadu,Tiruppur");
        places.add("TamilNadu,Erode");
        
        return places;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> myPlaces = getPlaces();
        System.out.println("Places from TamilNadu");
        myPlaces.stream()
                .filter((p) -> p.startsWith("TamilNadu"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }
}
