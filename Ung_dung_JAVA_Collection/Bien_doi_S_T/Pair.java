package Ung_dung_JAVA_Collection.Bien_doi_S_T;

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

