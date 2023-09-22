import java.util.*;

public class TelephoneNum {
    Map<String, List<String>> map = new HashMap<>();

    void add(String telNumber, String name) {
        if (map.containsKey(name)) {
            List<String> telNumbers = map.get(name);
            telNumbers.add(telNumber);
            map.put(name, telNumbers);


        } else {
            List<String> telNumbers = new ArrayList<>();
            telNumbers.add(telNumber);
            map.put(name, telNumbers);

        }
    }

    String getAll(){
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> phoneNumbers = entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" : ");
            stringBuilder.append(phoneNumbers);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
