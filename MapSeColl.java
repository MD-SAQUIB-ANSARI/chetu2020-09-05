package Collection;

import java.util.HashMap;

public class MapSeColl {
    public static void main(String[] args) {
        HashMap<String,Integer> pin=new HashMap<>();
        System.out.println("this is for bihar district");
        pin.put("PATNA",81234);
        pin.put("BHAGALPUR",812001);
        System.out.println("andhara p");
        pin.put("Ananthapur\t515001",515001);
        pin.put("Cuddapah\t515465",515465);
        System.out.println("arunachal");
        pin.put("East Siang\t791102",791118);
        pin.put("Kurung Kumey\t791118",791102);
        pin.put("Central Delhi\t110001",110001);
        pin.put("New Delhi",112001);
        pin.put("South Delhi\t110003",110003);
        pin.put("East Delhi\t110031",110031);
        System.out.println("j and k");
        pin.put("Ananthnag\t191103",191103);
        pin.put("Jammu\t180001",810001);
        pin.put("Pulwama\t191112",91112);
        System.out.println("up");
        pin.put("Agra\t202124",202124);
        pin.put("Gorakhpur\t273001",273001);
        pin.put("Hathras\t202002",202002);
        System.out.println("bengole");
        pin.put("Howrah\t711101",711101);
        pin.put("Kolkata\t700001",700001);
        System.out.println("Maharashtra");
        pin.put("Thane\t400601",400601);
        pin.put("Mumbai\t400001",400001);
        System.out.println("tamil nampdu");
        pin.put("Vellore\t604407",604407);
        pin.put("Coimbatore\t624622",624622);
        System.out.println(" ,"   +pin);

    }
}
