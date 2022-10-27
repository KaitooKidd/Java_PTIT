package File.DS_SP2;

public class SP implements Comparable<SP>{
    private String id,name;
    private int gia,bao_hanh;
    @Override
    public String toString() {
        return id+" "+name+" "+gia+" "+bao_hanh;
    }
    public String getId() {
        return id;
    }

    public int getGia() {
        return gia;
    }
    public SP(String id, String name, int gia, int bao_hanh) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.bao_hanh = bao_hanh;
    }

    @Override
    public int compareTo(SP o) {
        if(this.getGia() > o.getGia())
            return -1;
        if(this.getGia() == o.getGia())
            return this.id.compareTo(o.getId());
        return 0;
    }
}
