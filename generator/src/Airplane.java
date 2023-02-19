import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Airplane {

    public void main(String[] args) {
        List<String> ownersList = textReader("owner_location.txt");
        List<String> contentList = textReader("cities_hotels.txt");

        List<String> owners = new ArrayList<>();
        List<String> locations = new ArrayList<>();
        for (String owner : ownersList) {
            String[] temp = owner.split(":");
            owners.add(temp[1]);
            locations.add(temp[0]);
        }

        List<String> destinationList = new ArrayList<>();
        for (String content : contentList) {
            if (content.equals("")) {
                continue;
            }
            String[] divide = content.split(",");
            if (divide.length > 1) {
                destinationList.add(divide[0]);
            }
        }

        int counter = 0;
        Random random = new Random();
        System.out.println("INSERT INTO airplanes (name, owner, destination, departurepoint, departuretime, arrivaltime) VALUES ");
        for (int i = 0; i < destinationList.size(); i++) {
            counter++;
            String destination = destinationList.get(i);
            String owner = owners.get(random.nextInt(owners.size()));
            String location = locations.get(random.nextInt(locations.size()));
            String departureTime = randomTime();
            String arrivalTime = randomTime();

            if (i == destinationList.size() - 1) {
                System.out.println(String.format("('%s', '%s', '%s', '%s', '%s', '%s');",
                        randomName(), owner, destination, location, departureTime, arrivalTime));
            } else {
                System.out.println(String.format("('%s', '%s', '%s', '%s', '%s', '%s'),",
                        randomName(), owner, destination, location, departureTime, arrivalTime));
            }
        }
    }

    public static List<String> textReader(String location) {
        List<String> listIn = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(location));
            String line = reader.readLine();
            while (line != null) {
                listIn.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listIn;
    }

    public static String randomTime() {
        Random random = new Random();
        int hour1 = random.nextInt(3);
        int hour2 = random.nextInt(hour1 == 2 ? 4 : 10);
        int minute1 = random.nextInt(6);
        int minute2 = random.nextInt(2) == 0 ? 0 : 5;
        return String.format("%d%d:%d%d:00", hour1, hour2, minute1, minute2);
    }

    public static String randomName() {
        Random random = new Random();
        String name = "";
        for (int i = 0; i < random.nextInt(2) + 2; i++) {
            name += (char) (random.nextInt(26) + 'A');
        }
        return name + "-" + (random.nextInt(990) + 10);
    }
}