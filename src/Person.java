public class Person {
     String ismi;
     int yoshi;
     String jinsi;
     String manzili;
     String telefonRaqami;
     String email;

    public Person(String ismi, int yoshi, String jinsi, String manzili, String telefonRaqami, String email) {
        this.ismi = ismi;
        this.yoshi = yoshi;
        this.jinsi = jinsi;
        this.manzili = manzili;
        this.telefonRaqami = telefonRaqami;
        this.email = email;
    }
    public Person (){}

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public int getYoshi() {
        return yoshi;
    }

    public void setYoshi(int yoshi) {
        this.yoshi = yoshi;
    }

    public String getJinsi() {
        return jinsi;
    }

    public void setJinsi(String jinsi) {
        this.jinsi = jinsi;
    }

    public String getManzili() {
        return manzili;
    }

    public void setManzili(String manzili) {
        this.manzili = manzili;
    }

    public String getTelefonRaqami() {
        return telefonRaqami;
    }

    public void setTelefonRaqami(String telefonRaqami) {
        this.telefonRaqami = telefonRaqami;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
