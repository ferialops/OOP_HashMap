package kunakhova_a_y.vsu.ru;

import java.util.Objects;

public final class Bucket<K, V> {
    private final K key;
    private V value;
    private Bucket<K, V> next;

    public Bucket(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Bucket(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Bucket<K, V> next) {
        this.next = next;
    }

    public Bucket<K, V> getNext() {
        return next;
    }

    @Override
    public int hashCode() {
        return Math.abs(Objects.hashCode(key));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
