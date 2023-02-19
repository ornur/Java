import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Hotels {
    public static List<String> textreader(String locate) {
        List<String> list_in = new ArrayList<>();
        try {
            File myObj = new File(locate);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list_in.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list_in;
    }

    public void main(String[] args) {
        List<String> content_list = textreader("cities_hotels.txt"); // creating list without editing
        List<String> optional_list = textreader("optional.txt"); // creating list without editing

        List<String> destination_list = new ArrayList<>(); // for saving sorted lists
        List<String> hotel_names = new ArrayList<>(); // for saving sorted lists

        for (String content : content_list) {
            if (content.equals("")) {
                content_list.remove(content);
            }
        }

        for (String content : content_list) {
            if (content.contains(":")) {
                String[] divide = content.split(",");
                destination_list.add(divide[0]);
            }
            if (!content.contains(":")) {
                hotel_names.add(content);
            }
        }

        // making dictionary of 2 lists
        Map<String, List<String>> res = new HashMap<>();
        int counter = 0;
        for (int destination = 0; destination < destination_list.size(); destination++) {
            List<String> triple = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                triple.add(hotel_names.get(counter));
                counter++;
            }
            res.put(destination_list.get(destination), triple);
        }

        // printing output in insert into SQL
        counter = 0;
        System.out.println("INSERT INTO hotels (name, location, starcount, isbreakfastincluded, optionalservices) VALUES ");
        for (Map.Entry<String, List<String>> entry : res.entrySet()) {
            String location = entry.getKey();
            List<String> name = entry.getValue();
            for (int i = 0; i < 3; i++) {
                counter++;
                System.out.println(counter);
                int starcount = new Random().nextInt(5) + 1;
                boolean breakfast = new Random().nextBoolean();
                String options = optional_list.get(new Random().nextInt(optional_list.size())) + ", " +
                        optional_list.get(new Random().nextInt(optional_list.size()));
                if (name.get(i).equals(res.get(res.keySet().toArray()[res.size() - 1]).get(2))) {
                    System.out.println("('" + name.get(i) + "', '" + location + "', '" + starcount + "', '" +
                            breakfast + "', '" + options + "' );");
                } else {
                    System.out.println("('" + name.get(i) + "', '" + location + "', '" + starcount + "', '" +
                            breakfast + "', '" + options + "' ),");
                }
            }
        }
    }
}
