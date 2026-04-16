import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }
}
