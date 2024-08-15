public class Triangle {
    int katet1;
    int katet2;
    int gipotenuza;

    public Triangle(int katet1, int katet2, int gipotenuza) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = gipotenuza;
    }
    public Triangle(){}
    public int getKatet1() {
        return katet1;
    }

    public void setKatet1(int katet1) {
        this.katet1 = katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public void setKatet2(int katet2) {
        this.katet2 = katet2;
    }

    public int getGipotenuza() {
        return gipotenuza;
    }

    public void setGipotenuza(int gipotenuza) {
        this.gipotenuza = gipotenuza;
    }
}
