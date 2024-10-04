package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex15 {

    public static void main(String[] args) {

        Repository<Object, Object> repository = new Repository<>();
        repository.add(1, "Primul obiect");
        repository.add(2, "Al doilea obiect");
        repository.add("Nimic", 28);


        System.out.println("Obiect găsit pentru id 1: " + repository.get(1));
        System.out.println("Obiect găsit pentru id 2: " + repository.get(2));
        System.out.println("Obiect găsit pentru id Nimic: " + repository.get("Nimic"));

        repository.remove(1);
        System.out.println("După ștergerea id-ului 1: " + repository.get(1));

    }

}

class Repository<T, K> {

    private final Map<T, K> hashMap;

    public Repository() {
        this.hashMap = new HashMap<>();
    }

    public void add(T id, K object) {
        hashMap.put(id, object);
    }

    public K get(T id) {
        return hashMap.get(id);
    }

    public void remove(T id) {
        hashMap.remove(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repository<?, ?> that = (Repository<?, ?>) o;
        return Objects.equals(hashMap, that.hashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashMap);
    }

    @Override
    public String toString() {
        return "Repository{" + "hashMap=" + hashMap + '}';
    }
}
