package File.DSMH;

public class Mon_hoc {
    private String id,name;
    private int tin_chi;

    public String getName() {
        return name;
    }

    public Mon_hoc(String id, String name, int tin_chi) {
        this.id = id;
        this.name = name;
        this.tin_chi = tin_chi;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tin_chi;
    }
}
