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

}
