package kunakhova_a_y.vsu.ru;

import java.util.Objects;

public class EntrySet<V> {
    private final V value;

    private EntrySet<V> next;

    public EntrySet<V> getNext() {
        return next;
    }

    public void setNext(EntrySet<V> next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public EntrySet(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
