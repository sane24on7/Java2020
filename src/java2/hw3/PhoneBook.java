package java2.hw3;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (book.containsKey(name)) {
            book.get(name).add(phoneNumber);
        } else {
            Set<String> numbers = new HashSet<>();
            book.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return Collections.emptySet();
    }

}
