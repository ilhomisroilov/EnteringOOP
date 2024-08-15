public class Car {
    String rangi;
    String modeli;
    int narxi;
    String uzatmaQutisi;

    public Car(String modeli, String rangi, int narxi, String uzatmaQutisi) {
        this.rangi = rangi;
        this.modeli = modeli;
        this.narxi = narxi;
        this.uzatmaQutisi = uzatmaQutisi;
    }
    public Car(){}

    public String getRangi() {
        return rangi;
    }

    public void setRangi(String rangi) {
        this.rangi = rangi;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public int getNarxi() {
        return narxi;
    }

    public void setNarxi(int narxi) {
        this.narxi = narxi;
    }

    public String getUzatmaQutisi() {
        return uzatmaQutisi;
    }

    public void setUzatmaQutisi(String uzatmaQutisi) {
        this.uzatmaQutisi = uzatmaQutisi;
    }
}
