package Assignment3;

public class q01Pair<K, V> {
    private K key;
    private V value;

    public q01Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        q01Pair<String, Integer> pair1 = new q01Pair<>("First", 1);
        q01Pair<String, Double> pair2 = new q01Pair<>("Second", 2.0);

        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}