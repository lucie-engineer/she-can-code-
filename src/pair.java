public class pair<K, V> {
    private K key;
    private V value;

    public pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return "(Key: " + key + ", Value: " + value + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof pair<?, ?>)) return false;
        pair<?, ?> other = (pair<?, ?>) obj;
        return key.equals(other.key) && value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(key, value);
    }

}
