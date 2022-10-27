package Ung_dung_JAVA_Collection.Quan_ma;

public class Pair<T,S> {
    private T first;
    private S second;

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
}
